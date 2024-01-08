package pages;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;
import utils.KeyWords;
import utils.PropertiesFileReader;

public class Pg_Login extends BaseClass {
	
	public static WebDriver driver ;
	static KeyWords keyWord = new KeyWords(driver);
	static Logger myLogger = LogManager.getLogger(Pg_Login.class.getName());
	String Environment = PropertiesFileReader.getProperty("Env");
	public Pg_Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
//WebElements
	@FindBy(xpath = "//input[@name='username']")
	private static WebElement userName_txtBox;
	
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement passWord_txtBox;
	

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement login_Button;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	

	public static WebElement getUserName_txtBox() {
		return userName_txtBox;
	}

	public static WebElement getPassWord_txtBox() {
		return passWord_txtBox;
	}

	public static WebElement getLogin_Button() {
		return login_Button;
	}



	
	
	 @SuppressWarnings("static-access")
	public  void loginApplicaiton() throws InterruptedException {
	
	try 
	{
		if(Environment.equalsIgnoreCase("QA"))
			{
			mylogger.info("Error While Initializing the BrowserType : "+browserType +". Environment:"+Environment);
			driver.get(utils.PropertiesFileReader.getProperty("QA_URL"));			
			keyWord.shortWait();
			keyWord.sendKeys(getUserName_txtBox(), PropertiesFileReader.getProperty("QA_UserID"));
			keyWord.sendKeys(passWord_txtBox, PropertiesFileReader.getProperty("QA_Pwd"));
			keyWord.shortWait();
			keyWord.clickElement(login_Button);
				
			}
		else if(Environment.equalsIgnoreCase("UAT"))
			{
			driver.get(utils.PropertiesFileReader.getProperty("UAT_URL"));		
			keyWord.sendKeys(getUserName_txtBox(), PropertiesFileReader.getProperty("UAT_UserID"));
			keyWord.sendKeys(passWord_txtBox, PropertiesFileReader.getProperty("UAT_Pwd"));
			keyWord.clickElement(login_Button);
				
			}
		else if(Environment.equalsIgnoreCase("PROD"))
			{
			driver.get(utils.PropertiesFileReader.getProperty("PROD_URL"));		
			keyWord.sendKeys(getUserName_txtBox(), PropertiesFileReader.getProperty("PROD_UserID"));
			keyWord.sendKeys(passWord_txtBox, PropertiesFileReader.getProperty("PROD_Pwd"));
			keyWord.clickElement(login_Button);
						 	
			}	
	}
	
	catch(Exception e)
	{
		mylogger.info("Error While Initializing the BrowserType : "+browserType +". Environment:"+Environment);
		e.printStackTrace();			
	}
	
	
	}
	
	
	
	
	
	
	
	

}
