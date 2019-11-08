package Listeners;

import Common.TestManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FailureListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {
        Object currentClass = iTestResult.getInstance();
        WebDriver driver = ((TestManager) currentClass).getDriver() ;
        Reporter.setCurrentTestResult(iTestResult);
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filename = this.getClass().getSimpleName() + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".jpg";
        try {
            System.setProperty("org.uncommons.reportng.escape-output", "false");
            FileUtils.copyFile(scrFile, new File("target/surefire-reports/html/screenshots/" + filename ));
            Reporter.log("<a href=\"screenshots/"+ filename +"\"><img src=\"screenshots/" + filename + "\" alt=\"\""+ "height='120' width='120'/>"+"<a />");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            //deleting old screenshots
            String files;
            File folder = new File("target/surefire-reports/html/screenshots/");
            File[] listOfFiles = folder.listFiles();

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -21);                    //21 days before
            for (int i = 0; i < listOfFiles.length; i++){
                if (listOfFiles[i].isFile()) {
                    files = listOfFiles[i].getName();
                    if ((files.endsWith(".png") || files.endsWith(".PNG")) && FileUtils.isFileOlder(listOfFiles[i], cal.getTime())) {
                        listOfFiles[i].delete();
                    }
                }
            }
        }

    }
    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}


