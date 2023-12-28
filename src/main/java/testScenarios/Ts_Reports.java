package testScenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Pg_Login;
import pages.Pg_Reports;
import utils.BaseClass;
import utils.KeyWords;

//Test Cases
/**
* SSS-> Screen Shot and save
* TC_01--DONE----->Reports->ReportBrowser->Validate Actions , New Report ->SSS
* TC_02--DONE----->Reports->ReportBrowser->Manage Categories ->SSS
* TC_03--DONE----->Reports->ReportBrowser->All Reports->Category(CDQ)->Validate Search Results->SSS
* TC_04--DONE----->Reports->ReportBrowser->Select Two Categories->Check Count->Clear All->ShowAllReports->SS
* TC_05--DONE----->Reports->ReportBrowser->Total Uploads Per Day ->Open Report->Last 30 Days->Headers->SSS
**/

public class Ts_Reports {
	static Logger myLogger = LogManager.getLogger(Ts_MyWork.class.getName());
	WebDriver 	driver;
	Pg_Login 	loginPage;
	KeyWords  	keyword;	
	Pg_Reports  reports;
	
	
	@BeforeMethod
	//@BeforeTest
	public void BrowserInitilazation() throws InterruptedException
	{
		driver 		= BaseClass.initializeDriver();
		loginPage 	= new Pg_Login(driver);
		keyword		= new KeyWords(driver);		
		reports		= new Pg_Reports(driver);
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public  void Reports_TC_01_Validate_User_Is_AbleTo_View_Reports_Section() throws InterruptedException {
		
	try 
		{	
		
			loginPage.loginApplicaiton();
			keyword.clickElement(reports.getReport_Tab());
			keyword.switchFrameByWebElement(reports.getReports_frame());
			keyword.explicitWait_Until_ElementDisplayed(reports.getReportsSection());
			keyword.explicitWait_Until_ElementDisplayed(reports.getActions());
			keyword.explicitWait_Until_ElementDisplayed(reports.getNewReport());
			keyword.clickElement(reports.getActions());
		}
	
	catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: Reports_TC_01_Validate_User_Is_AbleTo_View_Reports_Section");	
			e.printStackTrace();
		}
	
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public  void Reports_TC_02_Validate_User_Is_AbleTo_Manage_Categories_In_ReportsSection() throws InterruptedException {
		
	try 
	{		
		loginPage.loginApplicaiton();
		keyword.clickElement(reports.getReport_Tab());
		keyword.switchFrameByWebElement(reports.getReports_frame());
		keyword.explicitWait_Until_ElementDisplayed(reports.getReportsSection());
		keyword.explicitWait_Until_ElementDisplayed(reports.getActions());
		keyword.clickElement(reports.getActions());	
		keyword.clickElement(reports.getManageCateogries());
		keyword.clickElement(reports.getBackToReports());	
	}
	
	catch(Exception e)
	{
		myLogger.info("Exception occured while Executing the Test Case: Reports_TC_01_Validate_User_Is_AbleTo_View_Reports_Section");	
		e.printStackTrace();
	}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public  void Reports_TC_03_Validate_User_Is_AbleTo_SearchAndView_CotivitDownLoadQue_Category_Reports() throws InterruptedException {
		
	try 
	{		
		loginPage.loginApplicaiton();
		keyword.clickElement(reports.getReport_Tab());
		keyword.switchFrameByWebElement(reports.getReports_frame());
		keyword.clickElement(reports.getAllReports_lnk());
		keyword.explicitWait_Until_ElementDisplayed(reports.getCategory_UnderAllReports());
		keyword.SendKeys_Into_AutoSuggestiveTextBox(reports.getCategory_UnderAllReports(), "Cotiviti Download Queue Reporting");
		keyword.explicitWait_Until_ElementDisplayed(reports.getCDQReport_Results());
		keyword.explicitWait_Until_ElementDisplayed(reports.getTotalUploadsPerDayReport());
		keyword.explicitWait_Until_ElementDisplayed(reports.getTotalUploadsByAgentReport());
		keyword.moveToWebElement(reports.getTotalUploadsByAgentReport());
		keyword.explicitWait_Until_ElementDisplayed(reports.getTotalUploadsPerDayCotivitiDownloadReport());
	}
	
	catch(Exception e)
	{
		myLogger.info("Exception occured while Executing the Test Case: Reports_TC_01_Validate_User_Is_AbleTo_View_Reports_Section");	
		e.printStackTrace();
	}
}
	

	@SuppressWarnings("static-access")
	@Test
	public  void Reports_TC_04_Validate_User_Is_AbleTo_SearchAndView_and_Clear_Different_Category_Reports() throws InterruptedException {
		
	try 
	{		
		loginPage.loginApplicaiton();
		keyword.clickElement(reports.getReport_Tab());
		keyword.switchFrameByWebElement(reports.getReports_frame());
		keyword.clickElement(reports.getAllReports_lnk());
		keyword.explicitWait_Until_ElementDisplayed(reports.getCategory_UnderAllReports());
		keyword.SendKeys_Into_AutoSuggestiveTextBox(reports.getCategory_UnderAllReports(), "Cotiviti Download Queue Reporting");
		keyword.SendKeys_Into_AutoSuggestiveTextBox(reports.getCategory_UnderAllReports(), "Data");
		keyword.SendKeys_Into_AutoSuggestiveTextBox(reports.getCategory_UnderAllReports(), "CSHC");
		keyword.clickElement(reports.getclearAll_Link());
		keyword.shortWait();
		keyword.explicitWait_Until_ElementDisplayed(reports.getShowingAllReports_AllReports());
	}
	
	catch(Exception e)
	{
		myLogger.info("Exception occured while Executing the Test Case: Reports_TC_01_Validate_User_Is_AbleTo_View_Reports_Section");	
		e.printStackTrace();
	}
}
	
	
	@SuppressWarnings("static-access")
	@Test
	public  void Reports_TC_05_Validate_User_Is_AbleTo_View_TotalUploadsPerDayReport_And_Headers() throws InterruptedException {
		
	try 
	{			
		loginPage.loginApplicaiton();
		keyword.clickElement(reports.getReport_Tab());
		keyword.switchFrameByWebElement(reports.getReports_frame());
		keyword.clickElement(reports.getAllReports_lnk());
		keyword.explicitWait_Until_ElementDisplayed(reports.getCategory_UnderAllReports());
		keyword.SendKeys_Into_AutoSuggestiveTextBox(reports.getCategory_UnderAllReports(), "Cotiviti Download Queue Reporting");
		keyword.explicitWait_Until_ElementDisplayed(reports.getCDQReport_Results());
		keyword.explicitWait_Until_ElementDisplayed(reports.getTotalUploadsPerDayReport());
		keyword.moveToWebElement(reports.getTotalUploadsPerDayReport());
		keyword.doubleClick(reports.getTotalUploadsPerDayReport());
		keyword.switchToDefaultContent();
		keyword.switchFrameByWebElement(reports.getTotalUploadsPerDay_Frame());
		keyword.SelectByVisibleText(reports.getTotalUploadsPerDayReport_SelectDate(),"Last 30 days");
		keyword.clickElement(reports.getTotalUploadsPerDay_GenerateReport());
		keyword.explicitWait_Until_ElementDisplayed(reports.getGraphChart());
		keyword.shortWait();
		keyword.moveToWebElement(reports.getTotalUploadsPerDay_UploadDate_Header());
		keyword.explicitWait_Until_ElementDisplayed(reports.getTotalUploadsPerDay_UploadDate_Header());
		keyword.explicitWait_Until_ElementDisplayed(reports.getTotalUploadsPerDay_SuccessUploads_Header());
		keyword.explicitWait_Until_ElementDisplayed(reports.getTotalUploadsPerDay_FailedUploads_Header());
		keyword.explicitWait_Until_ElementDisplayed(reports.getTotalUploadsPerDay_TotalUploads_Header());
	}
	
	catch(Exception e)
	{
		myLogger.info("Exception occured while Executing the Test Case: Reports_TC_01_Validate_User_Is_AbleTo_View_Reports_Section");	
		e.printStackTrace();
	}
}	
	
	
	
	@AfterMethod
	//@AfterTest
	public void closeAll() {
		driver.close();
		myLogger.info("----------------------------Test Case END----------------------------");		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
