package org.stepDefination;

import java.util.List;

import org.hooks.AppHooks;
import org.openqa.selenium.Alert;
import org.pages.LoginPage;
import org.pages.ManagerPage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.utilities.ExcelUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerStepDef {
	
	@When("User click on Manager button")
	public void user_click_on_Manager_button()
	{
		LoginPage lp = new LoginPage(AppHooks.driver);
		lp.clickOnManagerLogin();
	}
	@Then("{string}, {string}, {string} Fields should be Displayed")
	public void manager_page_fields_should_be_Displayed(String str1,String str2,String str3)
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
	@Then("First Name Field should be Displayed")
	public void first_name_field_should_be_displayed() {
	    ManagerPage mp = new ManagerPage(AppHooks.driver);
	    mp.firstNameisDisplalyed();
	}
	@Then("Last Name Field should be Displayed")
	public void last_name_field_should_be_displayed() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.lastNameisDisplayed();
	}
	@Then("Postal Code Field should be Displayed")
	public void postal_code_field_should_be_displayed() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.postCodeisDisplayed();
	}
	@Then("Add Customer button should be Displayed")
	public void add_customer_button_is_Displayed()
	{
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.btnAddCustomerisDisplayed();
	}
	@When("Manager Enter Valid Crediantials")
	public void manager_enter_Valid_Crediantials() throws Exception{
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		
		ExcelUtility eu = new ExcelUtility();
		mp.enterFirstName(eu.getCustomerDetailsBySheetIndex(0, 1, 0));
		mp.enteredLastName(eu.getCustomerDetailsBySheetIndex(0, 1, 1));
		mp.enteredPostalCode(eu.getCustomerDetailsBySheetIndex(0, 1, 2));

	}
	@When("Manager Click on Add Customer button")
	public void manager_click_on_add_customer_button() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.clickonAddCustomer();
	}
	@Then("Customer should be Created Successfully")
	public void customer_should_be_created_successfully() {
	    Alert alt = AppHooks.driver.switchTo().alert();
	    
	    String str = alt.getText();
	    str = str.replaceAll("[^a-zA-Z]", " ");
		str = str.trim();
		
	    Assert.assertEquals(AppHooks.prop.getProperty("CreateCustomerMessage"), str);
	    alt.accept();
	}
	@When("Manager Click on Open Account button")
	public void manager_Click_on_Open_Account_button()
	{
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.clickonOpenAccount();
	}
	@When("Manager Select Customer Name is {string}")
	public void manager_select_customer_name(String string) {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.selectUser(string);
	}
	@When("Manager Select Currency is {string}")
	public void manager_select_currency(String string) {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.selectCurrenecy(string);
	}
	@When("Manager Click on Process button")
	public void manager_click_on_process_button() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.clickonProcess();
	}
	@Then("Account Should be Created Successfully")
	public void account_should_be_created_successfully() {
	   Alert alt = AppHooks.driver.switchTo().alert();
	   String str = alt.getText();
	   str = str.replaceAll("[^a-zA-Z]", " ");
	   str = str.trim();
	   Assert.assertEquals(AppHooks.prop.getProperty("createAccountMessage"), str);
	   alt.accept();
	}
	@When("Manager Click on Customers")
	public void manager_click_on_customers() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.clickonCustomer();
	}
	@When("Manager Search Customer Name {string}")
	public void manager_search_customer_name(String string) {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		mp.searchCustomer(string);
	}
	@Then("Customer Account Information Should be Displayed")
	public void customer_account_information_should_be_displayed() {
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		AppHooks.scn.log("Total Account Are : "+mp.totalAccounts());
	}


}
