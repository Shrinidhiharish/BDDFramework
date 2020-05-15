package utility;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Eclipse_Projects\\amazon\\src\\test\\java\\testCases", glue = "stepdefinition", plugin = {
		"pretty" }, dryRun = false)

public class cucumber_Runner {

}
