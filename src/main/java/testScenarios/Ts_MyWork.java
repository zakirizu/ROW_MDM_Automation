package testScenarios;
import org.testng.annotations.Test;
import java.util.HashMap;
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
import pages.Pg_MyWork;
import utils.BaseClass;
import utils.KeyWords;

//Test Cases
/**
* SSS-> Screen Shot and save
* TC_01----DONE---->MyWork->Sections is opened or not->SSS
* TC_02----DONE---->MyWork->MyWorkList->CotivitiDownloadQueu->ValidateHeaders->Valdiate Request ID->SSS
* TC_03----DONE---->MyWork->MyWorkBasket->CotivitiDownloadQueu->ValidateHeaders->Valdiate Request ID->SSS
* TC_04----DONE---->MyWork->RequestGroups->Validate Headers->SSS
* TC_05----DONE---->MyWork->MyWorkBasket->CotivitiDownloadQueu->Validate->Data Is Visible in First Row->SSS

**/

public class Ts_MyWork {
	static Logger myLogger = LogManager.getLogger(Ts_MyWork.class.getName());
	WebDriver driver;
	Pg_Login loginPage;
	Pg_MyWork myWorkPage;
	KeyWords  keyWord;
	
	@BeforeMethod
	//@BeforeTest
	public void BrowserInitilazation() throws InterruptedException
	{
		driver 		= BaseClass.initializeDriver();
		loginPage 	= new Pg_Login(driver);
		myWorkPage 	= new Pg_MyWork(driver);
		keyWord		= new KeyWords(driver);			
	}
	
	//------------Test CASES Start 
	@SuppressWarnings("static-access")
	@Test
	public  void MyWork_TC_01_Validate_User_AbleTo_View_MyWork_Section() {
		try 
		{
			
		loginPage.loginApplicaiton();
		keyWord.clickElement(myWorkPage.getMyWork_Tab());
		keyWord.switchFrameByWebElement(myWorkPage.getMyWork_iframe());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getRequestGroup_section());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkLists_section());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkBaskets_section());
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public  void MyWork_TC_02_Validate_User_AbleTo_Select_MyWorkList_And_View_Headers() {
		try 
		{			
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("MyWork", "MyWork_TC_02");
		String wList = testData.get("workList");
		loginPage.loginApplicaiton();
		keyWord.clickElement(myWorkPage.getMyWork_Tab());
		keyWord.switchFrameByWebElement(myWorkPage.getMyWork_iframe());
		keyWord.SelectByVisibleText(myWorkPage.getMyWorkList_DDl(), wList);
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_RequestId_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_AccountName_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_PatientName_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_DOB_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_ServiceStartDate_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_ServiceEndDate_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_ClientClaimNumber_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_CotivitiClaimNumber_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_CaseAgeDays_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_DaysInWrokList_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_ExpirationDate_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_DeadLine_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkList_Status_Header());
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}
	}
	

	@SuppressWarnings("static-access")
	@Test
	public  void MyWork_TC_03_Validate_User_AbleTo_Select_MyWorkBasket_And_View_Headers() {
		try 
		{
			
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("MyWork", "MyWork_TC_03");
		String Wbskt = testData.get("workBasket");
		loginPage.loginApplicaiton();
		keyWord.clickElement(myWorkPage.getMyWork_Tab());
		keyWord.switchFrameByWebElement(myWorkPage.getMyWork_iframe());
		keyWord.SelectByVisibleText(myWorkPage.getMyWorkBasket_DDl(), Wbskt);
		keyWord.moveToWebElement(myWorkPage.getMyWorkBasket_AccountName_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkBasket_RequestId_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkBasket_AccountName_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkBasket_ExpirationDate_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkBasket_CaseAgeDays_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkBasket_DaysInWorkBasket_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkBasket_Deadline_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getMyWorkBasket_Status_Header());
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public  void MyWork_TC_04_Validate_User_AbleTo_View_RequestGroups_Headers() {
		try 
		{
			
		loginPage.loginApplicaiton();
		keyWord.clickElement(myWorkPage.getMyWork_Tab());
		keyWord.switchFrameByWebElement(myWorkPage.getMyWork_iframe());		
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getRequestGroups_RequestGroupID_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getRequestGroups_AssignedTeam_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getRequestGroups_OpenRequests_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getRequestGroups_WorkableRequests_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getRequestGroups_Urgency_Header());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getRequestGroups_DueToday_Header());
		
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public  void MyWork_TC_05_Validate_System_Retrives_Records_In_CotivitiDownLoadQue_yWorkBasket() {
		try 
		{
			
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("MyWork", "MyWork_TC_05");
		String Wbskt = testData.get("workBasket");
		loginPage.loginApplicaiton();
		keyWord.clickElement(myWorkPage.getMyWork_Tab());
		keyWord.switchFrameByWebElement(myWorkPage.getMyWork_iframe());
		keyWord.SelectByVisibleText(myWorkPage.getMyWorkBasket_DDl(), Wbskt);		
		keyWord.moveToWebElement(myWorkPage.getWBSearchResults_RequestID());		
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getWBSearchResults_RequestID());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getWBSearchResults_AccountName());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getWBSearchResults_ExpirationDate());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getWBSearchResults_CaseAge());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getWBSearchResults_DaysInWB());
		keyWord.explicitWait_Until_ElementDisplayed(myWorkPage.getWBSearchResults_Status());
		
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
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
