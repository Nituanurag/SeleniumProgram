package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
				features = {"src/test/resources/Features"},
				glue       =  "stepsDefinitions",
				dryRun   =  false,
				monochrome = true,
				plugin     = {"pretty", "html:test-output.html" }
					)
public class TestRunner {
	

}
