package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/TestRunner"
        , glue = {"StepClasses"}
        , plugin = {"pretty",
        "html:target/CucumberReports/",
        "junit:target/CucumberReports/Cucumber.xml",
        "json:target/CucumberReports/Cucumber.json"}
)

public class TestRunner {
}
