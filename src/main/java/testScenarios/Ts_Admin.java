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

public class Ts_Admin {
	static Logger myLogger = LogManager.getLogger(Ts_Admin.class.getName());
	WebDriver driver;
	Pg_Login loginPage;	
	KeyWords  keyWord;

	// This is common piece of code which runs before every test case
	@BeforeMethod
	public void BrowserInitilazation() throws InterruptedException
	{
		driver 		= BaseClass.initializeDriver();
		loginPage 	= new Pg_Login(driver);		
		keyWord		= new KeyWords(driver);			
	}
	
	//------------Test CASES Start 
	@SuppressWarnings("static-access")
	@Test
	public  void MyWork_TC_01_Validate_User_AbleTo_View_MyWork_Section() {
		try 
		{
			
		loginPage.loginApplicaiton();
		
		}
		catch(Exception e)
		{
			myLogger.info("Exception occured while Executing the Test Case: UserManagement");	
			e.printStackTrace();				
		}
	}
	

	
	// This is common piece of code which runs after every test case
	@AfterMethod
	public void closeAll() {
		driver.close();
		myLogger.info("----------------------------Test Case END----------------------------");		
		driver.quit();
	}
	
	
	
}