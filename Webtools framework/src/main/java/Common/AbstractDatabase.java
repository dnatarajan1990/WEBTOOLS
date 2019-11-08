package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertTrue;

public class AbstractDatabase extends TestManager  {
    protected final int ARTIFICIAL_GATEWAY_ID = 47;
    protected final String ARTIFICIAL_GATEWAY_NAME = "autoName";
    protected final String ARTIFICIAL_GATEWAY_DESCRIPTION = "autoDescription";
    protected final String ARTIFICIAL_GATEWAY_TYPE = "HVG";
    protected final String ARTIFICIAL_GATEWAY_SERVER = "autoServer";

    protected WebDriver driver;

    protected HomePage homePage;
    protected LoginPage loginPage;

    private String username;
    private String password;

    private boolean logAsAdminViewOnly;


    protected void logInToApplication() throws InterruptedException {
        driver = getDriver();

        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);

        username = getProperty(DATABASE_PROPERTIES, logAsAdminViewOnly ? ADMIN_VIEW_ONLY_USER : ADMIN_USER);
        password = getProperty(DATABASE_PROPERTIES, logAsAdminViewOnly ? ADMIN_VIEW_ONLY_USER_PASSWORD : ADMIN_USER_PASSWORD);

        driver.manage().window().maximize();
        driver.navigate().to(getProperty(GLOBAL_PROPERTIES, URL));
        loginPage.waitForElement(loginPage.getInputUsername());

        assertTrue("Login Page of DTS Electralink application isn't displayed",
                loginPage.getInputUsername().isDisplayed() && loginPage.getInputPassword().isDisplayed());

        loginPage.login(username, password);
        homePage.waitForLogin();

        assertTrue("Home Page of DTS Electralink application isn't displayed", homePage.getLogoutButton().isDisplayed());
    }

    protected void logIn() {
        loginPage.login(username, password);
        homePage.waitForLogin();
    }

    protected void waitMiliseconds(long milisecond) {
        try {
            Thread.sleep(milisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void setUserAsAdmin() {
        this.logAsAdminViewOnly = false;
    }

    protected void setUserAsAdminViewOnly() {
        this.logAsAdminViewOnly = true;
    }

    protected void insertArtificialGateway() {
        runSqlStatement("insert into gateway (gw_num, gw_name, gw_desc, gw_type, gw_server) " +
                "values (" + ARTIFICIAL_GATEWAY_ID + ", '" + ARTIFICIAL_GATEWAY_NAME + "', '" + ARTIFICIAL_GATEWAY_DESCRIPTION + "', '" + ARTIFICIAL_GATEWAY_TYPE + "', '" + ARTIFICIAL_GATEWAY_SERVER + "')");

        //go to ftp site and then go back to gateway to reload gateway list
        homePage.clickOnDbFtp();
        waitMiliseconds(100);
        homePage.clickOnDbGateway();
        waitMiliseconds(1000);
    }

    protected void deleteGateway(int gatewayNum) {
        runSqlStatement("delete from gateway where gw_num = " + gatewayNum);
    }

    protected void deleteArtificialGateway() {
        deleteGateway(ARTIFICIAL_GATEWAY_ID);
    }

    protected void waitForToastDisappearing() {
        waitMiliseconds(3000);
    }
}


}
