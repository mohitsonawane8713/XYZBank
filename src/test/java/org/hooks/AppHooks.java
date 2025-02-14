package org.hooks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.factory.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.utilities.ConfigReader;
import org.utilities.GenericUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	public static Properties prop;
	public static WebDriver driver;
	public static GenericUtility gu;
	public static Scenario scn;
	public static ConfigReader cr;

	@Before
	public void launchBrowser(Scenario scn)
	{
		cr = new ConfigReader();
	    prop=cr.readPropertyData();
		DriverFactory df = new DriverFactory();
		driver = df.initDriver(cr.getBrowserName());
		gu = new GenericUtility();
		AppHooks.scn = scn;
	}
	@After(order=10)
	public void getScreenShot() throws IOException
	{
		if(AppHooks.scn.isFailed())
		{
			String scnName = AppHooks.scn.getName();
			scnName = scnName.replaceAll(" ","_")+".png";
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte [] bt = ts.getScreenshotAs(OutputType.BYTES);
			
			AppHooks.scn.attach(bt, "image/png", scnName);
			
		}
//		File set = new File("./src/test/resources/Images/"+scnName);
//		TakesScreenshot ts =(TakesScreenshot)AppHooks.driver;
//		
//		File get = ts.getScreenshotAs(OutputType.FILE);
//		
//		FileHandler.copy(get, set);
		
	}
	
	@After(order=0)
	public void closeBrowser()
	{
		driver.quit();
	}
}
