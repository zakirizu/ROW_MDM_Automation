package factory;

import java.io.File;

import utils.PropertiesFileReader;



public interface Constants {	
	String PROJECT_PATH 	= System.getProperty("user.dir");
	String RESOURCES 		= PROJECT_PATH + File.separator + "Resources";	
	String PROPERTYFILE 	= PROJECT_PATH + File.separator + "Resources"+ File.separator + "propertyFile.properties";
	String DIT_FILE			= PROJECT_PATH + File.separator + "TestData" + File.separator + "DIT_File.xlsx";
	String UI_TESTDATA		= PROJECT_PATH + File.separator + "TestData" + File.separator + "UI_TestData.xlsx";
	String SCREENSHOT       = PROJECT_PATH + File.separator + "ScreenShots";
	String REPORTS       	= PROJECT_PATH + File.separator + "Reports";
	String Environment		= PropertiesFileReader.getProperty("Env");
}
