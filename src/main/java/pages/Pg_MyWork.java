package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pg_MyWork {
	
	public WebDriver driver ;	
	public Pg_MyWork(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	
	//my WOrk Tab and Frame and Sections 
	
	@FindBy(xpath = "//ul[contains(@role,'menubar')]//span[text()='My Work']")
	private static WebElement myWork_Tab ;
	
	@FindBy(xpath = "//iframe[@title='My Work']")
	private static WebElement myWork_iframe ;
	
	@FindBy(xpath = "//h1[text()='Request Groups']")
	private static WebElement requestGroup_section ;
		
	@FindBy(xpath = "//h1[text()='My Workbaskets']")
	private static WebElement myWorkBaskets_section ;
		
	@FindBy(xpath = "//h1[text()='My Worklist']")
	private static WebElement myWorkLists_section ;
	
	@FindBy(xpath = "//select[@name='$PpyDisplayHarness$ppxUserDashboard$ppySlots$l1$ppyWidgets$l1$ppyWidget$ppyTempText']")
	private static WebElement myWorkList_DDl ;
	
	@FindBy(xpath = "//select[@name='$PpyDisplayHarness$ppxUserDashboard$ppySlots$l1$ppyWidgets$l1$ppyWidget$pWorkBasketParameter']")
	private static WebElement myWorkBasket_DDl ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Request ID']")
	private static WebElement myWorkList_RequestId_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Account Name']")
	private static WebElement  myWorkList_AccountName_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Patient Name']")
	private static WebElement myWorkList_PatientName_Header  ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='DOB']")
	private static WebElement myWorkList_DOB_Header  ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Service Start Date']")
	private static WebElement  myWorkList_ServiceStartDate_Header  ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Service End Date']")
	private static WebElement myWorkList_ServiceEndDate_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Client Claim Number']")
	private static WebElement myWorkList_ClientClaimNumber_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Cotiviti Claim Number']")
	private static WebElement myWorkList_CotivitiClaimNumber_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Case Age (Days)']")
	private static WebElement myWorkList_CaseAgeDays_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Days In Worklist']")
	private static WebElement myWorkList_DaysInWrokList_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Expiration Date']")
	private static WebElement myWorkList_ExpirationDate_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Deadline']")
	private static WebElement myWorkList_DeadLine_Header ;
	
	
	@FindBy(xpath = "//div[contains(@dpsectionid,'SubSectionCotivitiDownloadQueueWorklistBB')]//div[text()='Status']")
	private static WebElement myWorkList_Status_Header ;
	
	
	@FindBy(xpath = "//div[contains(@hashed-dp-page,'D_DisplayDownloadQueueWorkBasket')]//*[text()='Request ID']")
	private static WebElement myWorkBasket_RequestId_Header ;
	
	
	@FindBy(xpath = "//div[contains(@hashed-dp-page,'D_DisplayDownloadQueueWorkBasket')]//*[text()='Account Name']")
	private static WebElement  myWorkBasket_AccountName_Header ;
	

	@FindBy(xpath = "//div[contains(@hashed-dp-page,'D_DisplayDownloadQueueWorkBasket')]//*[text()='Expiration Date']")
	private static WebElement myWorkBasket_ExpirationDate_Header ;
	
	@FindBy(xpath = "//div[contains(@hashed-dp-page,'D_DisplayDownloadQueueWorkBasket')]//*[text()='Case Age (Days)']")
	private static WebElement myWorkBasket_CaseAgeDays_Header  ;
	

	@FindBy(xpath = "//div[contains(@hashed-dp-page,'D_DisplayDownloadQueueWorkBasket')]//*[text()='Days in Workbasket']")
	private static WebElement myWorkBasket_DaysInWorkBasket_Header ;
	
	@FindBy(xpath = "//div[contains(@hashed-dp-page,'D_DisplayDownloadQueueWorkBasket')]//*[text()='Deadline']")
	private static WebElement myWorkBasket_Deadline_Header ;
	

	@FindBy(xpath = "//div[contains(@hashed-dp-page,'D_DisplayDownloadQueueWorkBasket')]//*[text()='Status']")
	private static WebElement myWorkBasket_Status_Header  ;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupSection']//div[text()='Request Group ID']")
	private static WebElement requestGroups_requestGroupID_Header;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupSection']//div[text()='Assigned Team']")
	private static WebElement requestGroups_AssignedTeam_Header;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupSection']//div[text()='Open Requests']")
	private static WebElement requestGroups_OpenRequests_Header;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupSection']//div[text()='Workable Requests']")
	private static WebElement requestGroups_WorkableRequests_Header;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupSection']//div[text()='Urgency']")
	private static WebElement requestGroups_Urgency_Header;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupSection']//div[text()='Due Today']")
	private static WebElement requestGroups_DueToday_Header;
	
	@FindBy(xpath = "//div[@data-node-id='DownloadQueueWorkBasket']//tr[2]//td[4]")
	private static WebElement WBSearchResults_RequestID;	
	
	@FindBy(xpath = "//div[@data-node-id='DownloadQueueWorkBasket']//tr[2]//td[5]")
	private static WebElement WBSearchResults_AccountName;	

	@FindBy(xpath = "//div[@data-node-id='DownloadQueueWorkBasket']//tr[2]//td[6]")
	private static WebElement WBSearchResults_ExpirationDate;	
	
	@FindBy(xpath = "//div[@data-node-id='DownloadQueueWorkBasket']//tr[2]//td[7]")
	private static WebElement WBSearchResults_CaseAge;	

	@FindBy(xpath = "//div[@data-node-id='DownloadQueueWorkBasket']//tr[2]//td[8]")
	private static WebElement WBSearchResults_DaysInWB;	

	@FindBy(xpath = "//div[@data-node-id='DownloadQueueWorkBasket']//tr[2]//td[10]")
	private static WebElement WBSearchResults_Status;	

	
	
	
	
	public static WebElement getMyWork_Tab() {
		return myWork_Tab;
	}

	public static WebElement getMyWork_iframe() {
		return myWork_iframe;
	}

	public static WebElement getRequestGroup_section() {
		return requestGroup_section;
	}

	public static WebElement getMyWorkBaskets_section() {
		return myWorkBaskets_section;
	}

	public static WebElement getMyWorkLists_section() {
		return myWorkLists_section;
	}

	public static WebElement getMyWorkList_DDl() {
		return myWorkList_DDl;
	}

	public static WebElement getMyWorkBasket_DDl() {
		return myWorkBasket_DDl;
	}

	public static WebElement getMyWorkList_RequestId_Header() {
		return myWorkList_RequestId_Header;
	}

	public static WebElement getMyWorkList_AccountName_Header() {
		return myWorkList_AccountName_Header;
	}

	public static WebElement getMyWorkList_PatientName_Header() {
		return myWorkList_PatientName_Header;
	}

	public static WebElement getMyWorkList_DOB_Header() {
		return myWorkList_DOB_Header;
	}

	public static WebElement getMyWorkList_ServiceStartDate_Header() {
		return myWorkList_ServiceStartDate_Header;
	}

	public static WebElement getMyWorkList_ServiceEndDate_Header() {
		return myWorkList_ServiceEndDate_Header;
	}

	public static WebElement getMyWorkList_ClientClaimNumber_Header() {
		return myWorkList_ClientClaimNumber_Header;
	}

	public static WebElement getMyWorkList_CotivitiClaimNumber_Header() {
		return myWorkList_CotivitiClaimNumber_Header;
	}

	public static WebElement getMyWorkList_CaseAgeDays_Header() {
		return myWorkList_CaseAgeDays_Header;
	}

	public static WebElement getMyWorkList_DaysInWrokList_Header() {
		return myWorkList_DaysInWrokList_Header;
	}

	public static WebElement getMyWorkList_ExpirationDate_Header() {
		return myWorkList_ExpirationDate_Header;
	}

	public static WebElement getMyWorkList_DeadLine_Header() {
		return myWorkList_DeadLine_Header;
	}

	public static WebElement getMyWorkList_Status_Header() {
		return myWorkList_Status_Header;
	}

	public static WebElement getMyWorkBasket_RequestId_Header() {
		return myWorkBasket_RequestId_Header;
	}

	public static WebElement getMyWorkBasket_AccountName_Header() {
		return myWorkBasket_AccountName_Header;
	}

	public static WebElement getMyWorkBasket_ExpirationDate_Header() {
		return myWorkBasket_ExpirationDate_Header;
	}

	public static WebElement getMyWorkBasket_CaseAgeDays_Header() {
		return myWorkBasket_CaseAgeDays_Header;
	}

	public static WebElement getMyWorkBasket_DaysInWorkBasket_Header() {
		return myWorkBasket_DaysInWorkBasket_Header;
	}

	public static WebElement getMyWorkBasket_Deadline_Header() {
		return myWorkBasket_Deadline_Header;
	}

	public static WebElement getMyWorkBasket_Status_Header() {
		return myWorkBasket_Status_Header;
	}

	public static WebElement getRequestGroups_RequestGroupID_Header() {
		return requestGroups_requestGroupID_Header;
	}

	public static WebElement getRequestGroups_AssignedTeam_Header() {
		return requestGroups_AssignedTeam_Header;
	}

	public static WebElement getRequestGroups_OpenRequests_Header() {
		return requestGroups_OpenRequests_Header;
	}

	public static WebElement getRequestGroups_WorkableRequests_Header() {
		return requestGroups_WorkableRequests_Header;
	}

	public static WebElement getRequestGroups_Urgency_Header() {
		return requestGroups_Urgency_Header;
	}

	public static WebElement getRequestGroups_DueToday_Header() {
		return requestGroups_DueToday_Header;
	}

	public static WebElement getRequestGroups_requestGroupID_Header() {
		return requestGroups_requestGroupID_Header;
	}

	public static WebElement getWBSearchResults_RequestID() {
		return WBSearchResults_RequestID;
	}

	public static WebElement getWBSearchResults_AccountName() {
		return WBSearchResults_AccountName;
	}

	public static WebElement getWBSearchResults_ExpirationDate() {
		return WBSearchResults_ExpirationDate;
	}

	public static WebElement getWBSearchResults_CaseAge() {
		return WBSearchResults_CaseAge;
	}

	public static WebElement getWBSearchResults_DaysInWB() {
		return WBSearchResults_DaysInWB;
	}

	public static WebElement getWBSearchResults_Status() {
		return WBSearchResults_Status;
	}
	
	

}
