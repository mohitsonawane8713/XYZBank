package org.pages;

import org.hooks.AppHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPage {
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	private WebElement btnAddCustomer;
	
	@FindBy(xpath="//button[@ng-click='openAccount()']")
	private WebElement btnOpenAccount;
	
	@FindBy(xpath="//button[@ng-click='showCust()']")
	private WebElement btnCustomer;
	
	WebDriver driver;
	
	public ManagerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public String addCustomerFieldName()
	{
		AppHooks.gu.waitForVisibilityofElement(AppHooks.driver, 30, btnAddCustomer);
		return btnAddCustomer.getText();
	}
	public String openAccountFieldName()
	{
		AppHooks.gu.waitForVisibilityofElement(AppHooks.driver, 30, btnOpenAccount);
		return btnOpenAccount.getText();
	}
	public String customerAccountField()
	{
		AppHooks.gu.waitForVisibilityofElement(AppHooks.driver, 30, btnCustomer);
		return btnCustomer.getText();
	}
}
