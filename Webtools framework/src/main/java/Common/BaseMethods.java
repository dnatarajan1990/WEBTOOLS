package Common;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import static org.testng.Assert.assertTrue;

public class BaseMethods extends AbstractPageObjectClass {

        public BaseMethods(WebDriver driver) {
            super(driver);
            globalTimeWaitForLogin = Integer.parseInt(testManager.getProperty(USER_PROPERTIES, LOGIN_TIME_OUT));
        }

        public int globalTimeWaitForLogin;
        TestManager testManager = new TestManager();

        //Waiting For WebElement and clicking on it
        public void waitAndClick(WebElement element) {
            try {
                validateDisplayedElements(element);
                wait.until(ExpectedConditions.elementToBeClickable(element));
                element.click();
            } catch (TimeoutException te) {
                te.printStackTrace();
                assertTrue(false, "Element: " + element + " isn't appear on this page!");
            }
        }

        //Waiting For WebElement and typing String to input field
        public void waitAndType(WebElement element, String text) {
            try {
                validateDisplayedElements(element);
                wait.until(ExpectedConditions.elementToBeClickable(element));

                //noinspection since 15
                if (!(element.getText() == null)) {
                    element.clear();
                    element.sendKeys(text);
                } else {
                    element.sendKeys(text);
                }
            } catch (TimeoutException te) {
                te.printStackTrace();
                assertTrue(false, "Element: " + element + " isn't appear on this page!");
            }
        }

        //Waiting For WebElement and typing String to input field
        public void waitAndSelect(WebElement element, String text) {
            try {
                validateDisplayedElements(element);
                wait.until(ExpectedConditions.elementToBeClickable(element));
                Select select = new Select(element);
                select.selectByValue(text);
            } catch (TimeoutException te) {
                te.printStackTrace();
                assertTrue(false, "Element: " + element + " isn't appear on this page!");
            }
        }

        public void waitFor(WebElement element) {
            try {
                waitForElement(element);
            } catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }

        //Waiting For WebElement
        public void waitForElement(WebElement element) throws InterruptedException {
            try {
                wait.until(ExpectedConditions.visibilityOf(element));
            } catch (TimeoutException te) {
                te.printStackTrace();
                assertTrue(false, "Element: " + element + " isn't appear on this page!");
            }
        }

        public void waitForElements(List<WebElement> elements) throws InterruptedException {
            elements.stream().forEach(webElement -> {
                try {
                    waitForElement(webElement);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        public void waitForLogin() {
            WebDriverWait wait = new WebDriverWait(driver, 45);
            final String LOGOUT_BUTTON = HomePage.CURRENT_TIME;

            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOGOUT_BUTTON)));
            } catch (TimeoutException ie) {
                throw ie;
            }
        }

        //Validation of WebElements
        public void validateDisplayedElements(WebElement element) {
            try {
                assertTrue(element.isDisplayed(), "Element " + element + " isn't displayed! ");
                assertTrue(element.isEnabled(), "Element " + element + " isn't enabled! ");
            } catch (NoSuchElementException nse) {
                nse.printStackTrace();
                assertTrue(false, "This Page doesn't contain element: " + element);
            }
        }

        protected boolean isReadOnlyElementPresent(WebElement element) {
            boolean isPresent;

            try {
                isPresent = element.isDisplayed() && !element.isEnabled();
            } catch (NoSuchElementException e) {
                isPresent = false;
            }

            return isPresent;
        }

        protected boolean isElementPresent(WebElement element) {
            boolean isPresent;

            try {
                isPresent = element.isDisplayed() && element.isEnabled();
            } catch (NoSuchElementException e) {
                isPresent = false;
            }

            return isPresent;
        }

        /**
         * @param element element from which value will be checked
         * @param value value to check
         * @return list of values that are not correct or empty list if values are the same
         */
        protected List<String> areValuesEqual(WebElement element, String value) {
            List<String> errors;

            if(!value.equals(element.getAttribute("value")) && !value.equals(element.getText())) {
                if(StringUtils.isNotEmpty(element.getText())) {
                    errors = Arrays.asList(value, element.getText());
                } else {
                    errors = Arrays.asList(value, element.getAttribute("value"));
                }
            } else {
                errors = Collections.emptyList();
            }

            return errors;
        }

        public void selectVisibleOptionFromMenu(String visibleTextOfOption, WebElement menu) {
            validateDisplayedElements(menu);
            WebElement selectedMenu = menu;
            Select selectedDropDown = new Select(selectedMenu);
            selectedDropDown.selectByVisibleText(visibleTextOfOption);
        }

        public boolean verifyIsElementNotDisplayed(WebElement element) throws InterruptedException {
            try {
                Thread.sleep(1000);
                if (element.isDisplayed()) {
                    return false;
                }
            } catch (NoSuchElementException e) {
                return true;
            }
            return false;
        }

        public void loginToWebtools(String username, String password) {
            try {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                HomePage homePage = PageFactory.initElements(driver, HomePage.class);
                loginPage.waitForElement(loginPage.getInputUsername());
                loginPage.login(username, password);
                homePage.waitForLogin();
            } catch (NoSuchElementException nsee) {
                nsee.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void setAllDropdownsToTextOption(List<WebElement> dropDownList, String textOption) {
            for (WebElement dropdown : dropDownList) {
                if (dropdown.getText() != textOption) {
                    selectVisibleOptionFromMenu(textOption, dropdown);
                }
            }
        }

        public boolean verifyRegexp(String pattern, String text) {
            boolean isMatch = Pattern.matches(pattern, text);
            return isMatch;
        }
    }

}
