package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun=false,
		features = {"src/test/resources/features/"},
		glue = {"stepDefinations"},
				plugin={"html:target/cucumber-html-report", "json:target/cucumber.json",
						"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json"}
		)

public class TestRunner {

}
