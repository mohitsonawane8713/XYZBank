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
	@When("User Enter Valid Crediantials")
	public void user_enter_first_name(){
		ManagerPage mp = new ManagerPage(AppHooks.driver);
		
		ExcelUtility eu = new ExcelUtility();
		List l1 = eu.getExcelSheetData(0);
		for(int i=0;i<l1.size();i++)
		{
			mp.enterFirstName(l1.get(i).toString());
			mp.enteredLastName(l1.get(i+=1).toString());
			mp.enteredPostalCode(l1.get(i+=1).toString());
		}
	}
	@When("User Click on Add Customer button")
	public void user_click_on_add_customer_button() {
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

}
