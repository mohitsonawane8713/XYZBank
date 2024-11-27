package org.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;

	public Properties readPropertyData()
	{
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/Test.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	public String getBrowserName()
	{
		prop = readPropertyData();
		return prop.getProperty("BrowserName");
	}
	public String getApplicationURl()
	{
		prop = readPropertyData();
		return prop.getProperty("Url");
	}
}
