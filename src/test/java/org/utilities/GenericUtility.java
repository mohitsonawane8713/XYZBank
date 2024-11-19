package org.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtility {
	
	public void waitForVisibilityofElement(WebDriver driver,int waitForSec,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitForSec));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
