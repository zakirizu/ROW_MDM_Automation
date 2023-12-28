package testScenarios;
import org.testng.annotations.Test;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Pg_Admin;
import pages.Pg_Login;
import utils.BaseClass;
import utils.KeyWords;

//Test Cases
/**
* SSS-> Screen Shot and save
* TC_01----DONE---->Admin->UserManagment->Validate Fields FirstName, LastName, Email Visibility, Add User ->SSA
* TC_02----DONE---->Admin->UserManagment->Search with FirstName->Validate Headers->Validate results->SSS
* TC_03----DONE---->Admin->UserManagment->Search with EmailAddress->Validate Headers->Validate results->SSS
* TC_04----DONE---->Admin->FileUpload->Validate DSS Updates, File Uploads, Reset Investigation Flag, Create DIT File , Edit or Upload MR2MR3 Rules->SSS
* TC_05----DONE---->Admin->MR2MR3 Configuration->SSS
* TC_05----DONE---->Admin->CopyServiceConfiguration->SSS
**/

public class Ts_Admin{
	
	static Logger myLogger = LogManager.getLogger(Ts_Admin.class.getName());
	WebDriver driver;	
	Pg_Login loginPage;
	Pg_Admin adminPage;
	KeyWords KeyWord;
	
	@BeforeMethod
	//@BeforeTest
	public void BrowserInitilazation() throws InterruptedException
	{
		myLogger.info("----------------------------Test Case START----------------------------");
		driver 		= BaseClass.initializeDriver();
		loginPage 	= new Pg_Login(driver);
		adminPage	= new Pg_Admin(driver);	
		KeyWord		= new KeyWords(driver);		
	}
	
	@SuppressWarnings("static-access")
	@Test(priority = 1)
	public  void Admin_TC_01_Validate_User_AbleTo_View_SearchFields_TextBoxes_Under_UserManagement() {
		try 
		{
		loginPage.loginApplicaiton();
		KeyWord.clickElement(adminPage.getAdmin_btn());
		KeyWord.clickElement(adminPage.getUserManagement_btn());
		KeyWord.switchFrameByWebElement(adminPage.getUserManagment_iframe());		
		KeyWord.Element_Is_Displayed(adminPage.getFirstName_txtBox());
		KeyWord.Element_Is_Displayed(adminPage.getLastName_txtBox());
		KeyWord.Element_Is_Displayed(adminPage.getEmailAddresse_txtbox());
		KeyWord.Element_Is_Displayed(adminPage.getSearch_btn());
		KeyWord.Element_Is_Displayed(adminPage.getClear_btn());
	}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}
	}
	
	@SuppressWarnings("static-access")
	@Test(priority = 2)
	public  void Admin_TC_02_Validate_User_AbleTo_Search_With_FirstName_Under_UserManagement() {
		try 
		{
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("Admin", "Admin_TC_02");
		String firstName = testData.get("FirstName");
		loginPage.loginApplicaiton();
		KeyWord.clickElement(adminPage.getAdmin_btn());
		KeyWord.clickElement(adminPage.getUserManagement_btn());
		KeyWord.switchFrameByWebElement(adminPage.getUserManagment_iframe());		
		KeyWord.sendKeys(adminPage.getFirstName_txtBox(),firstName);
		KeyWord.clickElement(adminPage.getSearch_btn());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getSearchResult1());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getSearchResult2());		
		KeyWord.clickElement(adminPage.getClear_btn());	
		
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}
	}
	

	
	@SuppressWarnings("static-access")
	@Test(priority = 3)
	public  void Admin_TC_03_Validate_User_AbleTo_Search_Wiht_Email_Under_UserManagement() {
		try 
		{
		HashMap<String, String> testData 	= utils.ReadDataFromExcel.getExcelData("Admin", "Admin_TC_03");
		String Email = testData.get("Email");
		loginPage.loginApplicaiton();
		KeyWord.clickElement(adminPage.getAdmin_btn());
		KeyWord.clickElement(adminPage.getUserManagement_btn());
		KeyWord.switchFrameByWebElement(adminPage.getUserManagment_iframe());		
		KeyWord.sendKeys(adminPage.getEmailAddresse_txtbox(),Email);
		KeyWord.clickElement(adminPage.getSearch_btn());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getSearchResult1());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getSearchResult2());		
		KeyWord.clickElement(adminPage.getClear_btn());	
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}
	}
	
	@SuppressWarnings("static-access")
	@Test(priority = 4)
	public  void Admin_TC_04_Validate_User_ableTo_View_Fields_in_FileUpload_Section() {
		try 
		{		
		loginPage.loginApplicaiton();
		KeyWord.clickElement(adminPage.getAdmin_btn());
		KeyWord.clickElement(adminPage.getFileUpload_btn());
		KeyWord.switchFrameByWebElement(adminPage.getFileUploadsAdmin_Frame());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getDssUpdates_Section());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getFileUPloads_Section());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getResetInvestigationFlag_Section());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getCreateDitFile_Section());
		KeyWord.explicitWait_Until_ElementDisplayed(adminPage.getEditORUploadMr2Mr3Rules_Section());	
		
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: Admin_TC_04_Validate_User_ableTo_View_Fields_in_FileUpload_Section");	
			e.printStackTrace();				
		}
	}
	
	
	@SuppressWarnings("static-access")
	@Test(priority = 5)
	public  void Admin_TC_05_Validate_User_ableTo_View_MR2MR3Configuration_Section() {
		try 
		{
		loginPage.loginApplicaiton();
		KeyWord.clickElement(adminPage.getAdmin_btn());
		KeyWord.clickElement(adminPage.getMr2Mr3Configuration_Tab());
		KeyWord.switchFrameByWebElement(adminPage.getMr2Mr3Configuration_frame());
		
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: Admin_TC_05_Validate_User_ableTo_View_MR2MR3Configuration_Section");	
			e.printStackTrace();				
		}
	}

	
	@SuppressWarnings("static-access")
	@Test(priority = 6)
	public  void Admin_TC_06_Validate_User_ableTo_View_CopyServiceConfiguration_Section() {
		try 
		{
		loginPage.loginApplicaiton();
		KeyWord.clickElement(adminPage.getAdmin_btn());
		KeyWord.clickElement(adminPage.getCopyServiceConfiguration_Tab());
		KeyWord.switchFrameByWebElement(adminPage.getCopyServiceConfiguration_frame());
		
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: Admin_TC_06_Validate_User_ableTo_View_MR2MR3Configuration_Section");	
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
