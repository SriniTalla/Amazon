package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.amazon.stepdefs",
        plugin = {"pretty", "html:target/cucumber.html","json:target/json/cucumber.json"}
)
public class TestRunner {
}
