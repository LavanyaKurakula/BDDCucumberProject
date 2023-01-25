package testRunner;

//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Features",
		glue = "stepDefinitions" ,
		dryRun = false,
		monochrome = true ,
		tags="@demo",
		plugin = {"pretty","html:target/cucumber-reports/reports_1.html"}
	
		)

public class Run extends AbstractTestNGCucumberTests {

}
