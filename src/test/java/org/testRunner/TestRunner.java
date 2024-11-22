package org.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features = "./src/test/resources/Feature",
		 glue = {"org/stepDefination","org/hooks"},
		 monochrome = true,
		// dryRun = true,
		 tags = "@smoke",
		 plugin = {"pretty",
				    //"junit:Reports/junit_report.xml",
					//"json:Reports/nunit_report.json",
					//"html:Reports/html_report.html",
					//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		 }
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
