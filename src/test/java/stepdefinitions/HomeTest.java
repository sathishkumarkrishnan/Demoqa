package stepdefinitions;

import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Home;

public class HomeTest extends BaseTest {

	
	@Given("navigate to application home page")
	public void navigate_to_application_home_page() {
		 navigateToURL("https://demoqa.com");
	}

	@Then("validate home page")
	public void validate_home_page() {

		// Write code here that turns the phrase above into concrete actions
		  Assert.assertEquals(getDriver().getTitle(), "DEMOQA");

	}

}
