package com.driver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



	public class DriverSetup {

		public static WebDriver driver;
		public static String exepath;
		
		//Function for calling the driver based on the browser//
		
		public static WebDriver getDriver(String browname)
		{
			if(browname.equalsIgnoreCase("Chrome"))
			{
				exepath =  System.getProperty("user.dir") + "\\src/main/resources\\driver\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",exepath);
				driver = new ChromeDriver();
			}
			else if (browname.equalsIgnoreCase("Firefox"))
			{
				exepath =  System.getProperty("user.dir") + "\\src/main/resources\\driver\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver",exepath);
				driver = new FirefoxDriver();
			}
			return driver;
		}
		
		public static void getBrowser(String url)
		{
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		//Function to close the browser tab//

		public static void close()
		{
			driver.close();
		}
}
