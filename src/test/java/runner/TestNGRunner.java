package runner;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.BrowserType;
import utils.DriverManager;


	
	@CucumberOptions(
			features = "src/test/java/features",
			glue = "stepdefinitions",
			plugin = {"pretty", "html:target/cucumber-reports/report.html", "json:target/cucumber-reports/report.json"},
			monochrome=true )
	
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
		
	}
