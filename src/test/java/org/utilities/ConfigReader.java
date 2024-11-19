package org.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public Properties readPropetyData()
	{
		Properties prop = null;
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
}
