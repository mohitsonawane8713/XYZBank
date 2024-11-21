package org.stepDefination;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.hooks.AppHooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.LoginPage;
import org.pages.ManagerPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerStepDef {
	
	@When("User click on Manager button")
	public void user_click_on_Manager_button()
	{
		LoginPage lp = new LoginPage(AppHooks.driver);
		lp.clickOnManagerLogin();
	}
	@Then("{string}, {string}, {string} Fields is Displayed")
	public void manager_page_fields_is_Displayed(String str1,String str2,String str3)
	{
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(str1, mp.addCustomerFieldName());
		sa.assertEquals(str2, mp.openAccountFieldName());
		sa.assertEquals(str3, mp.customerAccountField());
	}
	@When("Click on Add Customer")
	public void click_on_add_Customer()
	{
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.clickon_AddCustomer();
	}
	@Then("First Name Field is Displayed")
	public void first_name_field_is_displayed() {
	    ManagerPage mp = new ManagerPage(AppHooks.driver);
	    mp.firstNameisDisplalyed();
	}
	@Then("Last Name Field is Displayed")
	public void last_name_field_is_displayed() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.lastNameisDisplayed();
	}
	@Then("Postal Code Field is Displayed")
	public void postal_code_field_is_displayed() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.postCodeisDisplayed();
	}
	@Then("Add Customer button is Displayed")
	public void add_customer_button_is_Displayed()
	{
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.btnAddCustomerisDisplayed();
	}
	@When("User Enter Valid Crediantials")
	public void user_enter_first_name() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.enterFirstName("Mohit");
		mp.enteredLastName("Sonawane");
		mp.enteredPostalCode("12345");
	}
	@When("User Click on Add Customer button")
	public void user_click_on_add_customer_button() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.clickonAddCustomer();
	}
	@Then("Customer is Created Successfully")
	public void customer_is_created_successfully() {
	    Alert alt = AppHooks.driver.switchTo().alert();
	    
	    String str = alt.getText();
	    str = str.replaceAll("[^a-zA-Z]", " ");
		str = str.trim();
		
	    Assert.assertEquals(AppHooks.prop.getProperty("CreateCustomerMessage"), str);
	    alt.accept();
	}

}
