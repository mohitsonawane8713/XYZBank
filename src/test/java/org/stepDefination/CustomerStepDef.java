package org.stepDefination;

import org.hooks.AppHooks;
import org.pages.CustomerPage;
import org.pages.LoginPage;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerStepDef {

	@When("User Click on Customer button")
	public void user_click_on_customer_button() {
	    LoginPage lp = new LoginPage(AppHooks.driver);
	    lp.clickonCustomerLogin();
	}
	@Then("Customer Login Page Should be Displayed")
	public void customer_login_page_should_be_displayed() {
	   CustomerPage cp = new CustomerPage(AppHooks.driver);
	   Assert.assertTrue(cp.userNameFieldisDisplayed());
	}
	@When("User Enters User Name {string}")
	public void user_enters_user_name(String string) {
	    CustomerPage cp = new CustomerPage(AppHooks.driver);
	    cp.enterUserName(string);
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
		CustomerPage cp = new CustomerPage(AppHooks.driver);
		cp.clickonLoginButton();
	}
	@Then("Home Page Should be Displayed")
	public void home_page_should_be_displayed() {
		CustomerPage cp = new CustomerPage(AppHooks.driver);
		Assert.assertTrue(cp.logoutButtonisDisplayed());
	}

}
