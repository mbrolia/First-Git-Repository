package com.testCases;
//package com.driver;

import static org.testng.Assert.*;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.beust.jcommander.Parameter;
import com.driver.DriverSetup;
import com.excelRead.ExcelUtils;
import com.logReport.logFile;
import com.objectRepository.Locator;
import com.screenshot.Screenshot;


public class TestCases {

	public static WebDriver driver;
	public static String[] excelValues = new String[10];
	public static String[] excelValues1 = new String[10];
	public static String a;
	public static List<WebElement> mandateList;


	
	public static void waitForElement() //Waiting for the element to be visible//
	{
		WebDriverWait wait = new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CategoryDetail']/div[4]/div[12]/div/div/table/tbody[1]/tr[1]/td[3]/div[2]/textarea")));
	}
	
	
	@Parameters("browser")
	@BeforeClass
	public static void launchUrl(String browser) throws IOException //LAUNCH URL// 
	{
		  driver = DriverSetup.getDriver(browser);
		DriverSetup.getBrowser("https://deliveryexcellencest.cognizant.com/apps/DELiteMR/");
		logFile.myLog("TestCases", "URL opened");
		
		
		
//		  report = new ExtentReports(System.getProperty("user.dir")+"/ExtentReportResults.html");
//		   test = report.startTest("TestCases");
	}
	
	
	
