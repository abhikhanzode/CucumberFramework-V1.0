package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = {"Steps"},
		plugin = {"json:target/cucumber-report/cucumber.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}

