package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPageObjectClass {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public AbstractPageObjectClass(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 45);
    }
}
