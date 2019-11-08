package Pageobject;

import Common.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseMethods {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final String USERNAME = "inputUser";
    public static final String PASSWORD = "inputPassword";
    public static final String SUBMIT = "//button";

    @FindBy(id = USERNAME)
    public WebElement inputUsername;

    @FindBy(id = PASSWORD)
    public WebElement inputPassword;

    @FindBy(xpath = SUBMIT)
    public WebElement submitBtn;

    public void login(String username, String password) {
        getInputUsername().clear();
        getInputPassword().clear();
        validateDisplayedElements(inputUsername);

        waitAndType(inputUsername, username);
        validateDisplayedElements(inputPassword);

        waitAndType(inputPassword, password);
        validateDisplayedElements(submitBtn);
        waitAndClick(submitBtn);
    }

    public void waitForPage() throws InterruptedException {
        waitForElement(inputUsername);
        waitForElement(inputPassword);
        waitForElement(submitBtn);
    }

    public WebElement getInputUsername(){
        return inputUsername;
    }

    public WebElement getInputPassword(){
        return inputUsername;
    }
}
