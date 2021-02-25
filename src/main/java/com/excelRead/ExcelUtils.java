package com.excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtils {

	public static File src;
	//public static String exefilepath = System.getProperty("user.dir")+"\\src\\test\\resources\\DataTables\\DeliteApplication-SMR.xlsx";
	public static String exefilepath = "C:\\Users\\hshub\\eclipse-workspace\\DELite_SMR_07\\src\\main\\resources\\Excel\\DeliteApplication-SMR.xlsx";
	public static FileInputStream fileip;
	public static FileOutputStream fileop;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static String val1;
	public static XSSFRow row;
	public static XSSFRow row1;
//	public static int cell;
	public static XSSFRow Row;

	public static String[] category = new String[14];
	public static String[] category1 = new String[14];
//	public static String category1;
	public static String category3;
	public static String category4;
	public static String category5;
	
	public static String category6;
	public static String category7;
	public static String category8;
	public static String category9;
	public static String category10;
	public static String category11;
	public static String category12;

//reading the data from excel file//
	public static String[] readexcel() throws IOException {
	
			src = new File(exefilepath);
			fileip = new FileInputStream(src);
			workbook = new XSSFWorkbook(fileip);
			sheet = workbook.getSheetAt(0);
			row = sheet.getRow(2);
			for (int i = 0; i <row.getLastCellNum(); i++)
			{
			 category[i] = (row.getCell(i).getStringCellValue());

			}
	
			 return category;
	}
	
	//reading the data from excel file//
	public static String[] readexcel1() throws IOException {
		
		src = new File(exefilepath);
		fileip = new FileInputStream(src);
		workbook = new XSSFWorkbook(fileip);
		sheet = workbook.getSheetAt(0);
		row1 = sheet.getRow(6);

		for (int i = 0; i <row1.getLastCellNum(); i++)
		{
		 category1[i] = (row1.getCell(i).getStringCellValue());

		}

		 return category1;
		
		
}
	

}

