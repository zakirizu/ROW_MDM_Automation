package testScenarios;

import org.testng.annotations.Test;
import java.awt.RenderingHints.Key;

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
import pages.Pg_Admin;
import pages.Pg_DashBoard;
import pages.Pg_Login;
import pages.Pg_MyWork;
import utils.BaseClass;
import utils.KeyWords;

//Test Cases
/**
* SSS-> Screen Shot and save
* TC_01-----DONE--->DashBoard->Validate visibility of Case Ageining, Case Volume on Daily Basis , Request Groups , Team Members->SSS
* TC_02-----DONE--->DashBoard->Validate all the charts are displayed
* TC_03-----DONE--->DashBoard->Expand Request Groups->Validate Headers->
* TC_04-----DONE--->DashBoard->Expand Team Members->Validate Headers->
* TC_05-----DONE--->DashBoard->Expand Request Groups->Validate RGs are displayed
**/

public class Ts_DashBoard {

	static Logger myLogger = LogManager.getLogger(Ts_Admin.class.getName());
	WebDriver driver;	
	Pg_Login loginPage;
	Pg_Admin adminPage;
	Pg_DashBoard dashBoard;
	KeyWords KeyWord;
	Pg_MyWork myWorkPage;
	
	
	@BeforeMethod
	//@BeforeTest
	public void BrowserInitilazation() throws InterruptedException
	{
		myLogger.info("TEST CASE START----------------------------");
		driver 		= BaseClass.initializeDriver();
		loginPage 	= new Pg_Login(driver);
		adminPage	= new Pg_Admin(driver);	
		KeyWord		= new KeyWords(driver);
		dashBoard	= new Pg_DashBoard(driver);
		myWorkPage 	= new Pg_MyWork(driver);
	
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Dashboard_TC_01_Validate_UserIs_Able_To_View_Sections_In_DashBoard() {
		try 
		{
		//* TC_01-----DONE--->DashBoard->Validate visibility of Case Agining, Case Volume on Daily Basis , Request Groups , Team Members->SSS
		loginPage.loginApplicaiton();
		KeyWord.Element_Is_Displayed(dashBoard.getCaseAgingSection_section());
		KeyWord.Element_Is_Displayed(dashBoard.getCaseVolumeOnDailyBasis_section());	
		KeyWord.moveToWebElement(dashBoard.getRequestGroups_section());
		KeyWord.Element_Is_Displayed(dashBoard.getRequestGroups_section());
		KeyWord.moveToWebElement(dashBoard.getTeamMembers_Section());	
		KeyWord.Element_Is_Displayed(dashBoard.getTeamMembers_Section());
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}		
	}
	
	
	
	@SuppressWarnings("static-access")
	@Test
	public void Dashboard_TC_02_Validate_UserIs_Able_To_CloseAll_Frames_In_DashBoard() {
		try 
		{
		loginPage.loginApplicaiton();
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getCaseAging_Report());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getCaseVolumeOnDailyBasis_Report());
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void Dashboard_TC_03_Validate_UserIs_Able_Expand_And_View_Headers_Under_RequestGroup_Section() {
		try 
		{
		//TC_03-----DONE--->DashBoard->Expand Request Groups->Validate Headers->
		loginPage.loginApplicaiton();		
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getRequestGroups_section());
		KeyWord.clickElement(dashBoard.getRequestGroups_section());
		KeyWord.moveToWebElement(dashBoard.getRequestGroupID_DashBoardRG_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getRequestGroupID_DashBoardRG_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getAssignedAgent_DashBoardRG_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getAssignedAgent_DashBoardRG_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getOpenRequests_DashBoardRG_Headers());
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}		
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void Dashboard_TC_04_Validate_UserIs_Able_Expand_And_View_Headers_Under_TeamMembers_Section() {
		try 
		{
		//TC_04-----DONE--->DashBoard->Expand Team Members->Validate Headers->
		loginPage.loginApplicaiton();		
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getRequestGroups_section());
		KeyWord.clickElement(dashBoard.getTeamMembers_Section());	
		KeyWord.moveToWebElement(dashBoard.getUseDetails_DashBoardTeamMembrs_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getUseDetails_DashBoardTeamMembrs_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getCountOfWorkableRequest_DashBoardTeamMembrs_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getTotalRGs_DashBoardTeamMembrs_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getTotalDueToday_DashBoardTeamMembrs_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getCountOfDueToday_DashBoardTeamMembrs_Headers());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getTotalNonWorkable_DashBoardTeamMembrs_Headers());
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}		
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void Dashboard_TC_05_Validate_RG_Result_are_Displayed_Under_RequestGroup_Section() {
		try 
		{
		//TC_05-----DONE--->DashBoard->Expand Request Groups->Validate RGs are displayed
		loginPage.loginApplicaiton();		
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getRequestGroups_section());
		KeyWord.clickElement(dashBoard.getRequestGroups_section());
		//KeyWord.moveToWebElement(dashBoard.getRequestGroupID_DashBoardRG_Headers());
		KeyWord.moveToWebElement(dashBoard.getFirstROW_RGID_SearchResults());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getFirstROW_RGID_SearchResults());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getFirstROW_AssignedTeam_SearchResults());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getFirstROW_AssignedAgent_SearchResults());
		KeyWord.explicitWait_Until_ElementDisplayed(dashBoard.getFirstROW_OpenRequests_SearchResults());
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
