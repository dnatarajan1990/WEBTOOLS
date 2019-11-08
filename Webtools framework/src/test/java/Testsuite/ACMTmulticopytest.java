package Testsuite;

import Common.TestManager;
import Pageobject.*;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Common.PropertiesClass.*;
import static org.junit.Assert.assertTrue;

public class ACMTmulticopytest extends TestManager {


    final String EDS_ROLE = "1 : Role 1";
    final String TA02_MPID = "tA02";
    final String MPID_01 = MpidList.OI.getMpid();
    final String D0065 = "D0065 : Confirmation of Receipt of a Regist...";
    final String D0011 = DFlowList.D0011.getDflow();
    final String OPER_TEST_FLAG ="OPER";
    final String TR01_TEST_FLAG = "TR01";
    final String TESTGW01 = "TESTGW01";
    final String ADMINTEST_HOST = "ADMIN";
    final String POOL_TRANSFER_FORMAT = "Elec - Pool Transfer";



    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    //AcmtRestorePage acmtRestorePage;
    AcmtRoutesPage acmtRoutesPage;
    AcmtNewRoutePage acmtNewRoutePage;
    AcmtSingleEditPage acmtSingleEditPage;
    AcmtMultiCopyPage acmtMultiCopyPage;

    String username;
    String password;
    String url;


    String AllDropdownOption;

    @BeforeClass
    public void setUp() throws InterruptedException, NullPointerException {
        driver = getDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);

        //acmtRestorePage = PageFactory.initElements(driver, AcmtRestorePage.class);
        acmtRoutesPage = PageFactory.initElements(driver, AcmtRoutesPage.class);
        acmtNewRoutePage = PageFactory.initElements(driver, AcmtNewRoutePage.class);
        acmtSingleEditPage = PageFactory.initElements(driver, AcmtSingleEditPage.class);
        acmtMultiCopyPage = PageFactory.initElements(driver, AcmtMultiCopyPage.class);
        username = getProperty(USER_PROPERTIES, HP_USER);
        password = getProperty(USER_PROPERTIES, HP_USER_PASSWORD);
        AllDropdownOption = getProperty(USER_PROPERTIES, DROPDOWN_ALL_OPTION);
        url = getProperty(GLOBAL_PROPERTIES, URL);
        driver.manage().window().maximize();
        driver.navigate().to(url);

        homePage.loginToWebtools(username, password);

        homePage.clickOnAcmt();
        //homePage.clickOnRestore();
        //acmtRestorePage.waitForElement(acmtRestorePage.getInitialRestoreToDropdown());
        //acmtRestorePage.deleteRoute(TA02_MPID);
        homePage.clickOnRoutes();

        acmtNewRoutePage.createRoute(TA02_MPID,EDS_ROLE,D0065,OPER_TEST_FLAG,TESTGW01,ADMINTEST_HOST,POOL_TRANSFER_FORMAT);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        driver.quit();
    }

    @Test(priority = 0)
    public void navigationToMultiCopy() throws InterruptedException {
        //verify display in acmt routes with star
        acmtRoutesPage.selectVisibleOptionFromMenu(TA02_MPID,acmtRoutesPage.getToMpidDropdown());
        acmtRoutesPage.getSearchButton().click();
        //it is a problem to give good waiter for searching
        Thread.sleep(1000);
        acmtRoutesPage.markCheckboxOnGivenRout("",TA02_MPID,TESTGW01,ADMINTEST_HOST,OPER_TEST_FLAG);
        acmtRoutesPage.getCopyButton().click();
        acmtMultiCopyPage.waitForElement(acmtMultiCopyPage.getPreviewButton());
        assertTrue(acmtMultiCopyPage.getPreviewButton().isDisplayed());
    }
    @Test(priority = 1)
    public void verifyPreviewIsDisplayed() throws InterruptedException {
        acmtMultiCopyPage.selectVisibleOptionFromMenu(D0011,acmtMultiCopyPage.getFlowDropdown());
        acmtMultiCopyPage.selectVisibleOptionFromMenu(TR01_TEST_FLAG,acmtMultiCopyPage.getTestFlagDropdown());
        acmtMultiCopyPage.selectVisibleOptionFromMenu(MPID_01,acmtMultiCopyPage.getFromMpidDropdown());

        acmtMultiCopyPage.getPreviewButton().click();
        acmtMultiCopyPage.waitForElement(acmtMultiCopyPage.getDeleteButton());
        assertTrue(acmtMultiCopyPage.getDeleteButton().isDisplayed());
    }
    @Test(priority = 2)
    public void verifyCopiedRouteIsSavedAndDisplayed() throws InterruptedException {
        acmtMultiCopyPage.waitForElement(acmtMultiCopyPage.getSaveButton());
        acmtMultiCopyPage.getSaveButton().click();
        Thread.sleep(2000);
        acmtNewRoutePage.waitForElement(acmtNewRoutePage.getConfirmSaveButton());
        acmtNewRoutePage.getConfirmSaveButton().click();
        acmtRoutesPage.waitForElement(acmtRoutesPage.getNewButton());
        Thread.sleep(2000);
        assertTrue(acmtRoutesPage.verifyIsStarDisplayedForSingleNewRoute(MPID_01,TA02_MPID,TESTGW01,ADMINTEST_HOST,TR01_TEST_FLAG));
    }


}
 {
}
