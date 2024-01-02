package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg_Admin {
	
	public WebDriver driver ;	
	public Pg_Admin (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	//
	
	
	// This is Template to add a single webElement
	//In the Below code you need to update the Xpath , WebElement name and the should be returned and add get infront of the Method Name
	@FindBy(xpath = "//TagName[@attribute='value']")
	private static WebElement UserNameDemo;		
	public static WebElement getUserNameDemo() {
		return UserNameDemo;
	}
	
	
	//WebElemet Admin Tab which is on the Left Hand side of the Orange HRM
	@FindBy(xpath = "//span[text()='Admin']")
	private static WebElement AdminTab;		
	public static WebElement getAdminTab() {
		return AdminTab;
	}	

	
	//WebElement userName textbox under the System Users
	@FindBy(xpath = "//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	private static WebElement UserName_TxtBox;		
	public static WebElement getUserName_TxtBox() {
		return UserName_TxtBox;
	}		
	
	
	//WebElement Search Button under the System Users
	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement Submit_Btn;	
	public static WebElement getSubmit_Btn() {
		return Submit_Btn;
	}	

	//WebElement Search Results
	@FindBy(xpath = "(//div[@class='oxd-table']//div[text()='Admin'])[1]")
	private static WebElement SearchResults_text;		
	public static WebElement getSearchResults_text() {
		return SearchResults_text;
	}	

	//WebElement for User Role Results
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private static WebElement EmployeeName_txtBox;		
	public static WebElement getEmployeeName_txtBox() {
		return EmployeeName_txtBox;
	}	
	
	//WebElement for User Role Results
	@FindBy(xpath = "//div[text()='John.Smith']")
	private static WebElement UserNameResult_Txt;		
	public static WebElement getUserNameResult_Txt() {
		return UserNameResult_Txt;
	}	

	
	//WebElement for User Role Results
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private static WebElement Add_Btn;		
	public static WebElement getAdd_Btn() {
		return Add_Btn;
	}	
		
	

}
