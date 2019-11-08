package Pageobject;

import Common.BaseMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static org.testng.AssertJUnit.assertTrue;

public class HomePage extends BaseMethods {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static final String PORTAL = "simple-dropdown-Portal";
    public static final String DFLOW_MASTER = "simple-dropdown-D-FlowMaster";
    public static final String DFLOW_MASTER_EDITOR = "child-simple-dropdown-Editor";
    public static final String DFLOW_MASTER_PREFERENCES = "child-simple-dropdown-Preferences";
    public static final String HOSTS = "child-simple-dropdown-Hosts";
    public static final String LOGOUT = ".btn.btn-primary.logout-btn";
    public static final String LOADING_SPINNER = "//i[@class = 'fa fa-cog fa-spin fa-5x']";
    public static final String PORTAL_HOST = "//a[contains(@data-target,'#collapsePH01')]/..";
    public static final String CURRENT_TIME = "//span[contains(@class,'current-time')]";
    public static final String PROFILE_BUTTON = "//button[@data-toggle='dropdown']";
    public static final String LOGOUT_BUTTON = "//button[contains(@ng-click,'logout')]";
    public static final String ACMT = "simple-dropdown-ACMT";
    public static final String ACMT_VIEW = "//*[contains(@id,'simple-dropdown-ACMT view')]";
    public static final String RESTORE = "child-simple-dropdown-Restore";
    public static final String ROUTES = "child-simple-dropdown-Routes";
    public static final String SUMMARY = "child-simple-dropdown-Summary";
    public static final String AUDIT = "simple-dropdown-Audit";
    public static final String AUDIT_MSGS = "child-simple-dropdown-Audit Msgs";
    public static final String SAVED_QUERIES = "child-simple-dropdown-Saved Queries";
    public static final String RE_COLLECT = "simple-dropdown-Re-collect";
    public static final String RE_SUBMIT = "simple-dropdown-Re-submit";
    public static final String USER = "#simple-User";
    public static final String MASTER = "simple-dropdown-D-FlowMaster";
    public static final String PREFERENCES = "child-simple-dropdown-Preferences";
    public static final String USER_GROUP = "//a[@id='simple-User Group']";
    public static final String VALIDATION = "#simple-dropdown-Validation";
    public static final String SYSTEM = "#simple-dropdown-System";
    public static final String STATS = "#simple-dropdown-Stats";
    public static final String MY_SETTINGS = "//a[@id='simple-dropdown-My Settings']";
    public static final String HELP = "#simple-Help";
    public static final String DOCUMENTS = "#simple-Documents";
    public static final String DATABASE = "simple-dropdown-Database";
    public static final String DB_FTP = "child-simple-dropdown-FTP";
    public static final String DB_FLOW = "child-simple-dropdown-Flow";
    public static final String DB_GW_ACCESS = "child-simple-dropdown-GW Access";
    public static final String DB_GATEWAY = "child-simple-dropdown-Gateway";
    public static final String DB_HOST = "child-simple-dropdown-Host";
    public static final String DB_MPAN_PREFIX = "child-simple-dropdown-MPAN Prefix";
    public static final String DB_MPID = "child-simple-dropdown-MPID";
    public static final String DB_ROLE = "child-simple-dropdown-Role";
    public static final String DB_TEST_FLAG = "child-simple-dropdown-Test Flag";
    public static final String DATA_SERVICES = "//a[@id='simple-dropdown-Data Services']";
    public static final String CONFIG = "#simple-Help";
    public static final String REPORTS = "#";
    public static final String BULLETIN = "#simple-Bulletin";
    public static final String ERROR_TOAST = "//body/div[@id='toast-container']";
    public static final String COLLECT_GROUPS = "(//a[@id='child-simple-dropdown-Groups'])[1]";
    public static final String COLLECT_REQUEST = "(//a[@id='child-simple-dropdown-Request'])[1]";
    public static final String COLLECT_STATUS = "(//a[@id='child-simple-dropdown-Status'])[1]";
    public static final String SUBMIT_GROUPS = "(//a[@id='child-simple-dropdown-Groups'])[2]";
    public static final String SUBMIT_REQUEST = "(//a[@id='child-simple-dropdown-Request'])[2]";
    public static final String SUBMIT_STATUS = "(//a[@id='child-simple-dropdown-Status'])[2]";
    public static final String GATEWAY_STATS = "//*[@id=\"simple-dropdown-Stats\"]/..//*[@id=\"child-simple-dropdown-Gateway\"]";
    public static final String CHECKIT = "simple-Check-it";

