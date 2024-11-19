package org.stepDefination;

import org.hooks.AppHooks;
import org.pages.LoginPage;
import org.pages.ManagerPage;
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

}
