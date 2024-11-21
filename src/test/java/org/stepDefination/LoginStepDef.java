package org.stepDefination;

import static org.testng.Assert.assertTrue;

import org.hooks.AppHooks;
import org.pages.LoginPage;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	LoginPage lp;
	
	@When("User is on Login Page")
	public void user_is_on_login_page() {
	    AppHooks.driver.get(AppHooks.prop.getProperty("Url"));
	    lp = new LoginPage(AppHooks.driver);
	}
	@Then("URL is Displayed as Expected")
	public void url_is_displayed_as_expected() {
		Assert.assertEquals(lp.getCurrentURL(), AppHooks.prop.getProperty("Url"));
	}
	@And("Title should be Displayed as {string}")
	public void title_should_be_displayed_as(String string) {
		Assert.assertEquals(lp.getCurrentTitle(), string);
	}
	@Then("Home button should be Displayed")
	public void home_button_should_be_displayed() {
	    Assert.assertTrue(lp.homeButtonisDisplayed());
	}
	@Then("Customer Login button should be Displayed")
	public void customer_login_button_should_be_displayed() {
	    Assert.assertTrue(lp.customerButtonisDisplayed());
	}
	@Then("Manager Login button should be Displayed")
	public void manager_login_button_should_be_displayed() {
	   Assert.assertTrue(lp.managerLoginButtonisDisplayed());
	}
	
}
