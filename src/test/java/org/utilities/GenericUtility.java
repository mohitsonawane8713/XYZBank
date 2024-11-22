package org.utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtility {
	
	public void selectByIndex(WebElement ele,int index)
	{
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement ele,String name)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(name);
	}
	public void selectByValue(WebElement ele,String name)
	{
		Select sel = new Select(ele);
		sel.deselectByValue(name);
	}
	public void deselectByIndex(WebElement ele,int index)
	{
		Select sel = new Select(ele);
		sel.deselectByIndex(index);
	}
	public void deselectByVisibleText(WebElement ele,String name)
	{
		Select sel = new Select(ele);
		sel.deselectByVisibleText(name);
	}
	public void deselectByValue(WebElement ele,String name)
	{
		Select sel = new Select(ele);
		sel.selectByValue(name);
	}
	
	public void clickByJS(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void waitforURlContains(WebDriver driver,int waitForSec,String url)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitForSec));
		wait.until(ExpectedConditions.urlContains(url));
	}
	
	public void waitforTitleContains(WebDriver driver,int waitForSec,String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitForSec));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void waitForVisibilityofElement(WebDriver driver,int waitForSec,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitForSec));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