    public String userHome = System.getProperty("user.home");
    public String fileSeparator = System.getProperty("file.separator");
    public String userName = System.getProperty("user.name");

    @FindBy(id = ACMT)
    public WebElement acmt;

    @FindBy(xpath = ACMT_VIEW)
    public WebElement acmtView;

    @FindBy(id = RESTORE)
    public WebElement restore;

    @FindBy(id = ROUTES)
    public WebElement routes;

    @FindBy(id = SUMMARY)
    public WebElement summary;

    @FindBy(id = AUDIT)
    public WebElement audit;

    @FindBy(id = MASTER)
    public WebElement master;

    @FindBy(id = PREFERENCES)
    public WebElement preferences;

    @FindBy(id = AUDIT_MSGS)
    public WebElement auditMsgs;

    @FindBy(id = SAVED_QUERIES)
    public WebElement savedQueries;

    @FindBy(id = RE_COLLECT)
    public WebElement reCollect;

    @FindBy(id = RE_SUBMIT)
    public WebElement reSubmit;

    @FindBy(id = PORTAL)
    public WebElement portal;

    @FindBy(xpath = PORTAL_HOST)
    public WebElement portalHost;

    @FindBy(id = DFLOW_MASTER)
    public WebElement dFlowMaster;

    @FindBy(id = DFLOW_MASTER_EDITOR)
    public WebElement dFlowMasterEditor;

    @FindBy(id = DFLOW_MASTER_PREFERENCES)
    public WebElement dFlowMasterPreferences;

    @FindBy(id = HOSTS)
    public WebElement hosts;

    @FindBy(xpath = CURRENT_TIME)
    public WebElement currentTime;

    @FindBy(xpath = LOADING_SPINNER)
    public WebElement loading_spinner;

    @FindBy(xpath = LOGOUT_BUTTON)
    public WebElement logoutBtn;

    @FindBy(xpath = PROFILE_BUTTON)
    public WebElement profileBtn;

    @FindBy(xpath = USER_GROUP)
    public WebElement userGroup;

    @FindBy(css = VALIDATION)
    public WebElement validation;

    @FindBy(css = USER)
    public WebElement user;

    @FindBy(css = SYSTEM)
    public WebElement system;

    @FindBy(css = STATS)
    public WebElement stats;

    @FindBy(id = CHECKIT)
    public WebElement checkIt;

    @FindBy(xpath = MY_SETTINGS)
    public WebElement mySettings;

    @FindBy(css = HELP)
    public WebElement help;

    @FindBy(css = DOCUMENTS)
    public WebElement documents;

    @FindBy(id = DATABASE)
    public WebElement database;

    @FindBy(id = DB_FTP)
    public WebElement dbFtp;

    @FindBy(id = DB_FLOW)
    public WebElement dbFlow;

    @FindBy(id = DB_GW_ACCESS)
    public WebElement dbGwAccess;

    @FindBy(id = DB_GATEWAY)
    public WebElement dbGateway;

    @FindBy(id = DB_HOST)
    public WebElement dbHost;

    @FindBy(id = DB_MPAN_PREFIX)
    public WebElement dbMpanPrefix;

    @FindBy(id = DB_MPID)
    public WebElement dbMpid;

    @FindBy(id = DB_ROLE)
    public WebElement dbRole;

