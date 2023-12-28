package testScenarios;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.awt.RenderingHints.Key;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Pg_Login;
import pages.Pg_RequestGroup;
import pages.Pg_Search;
import utils.BaseClass;
import utils.KeyWords;


//Test Cases
/**
 * SSS-> Screen Shot and save
 * TC_01----DONE---->Search->Request Status(Confirmation) -> Search-> Headers Validate->SSS->Click on First RG-> Switch to RG->SSS
 * TC_02----DONE---->Search Tab->Copy Request ID-> Clear -> Validate Headers are Removed->Search with Request ID ->Validate Headers
 * TC_03----DONE---->Search Tab->Copy Request ID-> Clear -> Validate Headers are Removed->Search with Request ID ->Validate Headers
 * TC_04-------->Search Tab->Copy Request ID with RG ID Assosiated to IT->Hamberger Menu ->View Notes are History->SSS
 * TC_05-------->Search Tab-> Frame switch ->RGID-> Validate Headers->Click on the RG->Switch To RGSection ->SS
 * TC_06-------->Search with RGID->Export Results->Validate the File->Mention the RG ID in Logger -> SSS
 **/


public class Ts_Search {
	static Logger myLogger = LogManager.getLogger(Ts_Admin.class.getName());
	WebDriver driver;	
	Pg_Login loginPage;
	Pg_Search searchPage;
	KeyWords keyWord;
	Pg_RequestGroup rgSection;
	
	
	@BeforeMethod
	//@BeforeTest
	public void BrowserInitilazation() throws InterruptedException
	{
		myLogger.info("----------------------------Test Case START----------------------------");
		driver 		= BaseClass.initializeDriver();
		loginPage 	= new Pg_Login(driver);
		searchPage	= new Pg_Search(driver);	
		keyWord		= new KeyWords(driver);
		rgSection	= new Pg_RequestGroup(driver);
			
	}
	
	

	
	@SuppressWarnings("static-access")
	@Test(priority = 1)
	public void Search_TC_01_Validate_User_Is_Able_To_ViewSearchOptions_and_Search_With_Status_And_Open_An_RG() {
		
	try 
		{	
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("Search", "Search_TC_01");
		String status = testData.get("Confirmation");	
		String status2 = testData.get("ActionDenied");			
		loginPage.loginApplicaiton();
		keyWord.clickElement(searchPage.getSearchTab_btn());
		keyWord.switchFrameByWebElement(searchPage.getSearchSection_Frame());	
		keyWord.Element_Is_Displayed(searchPage.getRequestID());
		keyWord.Element_Is_Displayed(searchPage.getRequestGroupID());
		keyWord.Element_Is_Displayed(searchPage.getCaseID());
		keyWord.Element_Is_Displayed(searchPage.getRequestStatus());
		keyWord.Element_Is_Displayed(searchPage.getMedicalReordNumber());
		keyWord.Element_Is_Displayed(searchPage.getCotivitiClaimNumber());
		keyWord.Element_Is_Displayed(searchPage.getClientClaimNumber());
		keyWord.Element_Is_Displayed(searchPage.getExpirationDate());
		keyWord.Element_Is_Displayed(searchPage.getRetrievalType());			
		keyWord.Element_Is_Displayed(searchPage.getAdvanceSearch());
		keyWord.SelectByVisibleText(searchPage.getRequestStatus(), status);
		keyWord.clickElement(searchPage.getSearch());
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRG_inSearchResults());	
		keyWord.clickElement(searchPage.getClear());
		keyWord.mediumWait();
		keyWord.SelectByVisibleText(searchPage.getRequestStatus(), status2);
		keyWord.clickElement(searchPage.getSearch());
		keyWord.longWait();
		keyWord.clickElement(searchPage.getClear());
		}
		
	catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: searchFieldsValidation");	
			e.printStackTrace();				
		}		
	}
	
	@SuppressWarnings("static-access")
	@Test(priority = 2)
	public void Search_TC_02_Validate_User_Is_Able_To_Search_With_RequestGroupID() {
	try 
		{	
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("Search", "Search_TC_02");
		String RequestStatus = testData.get("RequstStatus");		
		loginPage.loginApplicaiton();
		keyWord.clickElement(searchPage.getSearchTab_btn());			
		keyWord.switchFrameByWebElement(searchPage.getSearchSection_Frame());		
		keyWord.SelectByVisibleText(searchPage.getRequestStatus(), RequestStatus);				
		keyWord.clickElement(searchPage.getSearch());			
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRG_inSearchResults());		
		String RGID = keyWord.getTextOfWebElement(searchPage.getFirstRG_inSearchResults());	
		keyWord.clickElement(searchPage.getClear());
		keyWord.mediumWait();		
		keyWord.sendKeys(searchPage.getRequestGroupID(), RGID);	
		keyWord.clickElement(searchPage.getSearch());		
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRG_inSearchResults());	
		keyWord.clickElement(searchPage.getFirstRG_inSearchResults());			
		keyWord.shortWait();
		keyWord.switchToDefaultContent();		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGSection_Frame());
		keyWord.switchFrameByWebElement(rgSection.getRGSection_Frame());		
		keyWord.longWait();			
		}
	catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: Search_TC_02_Validate_User_Is_Able_To_Search_With_RequestGroupID");	
			e.printStackTrace();	
			Assert.assertTrue(false, "Exception occured while Executing the Test Case: Search_TC_02_Validate_User_Is_Able_To_Search_With_RequestGroupID.");
		}
	}
	
	
	@SuppressWarnings("static-access")
	@Test(priority = 03)
	public void Search_TC_03_Validate_User_Is_View_TableHeaders_In_Search_Results() {
	try 
		{	
		loginPage.loginApplicaiton();
		keyWord.clickElement(searchPage.getSearchTab_btn());		
		keyWord.switchFrameByWebElement(searchPage.getSearchSection_Frame());	
		keyWord.Element_Is_Displayed(searchPage.getRequestID_Header());
		keyWord.Element_Is_Displayed(searchPage.getRequestGroupID_Header());
		keyWord.Element_Is_Displayed(searchPage.getRequestStatus_Header());
		keyWord.Element_Is_Displayed(searchPage.getAssignedAgent_Header());
		keyWord.Element_Is_Displayed(searchPage.getAssignedAgent_Header());
		keyWord.Element_Is_Displayed(searchPage.getPatientName_Header());
		keyWord.Element_Is_Displayed(searchPage.getCotivitiClaimNumber_Header());
		keyWord.Element_Is_Displayed(searchPage.getClaimEntityName_Header());
		keyWord.Element_Is_Displayed(searchPage.getExportResults_btn());
		}
	catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: searchFieldsValidation");	
			e.printStackTrace();				
		}		
	}
	
	
	//TC_03-------->Search Tab->Copy Request ID with RG ID Assosiated to IT->Hamberger Menu ->View Notes are History->SSS
	@SuppressWarnings("static-access")
	@Test(priority = 2)
	public void Search_TC_04_Validate_User_Is_Able_To_Search_With_RequestGroupID() {
	try 
		{	
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("Search", "Search_TC_02");
		String RequestStatus = testData.get("RequstStatus");	
		
		loginPage.loginApplicaiton();
		keyWord.clickElement(searchPage.getSearchTab_btn());			
		keyWord.switchFrameByWebElement(searchPage.getSearchSection_Frame());		
		keyWord.SelectByVisibleText(searchPage.getRequestStatus(), RequestStatus);				
		keyWord.clickElement(searchPage.getSearch());			
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRG_inSearchResults());
		
		String RGID = keyWord.getTextOfWebElement(searchPage.getFirstRG_inSearchResults());	
		keyWord.clickElement(searchPage.getClear());
		keyWord.mediumWait();		
		keyWord.sendKeys(searchPage.getRequestGroupID(), RGID);	
		keyWord.clickElement(searchPage.getSearch());		
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRequestIDInSearchResults());	
		KeyWords.clickElement(searchPage.getFirstHambergerMenuInSearchResults());
		keyWord.clickElement(searchPage.getViewNotesOrHistory());
		keyWord.longWait();
		
		keyWord.SwitchToWindow();		
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getViewNotes());
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getViewNotesCreatedBY());
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getViewNotesCreatedDate());
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getViewNotesNoteType());
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getViewNotesDescription());
				
		keyWord.clickElement(searchPage.getHistoryDetails());
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getHistoryDetailsDateAndTime());
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getHistoryDetailsHistory());
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getHistoryDetailsPerfomedBy());		
		keyWord.switchToDefaultContent();

		}
	catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: Search_TC_02_Validate_User_Is_Able_To_Search_With_RequestGroupID");	
			e.printStackTrace();	
			Assert.assertTrue(false, "Exception occured while Executing the Test Case: Search_TC_02_Validate_User_Is_Able_To_Search_With_RequestGroupID.");
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void TC__clickOnRG() {
		
	try 
		{	
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("Search", "TC_04_clickOnRG");
		String RequestStatus = testData.get("RequstStatus");		
		loginPage.loginApplicaiton();
		keyWord.clickElement(searchPage.getSearchTab_btn());			
		keyWord.switchFrameByWebElement(searchPage.getSearchSection_Frame());		
		keyWord.SelectByVisibleText(searchPage.getRequestStatus(), RequestStatus);		
		keyWord.clickElement(searchPage.getSearch());		
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRG_inSearchResults());		
		keyWord.clickElement(searchPage.getFirstRG_inSearchResults());
		keyWord.switchToDefaultContent();
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGSection_Frame());
		keyWord.switchFrameByWebElement(rgSection.getRGSection_Frame());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGBasicInformation());
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGContactInformation());
		keyWord.clickElement(rgSection.getRGContactInformation());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFirstNameContactInformation());
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFacilityPractitionerLinking());
		keyWord.clickElement(rgSection.getRGFacilityPractitionerLinking());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFacilityNameFPLinking());		
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAddressInformation());
		keyWord.clickElement(rgSection.getRGAddressInformation());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAddresseeNameAddressInformation());
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAdditionalInformation());
		keyWord.clickElement(rgSection.getRGAdditionalInformation());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRFEMRSystemAdditionalInformation());
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGHoursOfOperation());
		keyWord.clickElement(rgSection.getRGHoursOfOperation());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGTimeZoneHoursOfOperation());
			
		
		}
	catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: TC_04_clickOnRG");	
			e.printStackTrace();	
			Assert.assertTrue(false, "Exception occured while Executing the Test Case: TC_04_clickOnRG.");
		}
		
		
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void TC_RG_Search_Section() {
		
	try 
		{	
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("Search", "TC_04_clickOnRG");
		String RequestStatus = testData.get("RequstStatus");		
		loginPage.loginApplicaiton();
		keyWord.clickElement(searchPage.getSearchTab_btn());			
		keyWord.switchFrameByWebElement(searchPage.getSearchSection_Frame());		
		keyWord.SelectByVisibleText(searchPage.getRequestStatus(), RequestStatus);				
		keyWord.clickElement(searchPage.getSearch());			
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRG_inSearchResults());		
		String RGID = keyWord.getTextOfWebElement(searchPage.getFirstRG_inSearchResults());	
		keyWord.shortWait();
		keyWord.clickElement(searchPage.getClear());
		keyWord.longWait();		
		keyWord.sendKeys(searchPage.getRequestGroupID(), RGID);	
		keyWord.clickElement(searchPage.getSearch());		
		keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRG_inSearchResults());	
		keyWord.clickElement(searchPage.getFirstRG_inSearchResults());			
		keyWord.shortWait();
		KeyWords.switchToDefaultContent();		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGSection_Frame());
		keyWord.switchFrameByWebElement(rgSection.getRGSection_Frame());		
		keyWord.longWait();	
		keyWord.longWait();	
		
		///Need t
		//
		JavascriptExecutor js 	= 	(JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//div[@param_name='EXPANDEDSubSectionBasicInformationB']"));
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);	
		//
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGBasicInformation());	
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGContactInformation());
		keyWord.clickElement(rgSection.getRGContactInformation());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFirstNameContactInformation());
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFacilityPractitionerLinking());
		//keyWord.clickElement(rgSection.getRGFacilityPractitionerLinking());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFacilityNameFPLinking());		
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAddressInformation());
		keyWord.clickElement(rgSection.getRGAddressInformation());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAddresseeNameAddressInformation());
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAdditionalInformation());
		keyWord.clickElement(rgSection.getRGAdditionalInformation());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRFEMRSystemAdditionalInformation());
		
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGHoursOfOperation());
		keyWord.clickElement(rgSection.getRGHoursOfOperation());
		keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGTimeZoneHoursOfOperation());
		}
	catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: TC_04_clickOnRG");	
			e.printStackTrace();	
			Assert.assertTrue(false, "Exception occured while Executing the Test Case: TC_04_clickOnRG.");
		}
	}
		
	
	@SuppressWarnings("static-access")
	@Test
	public void TCDEMO() {
		
		try 
			{	
			HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("Search", "TC_04_clickOnRG");
			//String RequestStatus = testData.get("RequstStatus");		
			loginPage.loginApplicaiton();
			keyWord.clickElement(searchPage.getSearchTab_btn());			
			keyWord.switchFrameByWebElement(searchPage.getSearchSection_Frame());	
			
			//keyWord.SelectByVisibleText(searchPage.getRequestStatus(), RequestStatus);				
			//keyWord.clickElement(searchPage.getSearch());			
			//keyWord.explicitWaitUntilElementDisplayed(searchPage.getFirstRG_inSearchResults());		
			String RGID = "R508339400";	
			//keyWord.shortWait();
			//keyWord.clickElement(searchPage.getClear());
			//keyWord.longWait();		
			keyWord.sendKeys(searchPage.getRequestGroupID(), RGID);	
			keyWord.clickElement(searchPage.getSearch());		
			keyWord.explicitWait_Until_ElementDisplayed(searchPage.getFirstRG_inSearchResults());	
			keyWord.clickElement(searchPage.getFirstRG_inSearchResults());			
			keyWord.shortWait();
			KeyWords.switchToDefaultContent();		
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGSection_Frame());
			keyWord.switchFrameByWebElement(rgSection.getRGSection_Frame());		
			keyWord.longWait();	
			keyWord.longWait();	
			
			///Need t
			//
			JavascriptExecutor js 	= 	(JavascriptExecutor) driver;
			WebElement ele = driver.findElement(By.xpath("//div[@param_name='EXPANDEDSubSectionBasicInformationB']"));
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')", ele);	
			//
			
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGBasicInformation());	
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGContactInformation());
			keyWord.clickElement(rgSection.getRGContactInformation());
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFirstNameContactInformation());
			
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFacilityPractitionerLinking());
			//keyWord.clickElement(rgSection.getRGFacilityPractitionerLinking());
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGFacilityNameFPLinking());		
			
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAddressInformation());
			keyWord.clickElement(rgSection.getRGAddressInformation());
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAddresseeNameAddressInformation());
			
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGAdditionalInformation());
			keyWord.clickElement(rgSection.getRGAdditionalInformation());
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRFEMRSystemAdditionalInformation());
			
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGHoursOfOperation());
			keyWord.clickElement(rgSection.getRGHoursOfOperation());
			keyWord.explicitWait_Until_ElementDisplayed(rgSection.getRGTimeZoneHoursOfOperation());
			}
		catch(Exception e)
			{
				myLogger.info("Exception occured while Executing the Test Case: TC_04_clickOnRG");	
				e.printStackTrace();	
				Assert.assertTrue(false, "Exception occured while Executing the Test Case: TC_04_clickOnRG.");
			}
		}
	
	@AfterMethod
	//@AfterTest
	public void closeAll() {
		driver.quit();
		myLogger.info("----------------------------Test Case END----------------------------");		
		driver.quit();
	}

}


