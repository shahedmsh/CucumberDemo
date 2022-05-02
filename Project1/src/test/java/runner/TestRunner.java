package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/shahedhussain/eclipse-workspace/Project1/src/test/resources/features/FBlogin.feature", 
glue = "stepDef" ,
dryRun = true,
monochrome = true,
plugin = {"pretty","html:test-output"}
		
		)

public class TestRunner {

}