    @FindBy(id = DB_TEST_FLAG)
    public WebElement dbTestFlag;

    @FindBy(xpath = DATA_SERVICES)
    public WebElement dataServices;

    @FindBy(css = CONFIG)
    public WebElement config;

    @FindBy(css = REPORTS)
    public WebElement reports;

    @FindBy(css = BULLETIN)
    public WebElement bulletin;

    @FindBy(xpath = ERROR_TOAST)
    public WebElement errorToast;

    @FindBy(xpath = COLLECT_GROUPS)
    public WebElement collectGroups;

    @FindBy(xpath = SUBMIT_GROUPS)
    public WebElement submitGroups;

    @FindBy(xpath = COLLECT_REQUEST)
    public WebElement collectRequest;

    @FindBy(xpath = SUBMIT_REQUEST)
    public WebElement submitRequest;

    @FindBy(xpath = COLLECT_STATUS)
    public WebElement collectStatus;

    @FindBy(xpath = SUBMIT_STATUS)
    public WebElement submitStatus;

    @FindBy(xpath = "//*[@id=\"child-simple-dropdown-Availabilty\"]")
    public WebElement availability;

    @FindBy(xpath = GATEWAY_STATS)
    public WebElement gatewayStats;

    @FindBy(xpath = "//*[@id=\"child-simple-dropdown-Service\"]")
    public WebElement serviceStats;


    public void waitForPage() throws InterruptedException {
        waitForElement(currentTime);
        waitForElement(portal);
    }

    public void clickOnPortal() {
        waitAndClick(portal);
    }

    public void clickOnHosts() {
        waitAndClick(hosts);
    }

    public void clickOnPortalHost() {
        waitAndClick(portalHost);
    }

    public void clickOnDflowMaster() {
        waitAndClick(dFlowMaster);
    }

    public void clickOnDflowMasterEditor() {
        waitAndClick(dFlowMasterEditor);
    }

    public void clickOnAudit() {
        waitAndClick(audit);
    }

    public void clickOnAuditMsgs() {
        waitAndClick(auditMsgs);
    }

    public void clickOnSavedQueries() {
        waitAndClick(savedQueries);
    }

    public void clickOnUser() {
        waitAndClick(user);
    }

    public void clickOnMaster() {
        waitAndClick(master);
    }

    public void clickOnPreferences() {
        waitAndClick(preferences);
    }

    public void clickOnReCollect() {
        waitAndClick(reCollect);
    }

    public void clickOnReSubmit() {
        waitAndClick(reSubmit);
    }

    public void clickOnAcmt() {
        waitAndClick(acmt);
    }

    public void clickOnAcmtView() {
        waitAndClick(acmtView);
    }

    public void clickOnRestore() {
        waitAndClick(restore);
    }

    public void clickOnRoutes() {
        waitAndClick(routes);
    }

    public void clickOnAvailability() {
        waitAndClick(availability);
    }

    public void clickOnGatewayStats() {
        waitAndClick(gatewayStats);
    }

    public void clickOnServiceStats() {
        waitAndClick(serviceStats);
    }

    public void clickOnSummary() {
        waitAndClick(summary);
    }

    public void clickOnDatabase() {
        waitAndClick(database);
    }

    public void clickOnStats() {
        waitAndClick(stats);
    }

    public void clickOnCheckIt() {
        waitAndClick(checkIt);
    }

    public void clickOnDbFtp() {
        waitAndClick(dbFtp);
    }

    public void clickOnDbFlow() {
        waitAndClick(dbFlow);
    }

    public void clickOnDbGwAccess() {
        waitAndClick(dbGwAccess);
    }

    public void clickOnDbGateway() {
        waitAndClick(dbGateway);
    }

    public void clickOnDbHost() {
        waitAndClick(dbHost);
    }

    public void clickOnDbMpanPrefix() {
        waitAndClick(dbMpanPrefix);
    }

    public void clickOnDbMpid() {
        waitAndClick(dbMpid);
    }

