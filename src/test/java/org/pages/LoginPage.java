package org.pages;

import org.hooks.AppHooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.GenericUtility;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//button[@class='btn home']")
	private WebElement btnHome;
	
	@FindBy(xpath="(//button[@class='btn btn-primary btn-lg'])[1]")
	private WebElement btnCustomeLogin;
	
	@FindBy(xpath="(//button[@class='btn btn-primary btn-lg'])[2]")
	private WebElement btnManagerLogin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public String getCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	public String getCurrentTitle()
	{
		return driver.getTitle();
	}
	public boolean homeButtonisDisplayed()
	{	
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnHome);
		return btnHome.isDisplayed();
	}
	public boolean customerButtonisDisplayed()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnCustomeLogin);
		return btnCustomeLogin.isDisplayed();
	}
	public boolean managerLoginButtonisDisplayed()
	{
		AppHooks.gu.waitForVisibilityofElement(driver, 20, btnManagerLogin);
		return btnManagerLogin.isDisplayed();
	}
	public void clickOnManagerLogin()
	{
		AppHooks.gu.waitForVisibilityofElement(AppHooks.driver, 30, btnManagerLogin);
		//.click();
		//Actions act = new Actions(AppHooks.driver);
		//act.click(btnManagerLogin);
		JavascriptExecutor js = (JavascriptExecutor) AppHooks.driver;
		js.executeScript("arguments[0].click();", btnManagerLogin);
		
	}
}