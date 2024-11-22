package org.pages;

import org.hooks.AppHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
	@FindBy(css="select[id='userSelect']")
	private WebElement userSelect;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//button[text()='Logout']")
	private WebElement btnLogout;
	
	@FindBy(xpath="//select[@id='accountSelect']")
	private WebElement selectAccount;
	
	@FindBy(xpath="//strong[@class='ng-binding'][1]")
	private WebElement accountNumber;
	
	@FindBy(xpath="//strong[@class='ng-binding'][1]")
	private WebElement balance;
	
	@FindBy(xpath="//strong[@class='ng-binding'][3]")
	private WebElement currency;
	
	@FindBy(xpath="//button[@ng-class='btnClass1']")
	private WebElement  btnTansaction;
	
	@FindBy(xpath="//button[@ng-class='btnClass2']")
	private WebElement  btnDeposit;
	
	@FindBy(xpath="//button[@ng-class='btnClass3']")
	private WebElement  btnWithdrawl;
	

	WebDriver driver;
	
	public CustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public boolean userNameFieldisDisplayed()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, userSelect);
		return userSelect.isDisplayed();
	}
	public void enterUserName(String userName)
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, userSelect);
		AppHooks.gu.selectByVisibleText(userSelect, userName);
	}
	public void clickonLoginButton()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnLogin);
		AppHooks.gu.clickByJS(driver, btnLogin);
	}
	public boolean logoutButtonisDisplayed()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnLogout);
		return btnLogout.isDisplayed();
	}
}