    public void clickOnDbRole() {
        waitAndClick(dbRole);
    }

    public void clickOnDbTestFlag() {
        waitAndClick(dbTestFlag);
    }

    public void clickOnLogout() {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(profileBtn));
        waitAndClick(profileBtn);
        waitAndClick(logoutBtn);
    }

    public WebElement getPortalNav() {
        return portal;
    }

    public WebElement getPortalHostNav() {
        return portalHost;
    }

    public WebElement getHostsNav() {
        return hosts;
    }

    public WebElement getLoading_spinner() {
        return loading_spinner;
    }

    public WebElement getCollectGroupsNav() {
        return collectGroups;
    }

    public WebElement getCollectRequestNav() {
        return collectRequest;
    }

    public WebElement getCollectStatusNav() {
        return collectStatus;
    }

    public WebElement getSubmitGroupsNav() {
        return submitGroups;
    }

    public WebElement getSubmitRequestNav() {
        return submitRequest;
    }

    public WebElement getSubmitStatusNav() {
        return submitStatus;
    }

    public WebElement getAcmtNav() {
        return acmt;
    }

    public WebElement getAcmtViewNav() {
        return acmtView;
    }

    public WebElement getAudit() {
        return audit;
    }

    public WebElement getAuditMsgs() {
        return auditMsgs;
    }

    public WebElement getSavedQueries() {
        return savedQueries;
    }

    public WebElement getRestore() {
        return restore;
    }

    public WebElement getRoutes() {
        return routes;
    }

    public WebElement getSummary() {
        return summary;
    }

    public WebElement getUser() {
        return user;
    }

    public WebElement getMaster() {
        return master;
    }

    public WebElement getPreferences() {
        return preferences;
    }

    public WebElement getLogoutButton() {
        return currentTime;
    }

    public WebElement getdFlowMAsterNav() {
        return dFlowMaster;
    }

    public WebElement getdFlowMAsterEditorNav() {
        return dFlowMasterEditor;
    }

    public WebElement getMySettings() {
        return mySettings;
    }

    public WebElement getConfig() {
        return config;
    }

    public WebElement getDatabase() {
        return database;
    }

    public WebElement getDataServices() {
        return dataServices;
    }

    public WebElement getDocuments() {
        return documents;
    }

    public WebElement getHelp() {
        return help;
    }

    public WebElement getPortal() {
        return portal;
    }

    public WebElement getStats() {
        return stats;
    }

    public WebElement getSystem() {
        return system;
    }

    public WebElement getUserGroup() {
        return userGroup;
    }

    public WebElement getValidation() {
        return validation;
    }

    public WebElement getBulletin() {
        return bulletin;
    }

    public WebElement getReports() {
        return reports;
    }

    public WebElement getErrorToast() {
        return errorToast;
    }

    public WebElement getDbFtp() {
        return dbFtp;
    }

    public WebElement getDbFlow() {
        return dbFlow;
    }

    public WebElement getDbGwAccess() {
        return dbGwAccess;
    }

    public WebElement getDbGateway() {
        return dbGateway;
    }

    public WebElement getDbHost() {
        return dbHost;
    }

    public WebElement getDbMpanPrefix() {
        return dbMpanPrefix;
    }

    public WebElement getDbMpid() {
        return dbMpid;
    }

    public WebElement getDbRole() {
        return dbRole;
    }

    public WebElement getDbTestFlag() {
        return dbTestFlag;
    }

    public void goToDflowEditor() {
        try {
            if (!(getdFlowMAsterEditorNav().isDisplayed())) {
                waitForElement(getdFlowMAsterNav());
                clickOnDflowMaster();
                assertTrue("Dflow Master Editor refference isn't displayed", getdFlowMAsterEditorNav().isDisplayed());
                waitForElement(getdFlowMAsterEditorNav());
                clickOnDflowMasterEditor();
            } else {
                waitForElement(getdFlowMAsterEditorNav());
                clickOnDflowMasterEditor();
            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToPreferences() {
        try {
            if (!(getdFlowMAsterEditorNav().isDisplayed())) {
                waitForElement(getMaster());
                clickOnMaster();
                waitForElement(getPreferences());
                clickOnPreferences();
            } else {
                waitForElement(getPreferences());
                clickOnPreferences();
            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToPortalHost() {
        try {
            if (!(getHostsNav().isDisplayed())) {
                waitForElement(getPortalNav());
                clickOnPortal();
                assertTrue("Dflow Portal Hosts navigation bar isn't displayed", getHostsNav().isDisplayed());
                waitForElement(getHostsNav());
                clickOnHosts();
                waitForElement(getPortalHostNav());
                Thread.sleep(2000);
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", portalHost);
                clickOnPortalHost();
            } else {
                waitForElement(getHostsNav());
                clickOnHosts();
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", portalHost);
                clickOnPortalHost();
            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToDbFTP() {
        try {
            if (!(getDbFtp().isDisplayed())) {
                waitForElement(getDatabase());
                clickOnDatabase();

                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", dbFtp);
                waitForElement(getDbFtp());
                assertTrue("Database FTP navigation bar isn't displayed", getDbFtp().isDisplayed());
                waitAndClick(dbFtp);
                //waitForElement(dbFtp);
                //clickOnDbFtp();
            } else {
                waitForElement(getDatabase());
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", dbFtp);
                waitForElement(getDbFtp());
                assertTrue("Database FTP navigation bar isn't displayed", getDbFtp().isDisplayed());
                waitAndClick(dbFtp);
                //waitForElement(dbFtp);
                //clickOnDbFtp();

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }


    public void goToDbRole() {
        try {
            if (!(getDbRole().isDisplayed())) {
                waitForElement(getDatabase());
                clickOnDatabase();

                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", dbRole);
                waitForElement(getDbRole());
                assertTrue("Database FTP navigation bar isn't displayed", getDbRole().isDisplayed());
                waitAndClick(dbRole);
                //waitForElement(dbRole);
                //clickOnDbRole();
            } else {
                waitForElement(getDatabase());
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", dbRole);
                waitForElement(getDbRole());
                assertTrue("Database FTP navigation bar isn't displayed", getDbRole().isDisplayed());
                waitAndClick(dbRole);
                //waitForElement(dbRole);
                //clickOnDbRole();

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }


    public void goToAuditMsgs() {
        try {
            if (!(getAuditMsgs().isDisplayed())) {
                waitForElement(getAudit());
                clickOnAudit();
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", auditMsgs);
                waitForElement(getAuditMsgs());
                assertTrue("Audit msgs navigation bar isn't displayed", getAuditMsgs().isDisplayed());
                clickOnAuditMsgs();
            } else {
                waitForElement(getAudit());
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", auditMsgs);
                waitForElement(getAuditMsgs());
                assertTrue("Audit msgs navigation bar isn't displayed", getAuditMsgs().isDisplayed());
                clickOnAuditMsgs();

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToReCollectGroups() {
        try {
            if (!(getCollectGroupsNav().isDisplayed())) {
                waitForElement(reCollect);
                clickOnReCollect();
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", collectGroups);
                waitForElement(collectGroups);
                assertTrue("Re-collect groups navigation bar isn't displayed", collectGroups.isDisplayed());
                waitAndClick(collectGroups);
            } else {
                waitForElement(reCollect);
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", collectGroups);
                waitForElement(collectGroups);
                assertTrue("Re-collect groups navigation bar isn't displayed", collectGroups.isDisplayed());
                waitAndClick(collectGroups);

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToReSubmitGroups() {
        try {
            if (!(getSubmitGroupsNav().isDisplayed())) {
                waitForElement(reSubmit);
                clickOnReSubmit();
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", submitGroups);
                waitForElement(submitGroups);
                assertTrue("Re-submit groups navigation bar isn't displayed", submitGroups.isDisplayed());
                waitAndClick(submitGroups);
            } else {
                waitForElement(reSubmit);
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", submitGroups);
                waitForElement(submitGroups);
                assertTrue("Re-submit groups navigation bar isn't displayed", submitGroups.isDisplayed());
                waitAndClick(submitGroups);

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToReSubmitRequest() {
        try {
            if (!(getSubmitRequestNav().isDisplayed())) {
                waitForElement(reSubmit);
                clickOnReSubmit();
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", submitRequest);
                waitForElement(submitRequest);
                assertTrue("Re-submit request navigation bar isn't displayed", submitRequest.isDisplayed());
                waitAndClick(submitRequest);
            } else {
                waitForElement(reSubmit);
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", submitRequest);
                waitForElement(submitRequest);
                assertTrue("Re-submit request navigation bar isn't displayed", submitRequest.isDisplayed());
                waitAndClick(submitRequest);

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToReCollectRequest() {
        try {
            if (!(getCollectRequestNav().isDisplayed())) {
                waitForElement(reCollect);
                clickOnReCollect();
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", collectRequest);
                waitForElement(collectRequest);
                assertTrue("Re-collect request navigation bar isn't displayed", collectRequest.isDisplayed());
                waitAndClick(collectRequest);
            } else {
                waitForElement(reCollect);
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", collectRequest);
                waitForElement(collectRequest);
                assertTrue("Re-collect request navigation bar isn't displayed", collectRequest.isDisplayed());
                waitAndClick(collectRequest);

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToReSubmitStatus() {
        try {
            if (!(getSubmitStatusNav().isDisplayed())) {
                waitForElement(reSubmit);
                clickOnReSubmit();
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", submitStatus);
                waitForElement(submitStatus);
                assertTrue("Re-submit status navigation bar isn't displayed", submitStatus.isDisplayed());
                waitAndClick(submitStatus);
            } else {
                waitForElement(reSubmit);
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", submitStatus);
                waitForElement(submitStatus);
                assertTrue("Re-submit status navigation bar isn't displayed", submitStatus.isDisplayed());
                waitAndClick(submitStatus);

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void goToReCollectStatus() {
        try {
            if (!(getCollectStatusNav().isDisplayed())) {
                waitForElement(reCollect);
                clickOnReCollect();
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", collectStatus);
                waitForElement(collectStatus);
                assertTrue("Re-collect status navigation bar isn't displayed", collectStatus.isDisplayed());
                waitAndClick(collectStatus);
            } else {
                waitForElement(reCollect);
                JavascriptExecutor je = (JavascriptExecutor) driver;
                je.executeScript("arguments[0].scrollIntoView(true);", collectStatus);
                waitForElement(collectStatus);
                assertTrue("Re-collect status navigation bar isn't displayed", collectStatus.isDisplayed());
                waitAndClick(collectStatus);

            }
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }


    public void scrollToTop() {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", currentTime);
    }

    public int getDirectoryFilesCount() {
        File f;
        String downloadDir = userHome + fileSeparator + "Downloads";
        if (downloadDir.contains("C:\\Users")){
            f = new File(userHome + fileSeparator + "Downloads");
        } else {
            f = new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\62.0.3202.94");
        }
        File[] files = f.listFiles();


        int count = 0;
        if (files != null)
            for (int i = 0; i < files.length; i++) {

                count++;
                File file = files[i];

            }
        return count;
    }

    public void deleteFileFromDirectory() {
        File f;
        String downloadDir = userHome + fileSeparator + "Downloads";
        if (downloadDir.contains("C:\\Users")){
            f = new File(userHome + fileSeparator + "Downloads");
        } else {
            f = new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\62.0.3202.94");
        }
        File[] files = f.listFiles();

        if (files == null || files.length == 0) {
            assertTrue("Files doesn't exist in that directory!", false);
        }
        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
        }
        lastModifiedFile.delete();

    }
}


