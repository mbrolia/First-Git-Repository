package com.configFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	
	public static void readProperties()
	{
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("C:\\Users\\hshub\\eclipse-workspace\\DELite_SMR_07\\src\\main\\java\\com\\configFile\\config.properties");
			prop.load(input);
			prop.getProperty("email");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
