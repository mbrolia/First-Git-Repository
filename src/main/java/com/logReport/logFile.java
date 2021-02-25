package com.logReport;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logFile {
	
	
	
	public static void myLog(String clName, String msg)
	{
		Logger logger=Logger.getLogger(clName);
		 PropertyConfigurator.configure("log4j.properties"); //Configure log file property
		 logger.info(msg);
	}
	
             
}
