package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinitions", "hooks"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "json:target/JSONReports/json-reports.json",
                "junit:target/JUnitReports/junit-reports.xml"
        }
)
public class TestRunner {


}