	@Test
	public static void countVerify()  //COUNT VERIFICATION//
	{
		waitForElement();
		DriverSetup.getBrowser("https://deliveryexcellencest.cognizant.com/apps/DELiteMR/Categorize/FactRecord/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		findings of fact
		List<WebElement> list1 = Locator.findingFScreen(driver);
		
		System.out.println("No. of findings in Fact Recording Sheet Page:" + list1.size());
		
		DriverSetup.getBrowser("https://deliveryexcellencest.cognizant.com/apps/DELiteMR/Tracking/Category/");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		finding of category
		
		 List<WebElement> list2 = Locator.findingCScreen(driver);
		System.out.println("No. of findings in Category Details Page:" + list2.size());
		assertEquals(list1.size(),list2.size(),"count does not match");
		
		logFile.myLog("TestCases", "Count verified");
		
		
	}
	
	
	@Test(dependsOnMethods = "countVerify")
	public static void mandateCheck() //Function for Mandate Check//
	{
		Locator.validateBtn(driver).click();
		mandateList = Locator.mandateField(driver);
		System.out.println(mandateList.size());
		
		for(WebElement w : mandateList) 	
		{
			if(w.isDisplayed())
			{
				System.out.println("Mandatory check is happening");
			}
			
		}
		
		logFile.myLog("TestCases", "mandate Check successful");
	}
	
	
	
	
	
	
	
	@Test(dependsOnMethods = "mandateCheck")
	public static void sendValues1()  //SENDING VALUES FOR FINDING 1//
	{
		waitForElement();
       //		EXCEL VALUE RETURN//
		try {
			excelValues = ExcelUtils.readexcel();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           //SENDING VALUES FOR FIRST FINDINGS//
		
		Locator.TextBox1(driver).sendKeys(excelValues[0]);
		Locator.TextBox2(driver).sendKeys(excelValues[1]);
		Locator.TextBox3(driver).sendKeys(excelValues[2]);
        Locator.ChooseOption1(driver).click();
		Locator.SMRCategory1(driver).sendKeys(excelValues[3]);
		Locator.SMRCategory1(driver).sendKeys(Keys.ENTER);
		Locator.timeButton1(driver).click();
	    Locator.timeButton1(driver).click();
		
		Locator.ChooseOption2(driver).click();
		 Locator.SMRCategory2(driver).sendKeys(excelValues[4]);
		 Locator.SMRCategory2(driver).sendKeys(Keys.ENTER);
		
		Locator.noRadioButton1(driver).click();
		Locator.RadioButtton(driver).click();
		Locator.CheckBox(driver).click();
		
		Locator.Date(driver).click();	
		Locator.datePicker(driver).click();

		//		WAIT
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		logFile.myLog("TestCases", "Values sent to mandatory fields successfully");

	}
	
	@Test(dependsOnMethods = "sendValues1")
	public static void expansionFirst()  //Expanding the first finding//
	{
	Locator.ClickOnExpansion(driver).click();
		
		String textBox1 = Locator.ExpansionTextBox1(driver).getAttribute("value");
		String textBox2 = Locator.ExpansionTextBox2(driver).getAttribute("value");
		String textBox3 = Locator.ExpansionTextBox3(driver).getAttribute("value");
		String Chooseoption1 = Locator.ExpansionChooseOption1(driver).getText();
		String Chooseoption2 = Locator.ExpansionChooseOption2(driver).getText();
//		String oldprojectid1=Locator.ExpansionOldProjectId1(driver).getAttribute("value");
		
             //VERIFYING VALUES FIRST FINDING//
		assertEquals(excelValues[0],textBox1,"Values dont match 1");
		assertEquals(excelValues[1],textBox2,"Values dont match 2");
		assertEquals(excelValues[2],textBox3,"Values dont match 3");
		assertEquals(excelValues[3],Chooseoption1,"Values dont match 4");
		assertEquals(excelValues[4],Chooseoption2,"Values dont match 5");
//		assertEquals(excelValues[5],oldprojectid1,"Values dont match 6");
		Locator.CloseExpansion(driver).click();
		
		logFile.myLog("TestCases", "Expansion test successful");
	}
	
	@Test(dependsOnMethods = "expansionFirst")
	public static void descriptionVerify1() //Verifying the finding 1 description//
	{
		waitForElement();
		
		String cData1 = Locator.CScreenDescription1(driver).getAttribute("value");
		
		System.out.println(cData1);
	
//		DriverSetup.getBrowser("https://deliveryexcellencest.cognizant.com/apps/DELiteMR/Categorize/FactRecord/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Locator.ClickOnExpansion(driver).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		String fData1 = Locator.FScreenDescription1(driver).getAttribute("textContent");
		Locator.CloseExpansion(driver).click();
	System.out.println("This is expand screen");
		System.out.println(fData1.trim());

		assertEquals(cData1,fData1.trim(),"Strings dont match 1");
		
		logFile.myLog("TestCases", "Description verified successfully");
	}
	
	
	@Test(dependsOnMethods = "descriptionVerify1")
	public static void sendValues2() //Sending mandatory Values for finding 2//
	{
		
		try {
			excelValues1 = ExcelUtils.readexcel1();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"smrCompletion1\"]")));
		 
		 Locator.TextBox5(driver).sendKeys(excelValues1[0]);
		 Locator.TextBox6(driver).sendKeys(excelValues1[1]);
		 Locator.TextBox7(driver).sendKeys(excelValues1[2]);
		 Locator.ChooseOption3(driver).click();
		 Locator.SMRCategory3(driver).sendKeys(excelValues1[3]);
		 Locator.SMRCategory3(driver).sendKeys(Keys.ENTER);
			
			Locator.ChooseOption4(driver).click();
			Locator.SMRCategory4(driver).sendKeys(excelValues1[4]);
			Locator.SMRCategory4(driver).sendKeys(Keys.ENTER);
		

		Locator.noRadioButton2(driver).click();
		Locator.RadioButtton1(driver).click();
		
		Locator.CheckBox1(driver).click();
        Locator.Date1(driver).click();
        Locator.datePicker1(driver).click();
        Locator.timeButton2(driver).click();
        Locator.timeButton2(driver).click();
        
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			Screenshot.screenshot(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	logFile.myLog("TestCases", "Values sent to mandatory fields successfully");
	
	}
	@Test(dependsOnMethods = "sendValues2")
	public static void expansionSecond() //Expanding the second screen to validate the values//
	{
		 Locator.ClickOnExpansion1(driver).click();
			
			String textBox4 = Locator.ExpansionTextBox4(driver).getAttribute("value");
			String textBox5 = Locator.ExpansionTextBox5(driver).getAttribute("value");
			String textBox6 = Locator.ExpansionTextBox6(driver).getAttribute("value");
			String Chooseoption3 = Locator.ExpansionChooseOption3(driver).getText();
			String Chooseoption4 = Locator.ExpansionChooseOption4(driver).getText();
			
//			String oldprojectid2=Locator.ExpansionOldProjectId2(driver).getAttribute("value");
			
			  //VERIFYING VALUES SECOND FINDING//
			assertEquals(excelValues1[0],textBox4,"Values dont match 6");
			assertEquals(excelValues1[1],textBox5,"Values dont match 7");
			assertEquals(excelValues1[2],textBox6,"Values dont match 8");
			assertEquals(excelValues1[3],Chooseoption3,"Values dont match 9");
			assertEquals(excelValues1[4],Chooseoption4,"Values dont match 10");
//			assertEquals(excelValues1[5],oldprojectid2,"Values dont match 11");
			
			Locator.CloseExpansion1(driver).click();
			
			logFile.myLog("TestCases", "Expansion test successful");
	}
	
	@Test(dependsOnMethods = "expansionSecond")
	public static void descriptionVerify2()  //verifying the finding 2 description with expanding screen//
	{
		String cData2 = Locator.CScreenDescription2(driver).getAttribute("value");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Locator.ClickOnExpansion1(driver).click();
		String fData2 = Locator.FScreenDescription2(driver).getAttribute("textContent");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Locator.CloseExpansion1(driver).click();
		
		assertEquals(cData2,fData2.trim(),"Strings dont match 2");
		
		logFile.myLog("TestCases", "Description verified successfully");
	}
	
	@AfterClass
	public static void closeBrowser() //Closing the Browser//
	{

		DriverSetup.close();
		logFile.myLog("TestCases", "Driver closed");
	}
	
	
}
