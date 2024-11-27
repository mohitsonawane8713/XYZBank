package org.pages;

import java.util.ArrayList;
import java.util.List;

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
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	private WebElement postCode;
	
	@FindBy(xpath="//button[text()='Add Customer']")
	private WebElement addCustomerBtn;
	
	@FindBy(xpath="//select[@id='userSelect']")
	private WebElement userSelect;
	
	@FindBy(xpath="//select[@id='currency']")
	private WebElement currencySelect;
	
	@FindBy(xpath="// button[text()='Process']")
	private WebElement btnProcess;
	
	@FindBy(xpath="// input[@placeholder='Search Customer']")
	private WebElement searchCustomer;
	
	@FindBy(xpath="// tr[@class='ng-scope']/td[4]/span")
	private List<WebElement> accountNo;
	
	WebDriver driver;
	
	public ManagerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public String addCustomerFieldName()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 30, btnAddCustomer);
		return btnAddCustomer.getText();
	}
	public String openAccountFieldName()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 30, btnOpenAccount);
		return btnOpenAccount.getText();
	}
	public String customerAccountField()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 30, btnCustomer);
		return btnCustomer.getText();
	}
	public void clickon_AddCustomer()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnAddCustomer);
		AppHooks.gu.clickByJS(AppHooks.driver, btnAddCustomer);
	}
	public boolean firstNameisDisplalyed()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, firstName);
		return firstName.isDisplayed();
	}
	public boolean lastNameisDisplayed()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, lastName);
		return lastName.isDisplayed();
	}
	public boolean postCodeisDisplayed()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, postCode);
		return postCode.isDisplayed();
	}
	public boolean btnAddCustomerisDisplayed()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, addCustomerBtn);
		return addCustomerBtn.isDisplayed();
	}
	public void enterFirstName(String firstName)
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, this.firstName);
		this.firstName.sendKeys(firstName);
	}
	public void enteredLastName(String lastName)
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, this.lastName);
		this.lastName.sendKeys(lastName);
	}
	public void enteredPostalCode(String postCode)
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, this.postCode);
		this.postCode.sendKeys(postCode);
	}
	public void clickonAddCustomer()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, addCustomerBtn);
		AppHooks.gu.clickByJS(driver, addCustomerBtn);
	}
	public void clickonOpenAccount()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnOpenAccount);
		AppHooks.gu.clickByJS(driver, btnOpenAccount);
	}
	public void clickonCustomer()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnOpenAccount);
		AppHooks.gu.clickByJS(driver, btnCustomer);
	}
	public void selectUser(String name)
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, userSelect);
		AppHooks.gu.selectByVisibleText(userSelect, name);
	}
	public void selectCurrenecy(String name)
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, currencySelect);
		AppHooks.gu.selectByVisibleText(currencySelect, name);
	}
	public void clickonProcess()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnProcess);
		AppHooks.gu.clickByJS(driver, btnProcess);
	}
	public void searchCustomer(String customerName)
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, searchCustomer);
		searchCustomer.sendKeys(customerName);
	}
	public int  totalAccounts()
	{
		return accountNo.size();
	}
}
