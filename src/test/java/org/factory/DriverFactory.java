package org.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	public WebDriver initDriver(String browserName)
	{
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("ch")||browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--start-maximized");
			option.addArguments("--disabled-notification");
			driver = new ChromeDriver(option);
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--start-maximized");
			option.addArguments("--disabled-notification");
			driver = new EdgeDriver(option);
		}
		else if(browserName.equalsIgnoreCase("ff")||browserName.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--start-maximized");
			option.addArguments("--disabled-notification");
			driver = new FirefoxDriver(option);

		}
		else
		{
			System.out.println("Browser Not Found");
		}
		return driver;
	}
}
