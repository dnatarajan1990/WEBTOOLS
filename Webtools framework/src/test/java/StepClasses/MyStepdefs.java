package StepClasses;

import Common.TestManager;
import Pageobject.HomePage;
import Pageobject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static Common.PropertiesClass.*;
import static Common.PropertiesClass.DROPDOWN_ALL_OPTION;
import static java.lang.System.getProperty;

/* created by Divya Natarajan on 25.10.2019 @ 16:51
 */
public class MyStepdefs extends TestManager {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;


    String username;
    String password;
    String url;

    @Given("login to webtools with valid username and password")
    public void loginToWebtoolsWithValidUsernameAndPassword() {

        driver = getDriver();
        url = getProperty(GLOBAL_PROPERTIES, URL);
        username = getProperty(USER_PROPERTIES, HP_USER);
        password = getProperty(USER_PROPERTIES, HP_USER_PASSWORD);
        AllDropdownOption = getProperty(USER_PROPERTIES, DROPDOWN_ALL_OPTION);
    }

    @When("verifying navigation to MultiCopy")
    public void verifyingNavigationToMultiCopy() {
    }

    @Then("verify preview is displayed")
    public void verifyPreviewIsDisplayed() {
    }

    @And("verify copied route is saved and displayed")
    public void verifyCopiedRouteIsSavedAndDisplayed() {
    }

    @And("Close the browser")
    public void closeTheBrowser() {
    }
}
