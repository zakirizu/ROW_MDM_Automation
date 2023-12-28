package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Pg_Admin {
	public WebDriver driver ;	
	public Pg_Admin (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	
	public WebElement getAdmin_btn() {
		return admin_btn;
	}


	public static WebElement getUserManagement_btn() {
		return userManagement_btn;
	}


	public static WebElement getFileUpload_btn() {
		return fileUpload_btn;
	}


	public static WebElement getMr2Mr3Config_btn() {
		return mr2Mr3Config_btn;
	}


	public static WebElement getCopySrviceConfig_btn() {
		return copySrviceConfig_btn;
	}

	
//Xpaths for User Managment Section

	@FindBy(xpath = "//span[text()='Admin']")
	private static WebElement admin_btn;
		
	@FindBy(xpath = "//span[text()='User Management']")
	private static WebElement userManagement_btn;	
	
	@FindBy(xpath = "//span[text()='File Upload']")
	private static WebElement fileUpload_btn;
	
	@FindBy(xpath = "//span[text()='MR2/MR3 Configuration']")
	private static WebElement mr2Mr3Config_btn;	
	

	@FindBy(xpath = "//span[text()='Copy Service Configuration']")
	private static WebElement copySrviceConfig_btn;	
	

	@FindBy(xpath = "//input[@name='$PSelectionPage$pFirstName']")
	private static WebElement firstName_txtBox;
	public static WebElement getFirstName_txtBox() {
		return firstName_txtBox;
	}	
	
	@FindBy(xpath = "//input[@name='$PSelectionPage$pLastName']")
	private static WebElement lastName_txtBox;
	public static WebElement getLastName_txtBox() {
		return lastName_txtBox;
	}
	
	@FindBy(xpath = "//input[@name='$PSelectionPage$ppyEmailAddress']")
	private static WebElement emailAddresse_txtbox;
	public static WebElement getEmailAddresse_txtbox() {
		return emailAddresse_txtbox;
	}
	
	
	@FindBy(xpath = "//iframe[contains(@id,'PegaGadget') and @title='User Management']")
	private static WebElement userManagment_iframe;
	public static WebElement getUserManagment_iframe() {
		return userManagment_iframe;
	}	
	
	
	@FindBy(xpath = "//button[text()='Search']")
	private static WebElement search_btn;
	public static WebElement getSearch_btn() {
		return search_btn;
	}	
	
	@FindBy(xpath = "//button[text()='Clear']")
	private static WebElement clear_btn;
	public static WebElement getClear_btn() {
		return clear_btn;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Zakir')])[1]")
	private static WebElement searchResult1;
	public static WebElement getSearchResult1() {
		return searchResult1;
	}	
	
	@FindBy(xpath = "(//span[contains(text(),'shaik.hussain@cotiviti.com')])[1]")
	private static WebElement searchResult2;
	public static WebElement getSearchResult2() {
		return searchResult2;
	}	
	
	
	//Xpaths for  File Upload Section
	
	@FindBy(xpath = "//span[text()='File Upload']")
	private static WebElement fileUpload_Tab ;
	
	@FindBy(xpath = "//iframe[contains(@id,'PegaGadget') and@title='Admin']")
	private static WebElement fileUploadsAdmin_Frame ;
	
	@FindBy(xpath = "//h2[text()='DSS Updates']")
	private static WebElement dssUpdates_Section ;
		
	@FindBy(xpath = "//label[text()='Select DSS to update']")
	private static WebElement selectDssElement_txt ;
	
	
	@FindBy(xpath = "//h2[text()='File Uploads']")
	private static WebElement fileUPloads_Section ;
	
	
	@FindBy(xpath = "//h2[text()='Reset Investigation Flag']")
	private static WebElement resetInvestigationFlag_Section ;
	
	
	@FindBy(xpath = "//h2[text()='Create DIT File']")
	private static WebElement createDitFile_Section ;
	
	
	@FindBy(xpath = "//h2[text()='Edit Or Upload MR2 MR3 Rules']")
	private static WebElement editORUploadMr2Mr3Rules_Section ;
	
	@FindBy(xpath = "//button[text()='Edit or Upload']")
	private static WebElement editOrUpload_Button ;
	
	
	public static WebElement getFileUpload_Tab() {
		return fileUpload_Tab;
	}


	public static WebElement getFileUploadsAdmin_Frame() {
		return fileUploadsAdmin_Frame;
	}


	public static WebElement getDssUpdates_Section() {
		return dssUpdates_Section;
	}


	public static WebElement getSelectDssElement_txt() {
		return selectDssElement_txt;
	}


	public static WebElement getFileUPloads_Section() {
		return fileUPloads_Section;
	}


	public static WebElement getResetInvestigationFlag_Section() {
		return resetInvestigationFlag_Section;
	}


	public static WebElement getCreateDitFile_Section() {
		return createDitFile_Section;
	}


	public static WebElement getEditORUploadMr2Mr3Rules_Section() {
		return editORUploadMr2Mr3Rules_Section;
	}


	public static WebElement getEditOrUpload_Button() {
		return editOrUpload_Button;
	}
	
	
	//
	
	@FindBy(xpath = "//span[text()='MR2/MR3 Configuration']")
	private static WebElement mr2Mr3Configuration_Tab ;
	
	@FindBy(xpath = "//iframe[contains(@id,'PegaGadget') and @title='EditOrUploadMR2MR3Rules']")
	private static WebElement mr2Mr3Configuration_frame  ;
	
	@FindBy(xpath = "//span[text()='Copy Service Configuration']")
	private static WebElement  copyServiceConfiguration_Tab;
	
	@FindBy(xpath = "//iframe[@title='CopyServiceDelegation']")
	private static WebElement copyServiceConfiguration_frame ;
	
	
	public static WebElement getMr2Mr3Configuration_Tab() {
		return mr2Mr3Configuration_Tab;
	}


	public static WebElement getMr2Mr3Configuration_frame() {
		return mr2Mr3Configuration_frame;
	}


	public static WebElement getCopyServiceConfiguration_Tab() {
		return copyServiceConfiguration_Tab;
	}


	public static WebElement getCopyServiceConfiguration_frame() {
		return copyServiceConfiguration_frame;
	}
	
	
	
}
