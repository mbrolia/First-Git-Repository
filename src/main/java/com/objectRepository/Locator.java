package com.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Locator {

	public static WebElement element = null;
	public static WebDriver driver;
	
	public static WebElement TextBox1(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//td[3]/div[2]/textarea"));//FOR CONTEXT TEXTBOX(FINDINGS 1)
		return element;
	}
	public static WebElement TextBox2(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//td[3]/div[3]/textarea"));//FOR CONDITION TEXTBOX(FINDINGS 1)
		return element;
	}
	public static WebElement TextBox3(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//td[3]/div[4]/textarea"));//FOR Consequence TEXTBOX(FINDINGS 1)
		return element;
	}
	public static WebElement ChooseOption1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//div[2]/ol/button/span[3]"));//SMR Actionable Category dropdown
//		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//ol/div/ul/li[2]/a"));//CHOOSING THE OPTION BCP(FINDINGS 1)
		return element;
	}
	public static WebElement ChooseOption2(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//div[7]//ol/button/span[3]"));//SMR Actionable Brief
//		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//div[7]/div[2]//ul//a"));//CHOOSING THE OPTION Inadequate BC Planning(FINDINGS 1)
		return element;
	}
	public static WebElement Date(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"smrCompletion0\"]"));//Agreed Completion Date(FINDINGS 1)
		return element;
	}
	
	public static WebElement timeButton1(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[1]//div[3]/span"));//ExpansionClose(FINDINGS 1)
		return element;
	}
	
	
	public static WebElement datePicker(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]/div[4]/div[12]/div/div/table/tbody[1]/tr[1]/td[3]/div[8]/div[2]//table/tbody/tr[5]/td[1]"));
		return element;
	}
	public static WebElement RadioButtton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"radio_23\"]/div[1]/div[1]"));//New Process of SMR implemented RadioButton(FINDINGS 1)
		return element;
	}
	public static WebElement TextBox4(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//div[2]/input"));//Old Project ID TextBox(FINDINGS 1)
		return element;
	}
	public static WebElement CheckBox(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//md-checkbox/div[1]"));//Old Project ID TextBox(FINDINGS 1)
		return element;
	}
	
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	public static WebElement TextBox5(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//td[3]//textarea"));//FOR CONTEXT TEXTBOX(FINDINGS 2)
		return element;
	}
	public static WebElement TextBox6(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[3]/textarea"));//FOR CONDITION TEXTBOX(FINDINGS 2)
		return element;
	}
	public static WebElement TextBox7(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[4]/textarea"));//FOR Consequence TEXTBOX(FINDINGS 2)
		return element;
	}
	public static WebElement ChooseOption3(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//span[3]"));//SMR Actionable Category dropdown(FINDINGS 2)
//		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div//li[2]/a"));//CHOOSING THE OPTION BCP
		return element;
	}
	public static WebElement ChooseOption4(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[7]//span[3]"));//SMR Actionable Brief(FINDINGS 2)
//		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[7]//li[1]/a"));//CHOOSING THE OPTION Inadequate BC Planning
		return element;
	}
	public static WebElement Date1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"dropdownsmrCompletion1\"]/div/span[1]/span"));//Agreed Completion Date(FINDINGS 2)
		return element;
	}
	
	public static WebElement timeButton2(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[3]/span"));//ExpansionClose(FINDINGS 1)
		return element;
	}
	
	public static WebElement datePicker1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]/div[4]/div[12]//table/tbody[2]/tr[1]/td[3]/div[8]/div[2]//table/tbody/tr[4]/td[6]"));
		return element;
	}
	public static WebElement RadioButtton1(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"radio_25\"]/div[1]/div[1]"));//New Process of SMR implemented RadioButton(FINDINGS 2)
		return element;
	}
	public static WebElement TextBox8(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[11]//input"));//Old Project ID TextBox(FINDINGS 2)
		return element;
	}
	public static WebElement CheckBox1(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//md-checkbox/div[1]"));//Old Project ID TextBox(FINDINGS 2)
		return element;
	}
	
	public static  List<WebElement> findingCScreen(WebDriver driver) //Findings of category page//
	{
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='CategoryDetail']/div[4]/div[12]/div/div/table/tbody/tr[1]"));
		return element;
		
	}
	
	public static  List<WebElement> findingFScreen(WebDriver driver) //Findings of fact recording sheet//
	{
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='categorizefindings']//tbody/tr"));
		return element;
		
	}
	
	public static WebElement SMRCategory1(WebDriver driver) //Locating element of finding 1 category dropdown//
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]/div[4]/div[12]/div/div/table/tbody[1]/tr[1]/td[3]/div[6]/div[2]/ol/div/div/input"));
		return element;
	}
	
	public static WebElement SMRCategory2(WebDriver driver)//Locating element of finding 1 category dropdown//
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[1]//div[7]//ol//input"));
		return element;
	}
	
	public static WebElement SMRCategory3(WebDriver driver)//Locating element of finding 2 category dropdown//
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[2]//input"));
		return element;
	}
	
	public static WebElement SMRCategory4(WebDriver driver)//Locating element of finding 2 category dropdown//
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[7]//input"));
		return element;
	}
	
	public static WebElement CScreenDescription1(WebDriver driver) //category screen description//
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]/div[4]/div[12]/div/div/table/tbody[1]/tr[1]/td[2]/textarea"));
		return element;
	}
	
	public static WebElement CScreenDescription2(WebDriver driver) //category screen description//
	{
		element = driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]/div[4]/div[12]/div/div/table/tbody[2]/tr[1]/td[2]/textarea"));
		return element;
	}
	public static WebElement FScreenDescription1(WebDriver driver) //fact screen description//
	{
		element = driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]/div/div[1]/p"));
		return element;
	}
	
	public static WebElement FScreenDescription2(WebDriver driver) //fact screen description//
	{
		element = driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]/div/div[1]/p"));
		return element;
	}
	
	public static WebElement noRadioButton1(WebDriver driver) //"no" radio button locator//
	{
		element = driver.findElement(By.xpath("//*[@id=\"radio_24\"]/div[1]/div[1]"));
		return element;
	}
	
	public static WebElement noRadioButton2(WebDriver driver) //"no" radio button locator//
	{
		element = driver.findElement(By.xpath("//*[@id=\"radio_26\"]/div[1]/div[1]"));
		return element;
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static WebElement ClickOnExpansion(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]/div[4]/div[12]/div/div/table/tbody[1]/tr[1]/td[3]/div[1]/div"));//ExpansionTextBox(FINDINGS 1)
		return element;
	}
	public static WebElement ExpansionTextBox1(WebDriver driver) 
	{
		element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//textarea"));//ExpansionTextBox(FINDINGS 1)
		return element;
	}
	
	public static WebElement ExpansionTextBox2(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//div[2]/div[2]/textarea"));//ExpansionTextBox(FINDINGS 1)
		return element;
	}
	
	public static WebElement ExpansionTextBox3(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//div[2]/div[3]/textarea"));//ExpansionTextBox(FINDINGS 1)
		return element;
	}
	
	public static WebElement ExpansionChooseOption1(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//div[4]/div//span[1]"));//ExpansionTextBox(FINDINGS 1)
		return element;
	}
	public static WebElement ExpansionChooseOption2(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//div[5]/div//span[1]"));//ExpansionTextBox(FINDINGS 1)
		return element;
	}
	
	public static WebElement CloseExpansion(WebDriver driver)
	{
		element= driver.findElement(By.xpath("//*[@id=\"SMRExpandedModal\"]/div/div/div[1]/button"));//ExpansionClose(FINDINGS 1)
		return element;
	}
	public static WebElement ClickOnExpansion1(WebDriver driver)
		{
			element= driver.findElement(By.xpath("//*[@id=\"CategoryDetail\"]//tbody[2]//div[1]/div"));//ExpansionTextBox(FINDINGS 1)
			return element;
		}
		
	
	public static WebElement ExpansionTextBox4(WebDriver driver)
		{
			element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//textarea"));//ExpansionTextBox(FINDINGS 1)
			return element;
		}
		public static WebElement ExpansionTextBox5(WebDriver driver)
		{
			element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//div[2]/textarea"));//ExpansionTextBox(FINDINGS 1)
			return element;
		}
		
	public static WebElement ExpansionTextBox6(WebDriver driver)
		{
			element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//div[3]/textarea"));//ExpansionTextBox(FINDINGS 1)
			return element;
		}
		public static WebElement ExpansionChooseOption3(WebDriver driver)
		{
			element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//div[4]/div//span[1]"));//ExpansionTextBox(FINDINGS 1)
			return element;
		}
		
	public static WebElement ExpansionChooseOption4(WebDriver driver) 
		{
			element= driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]//div[5]/div//span[1]"));//ExpansionTextBox(FINDINGS 1)
			return element;
		}
	
	public static WebElement CloseExpansion1(WebDriver driver) //closing the finding 2 expansion//
	{
		element= driver.findElement(By.xpath("//*[@id=\"SMRExpandedModal\"]/div/div/div[1]/button"));//ExpansionClose(FINDINGS 1)
		return element;
	}
	
	public static WebElement validateBtn(WebDriver driver) //locating validate button//
	{
		element = driver.findElement(By.xpath("//*[@id=\"SubmitCategory\"]"));
		return element;
	}
	
	
	public static List<WebElement> mandateField(WebDriver driver) //Mandate field locator//
	{
		List<WebElement> mandate = driver.findElements(By.xpath("//*[@id=\"CategoryDetail\"]/div[4]/div[12]/div/div/table/tbody/tr[1]/td[3]/div/div/span[2]"));
		return mandate;
	}
	

}
