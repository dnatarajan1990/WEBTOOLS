package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.uncommons.reportng.HTMLReporter;
import org.uncommons.reportng.JUnitXMLReporter;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Listeners({FailureListener.class, HTMLReporter.class, JUnitXMLReporter.class})
    public class TestManager {
        private static final String CONFIG_PROPERTIES_FILE_NAME = "config.properties";
        private static final String BROWSER_TYPE_PROP_NAME = "browserType";
        private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
        private static final String WEBDRIVER_FIREFOX_DRIVER = "webdriver.gecko.driver";
        private static final Properties CONFIG = new Properties();
        private static final Map<String, Properties> CACHED_PROPERTIES = new HashMap<>();

        private WebDriver driver;

        private JdbcTemplate jdbcTemplate;

        @BeforeClass
        public void setDriver() {
            setUpConfigIfEmpty();
            setUpJdbcTemplate();

            if ((CONFIG.getProperty(BROWSER_TYPE_PROP_NAME).equals("firefox"))) {
                System.setProperty(WEBDRIVER_FIREFOX_DRIVER, "..\\driver\\geckodriver.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                driver = new FirefoxDriver(capabilities);
            } else if (CONFIG.getProperty(BROWSER_TYPE_PROP_NAME).equals("phantom")) {
                System.setProperty(WEBDRIVER_CHROME_DRIVER, "..\\driver\\phantomjs.exe");
                DesiredCapabilities dcaps = new DesiredCapabilities();
                dcaps.setCapability("takesScreenshot", true);
                driver = new PhantomJSDriver(dcaps);
            } else if (CONFIG.getProperty(BROWSER_TYPE_PROP_NAME).equals("chrome")) {
                System.setProperty(WEBDRIVER_CHROME_DRIVER, "..\\driver\\chromedriver.exe");
                DesiredCapabilities dcaps = new DesiredCapabilities();
                dcaps.setCapability("takesScreenshot", true);
                driver = new ChromeDriver(dcaps);
            } else {
                throw new IllegalStateException("Sorry, unable to find browser type property");
            }

            driver.manage().window().maximize();
        }

        private void setUpConfigIfEmpty() {
            if (CONFIG.isEmpty()) {
                try (InputStream input = getClass().getClassLoader().getResourceAsStream(CONFIG_PROPERTIES_FILE_NAME)) {
                    if (input == null) {
                        System.out.println("Sorry, unable to find config.properties");
                    }

                    CONFIG.load(input);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public WebDriver getDriver() {
            return driver;
        }

        public String getProperty(String filename, String property) {
            Properties prop = CACHED_PROPERTIES.get(filename);

            if (prop == null) {
                try (InputStream input = getClass().getClassLoader().getResourceAsStream(filename)) {
                    if (input == null) {
                        System.out.println("Sorry, unable to find file " + filename + " !");
                    }

                    prop = new Properties();
                    prop.load(input);
                    CACHED_PROPERTIES.put(filename, prop);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return prop == null ? null : prop.getProperty(property);
        }


        private void setUpJdbcTemplate() {
            jdbcTemplate = new JdbcTemplate(setUpDatabase());
        }


        private DataSource setUpDatabase() {

            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName(CONFIG.getProperty("datasource.driverClassName"));
            dataSource.setUrl(CONFIG.getProperty("datasource.url"));
            dataSource.setUsername(CONFIG.getProperty("datasource.username"));
            dataSource.setPassword(CONFIG.getProperty("datasource.password"));
            return dataSource;
        }

        protected int runSqlStatement(String sql) {
            return jdbcTemplate.update(sql);
        }

}
