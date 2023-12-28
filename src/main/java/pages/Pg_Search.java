package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg_Search {
	
	public WebDriver driver ;	
	public Pg_Search (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pRequestInfo$pRapidRequestID']")
	private static WebElement RequestID;
		
	public static WebElement getRequestID() {
		return RequestID;
	}

	
	
	public static WebElement getRequestGroupID() {
		return requestGroupID;
	}

	public static WebElement getCaseID() {
		return CaseID;
	}

	public static WebElement getRequestStatus() {
		return RequestStatus;
	}

	public static WebElement getMedicalReordNumber() {
		return MedicalReordNumber;
	}

	public static WebElement getCotivitiClaimNumber() {
		return CotivitiClaimNumber;
	}

	public static WebElement getClientClaimNumber() {
		return ClientClaimNumber;
	}

	public static WebElement getExpirationDate() {
		return ExpirationDate;
	}

	public static WebElement getRetrievalType() {
		return RetrievalType;
	}

	public static WebElement getSearch() {
		return Search;
	}

	public static WebElement getClear() {
		return Clear;
	}

	public static WebElement getAdvanceSearch() {
		return advanceSearch;
	}

	@FindBy(xpath = "//input[@name='$PSearchPage$pSiteInfo$pSiteID']")
	private static WebElement requestGroupID;	
	
	@FindBy(xpath = "//input[@name='$PSearchPage$ppyID']")
	private static WebElement CaseID;
	
	@FindBy(xpath = "//select[@name='$PSearchPage$ppyStatusWork']")
	private static WebElement RequestStatus;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pMedicalRecordNumber']")
	private static  WebElement MedicalReordNumber ;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pCotivitiClaimNumber']")
	private static WebElement CotivitiClaimNumber;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimKey']")
	private static WebElement ClientClaimNumber ;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pRequestInfo$pExpirationDate']")
	private static WebElement ExpirationDate ;
	
	@FindBy(xpath = "//input[@data-target=\"$PSearchPage$pRetrievalTypes\"]")
	private static WebElement RetrievalType ;
	
	@FindBy(xpath = "//button[text()='Search']")
	private static WebElement Search;
		
	@FindBy(xpath = "//button[text()='Clear']")
	private static WebElement Clear ;
	
	@FindBy(xpath = "//a[text()='Advanced Search']")
	private static WebElement advanceSearch;
	

	@FindBy(xpath = "//iframe[contains(@id,'PegaGadget') and @title='Search']")
	private static WebElement searchSection_Frame;
	public static WebElement getSearchSection_Frame() {
		return searchSection_Frame;
	}
	
	@FindBy(xpath = "//span[text()='Search']")
	private static WebElement searchTab_btn;
	public static WebElement getSearchTab_btn() {
		return searchTab_btn;
	}
	
	
	//Advance Search Xpaths	
	public static WebElement getEntityName_txtBox() {
		return EntityName_txtBox;
	}
	public static WebElement getEntityID_txtBox() {
		return EntityID_txtBox;
	}
	public static WebElement getAddressLine1_txtBox() {
		return AddressLine1_txtBox;
	}
	public static WebElement getAddressLine2_txtBox() {
		return AddressLine2_txtBox;
	}
	public static WebElement getCity_txtBox() {
		return City_txtBox;
	}
	public static WebElement getState_ddl() {
		return state_ddl;
	}
	public static WebElement getZip_txtBox() {
		return Zip_txtBox;
	}
	public static WebElement getPhone_txtBox() {
		return phone_txtBox;
	}
	public static WebElement getFax_txtBox() {
		return Fax_txtBox;
	}
	public static WebElement getNPI_txtBox() {
		return NPI_txtBox;
	}
	public static WebElement getTIN_txtBox() {
		return TIN_txtBox;
	}
	public static WebElement getMemberPatientFirstName_txtBox() {
		return MemberPatientFirstName_txtBox;
	}
	public static WebElement getMemberPatientLastName_txtBox() {
		return MemberPatientLastName_txtBox;
	}
	public static WebElement getDateOfBirth_txtBox() {
		return DateOfBirth_txtBox;
	}
	public static WebElement getMemberPatientID() {
		return MemberPatientID;
	}
	public static WebElement getSSN_txtBox() {
		return SSN_txtBox;
	}
	public static WebElement getAccountName_ddl() {
		return AccountName_ddl;
	}
	public static WebElement getAccountID_ddl() {
		return AccountID_ddl;
	}
	public static WebElement getProjectName_ddl() {
		return ProjectName_ddl;
	}

	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pTIN']")
	private static WebElement TIN_txtBox ;

	@FindBy(xpath = "//input[@name='$PSearchPage$pMemberInfo$pFirstName']")
	private static WebElement MemberPatientFirstName_txtBox;

	@FindBy(xpath = "//input[@name='$PSearchPage$pMemberInfo$pLastName']")
	private static WebElement MemberPatientLastName_txtBox;

	@FindBy(xpath = "//input[@name='$PSearchPage$pMemberInfo$pDateOfBirth']")
	private static WebElement DateOfBirth_txtBox;

	@FindBy(xpath = "//input[@name='$PSearchPage$pMemberInfo$pMemberID']")
	private static WebElement  MemberPatientID;

	@FindBy(xpath = "//input[@name='$PSearchPage$pMemberInfo$pSSN']")
	private static WebElement SSN_txtBox;

	@FindBy(xpath = "//select[@name='$PSearchPage$pRequestInfo$pClientName']")
	private static WebElement AccountName_ddl;
	
	@FindBy(xpath = "//select[@name='$PSearchPage$pRequestInfo$pAccountID']")
	private static WebElement AccountID_ddl;

	@FindBy(xpath = "//select[@name='$PSearchPage$pRequestInfo$pProjectID']")
	private static WebElement ProjectName_ddl;

	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimEntityName']")
	private static WebElement EntityName_txtBox;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimID']")
	private static WebElement EntityID_txtBox;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimAddressInfo$pAddressLine1']")
	private static WebElement AddressLine1_txtBox;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimAddressInfo$pAddressLine2']")
	private static WebElement AddressLine2_txtBox;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimAddressInfo$pCity]")
	private static WebElement City_txtBox;
	
	@FindBy(xpath = "//select[@name='$PSearchPage$pClaimInfo$pClaimAddressInfo$pState']")
	private static WebElement state_ddl;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimAddressInfo$pZip']")
	private static WebElement Zip_txtBox;
	
	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimContactInfo$pPhone']")
	private static WebElement phone_txtBox;

	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pClaimContactInfo$pFax']")
	private static WebElement Fax_txtBox;

	@FindBy(xpath = "//input[@name='$PSearchPage$pClaimInfo$pNPI']")
	private static WebElement NPI_txtBox;

///Search Results Headers
	@FindBy(xpath = "//table[@prim_page='SearchPage']//tr[1]//th[3]//div[text()='Request ID']")
	private static WebElement requestID_Header;
	
	@FindBy(xpath = "//table[@prim_page='SearchPage']//tr[1]//th[4]//div[text()='Request Group ID']")
	private static WebElement requestGroupID_Header;
	
	@FindBy(xpath = "//table[@prim_page='SearchPage']//tr[1]//th[5]//div[text()='Request Status']")
	private static WebElement requestStatus_Header;
	
	@FindBy(xpath = "//table[@prim_page='SearchPage']//tr[1]//th[6]//div[text()='Assigned Team']")
	private static WebElement assignedTeam_Header;
	
	@FindBy(xpath = "//table[@prim_page='SearchPage']//tr[1]//th[7]//div[text()='Assigned Agent']")
	private static WebElement assignedAgent_Header;
	
	@FindBy(xpath = "//table[@prim_page='SearchPage']//tr[1]//th[8]//div[text()='Patient Name']")
	private static WebElement patientName_Header;
	
	@FindBy(xpath = "//table[@prim_page='SearchPage']//tr[1]//th[9]//div[text()='Cotiviti Claim Number']")
	private static WebElement cotivitiClaimNumber_Header;
	
	@FindBy(xpath = "//table[@prim_page='SearchPage']//tr[1]//th[10]//div[text()='Claim Entity Name']")
	private static WebElement claimEntityName_Header;
	
	@FindBy(xpath = "(//td[@data-attribute-name='Request Group ID']//a[contains(text(),'R')])[1]")
	private static WebElement firstRG_inSearchResults;
	public static WebElement getRequestID_Header() {
		return requestID_Header;
	}
	
	@FindBy(xpath = "//button[text()='Export Results']")
	private static WebElement exportResults_btn;
	public static WebElement getExportResults_btn() {
		return exportResults_btn;
	}


	public static WebElement getRequestGroupID_Header() {
		return requestGroupID_Header;
	}



	public static WebElement getRequestStatus_Header() {
		return requestStatus_Header;
	}



	public static WebElement getAssignedTeam_Header() {
		return assignedTeam_Header;
	}



	public static WebElement getAssignedAgent_Header() {
		return assignedAgent_Header;
	}



	public static WebElement getPatientName_Header() {
		return patientName_Header;
	}



	public static WebElement getCotivitiClaimNumber_Header() {
		return cotivitiClaimNumber_Header;
	}



	public static WebElement getClaimEntityName_Header() {
		return claimEntityName_Header;
	}



	public static WebElement getFirstRG_inSearchResults() {
		return firstRG_inSearchResults;
	}
	

	//-----History Tab Xpaths

	@FindBy(xpath = "(//a[contains(@name,'SearchGridRequestID_GlobalSearchResults.pxResults')])[1]")
	private static WebElement firstRequestIDInSearchResults;
	
	@FindBy(xpath = "(//img[contains(@name,'ViewNotesFromGrid_GlobalSearchResults.pxResults')])[1]")
	private static WebElement firstHambergerMenuInSearchResults;
	
	@FindBy(xpath = "//span[text()='View Note Or History']")
	private static WebElement viewNotesOrHistory;
	
	@FindBy(xpath = "//h3[text()='View Notes']")
	private static WebElement viewNotes;
	
	@FindBy(xpath = "//div[text()='Created by']")
	private static WebElement viewNotesCreatedBY;

	@FindBy(xpath = "//div[text()='Created Date']")
	private static WebElement viewNotesCreatedDate ;
	
	@FindBy(xpath = "//div[text()='Note Type']")
	private static WebElement viewNotesNoteType;
	
	@FindBy(xpath = "//div[text()='Description']")
	private static WebElement viewNotesDescription;
	
	@FindBy(xpath= "//h3[text()='History details']")
	private static WebElement historyDetails;	
	
	@FindBy(xpath = "//div[text()='Date/Time']")
	private static WebElement historyDetailsDateAndTime;
	
	@FindBy(xpath = "//div[text()='History']")
	private static WebElement historyDetailsHistory ;
	
	@FindBy(xpath = "//div[text()='Performed By']")
	private static WebElement historyDetailsPerfomedBy;
	
	public static WebElement getFirstRequestIDInSearchResults() {
		return firstRequestIDInSearchResults;
	}

	public static WebElement getFirstHambergerMenuInSearchResults() {
		return firstHambergerMenuInSearchResults;
	}

	public static WebElement getViewNotesOrHistory() {
		return viewNotesOrHistory;
	}

	public static WebElement getViewNotes() {
		return viewNotes;
	}

	public static WebElement getViewNotesCreatedBY() {
		return viewNotesCreatedBY;
	}

	public static WebElement getViewNotesCreatedDate() {
		return viewNotesCreatedDate;
	}

	public static WebElement getViewNotesNoteType() {
		return viewNotesNoteType;
	}

	public static WebElement getViewNotesDescription() {
		return viewNotesDescription;
	}

	public static WebElement getHistoryDetails() {
		return historyDetails;
	}

	public static WebElement getHistoryDetailsDateAndTime() {
		return historyDetailsDateAndTime;
	}

	public static WebElement getHistoryDetailsHistory() {
		return historyDetailsHistory;
	}
	
	public static WebElement getHistoryDetailsPerfomedBy() {
		return historyDetailsPerfomedBy;
	}



	

}
