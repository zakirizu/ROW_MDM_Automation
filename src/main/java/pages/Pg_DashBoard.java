package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pg_DashBoard {
	public WebDriver driver ;	
	public Pg_DashBoard(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	
	@FindBy(xpath = "//h2[text()='Case  Aging']")
	private static WebElement caseAgingSection_section;
	
	@FindBy(xpath = "//h2[text()='Case Volume On Daily Basis']")
	private static WebElement CaseVolumeOnDailyBasis_section;
	
	
	@FindBy(xpath = "//h2[text()='Request Groups']")
	private static WebElement requestGroups_section ;
	
	
	@FindBy(xpath = "//h2[text()='Team  Members']")
	private static WebElement teamMembers_Section;
	
	
	@FindBy(xpath = "(//ol[@title='Currently open'])[1]")
	private static WebElement Actions_DDL;
	
	@FindBy(xpath = "//td[@title='Close All']")
	private static WebElement closeAll_Btn;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupsDashboard']//*[text()='Request Group ID']")
	private static WebElement requestGroupID_DashBoardRG_Headers;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupsDashboard']//*[text()='Assigned Team']")
	private static WebElement assignedTeam_DashBoardRG_Headers;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupsDashboard']//*[text()='Assigned Agent']")
	private static WebElement assignedAgent_DashBoardRG_Headers;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupsDashboard']//*[text()='Open requests']")
	private static WebElement openRequests_DashBoardRG_Headers;
	
	@FindBy(xpath = "//table[@summary='WorkGroupMembers.pxResults' and @id='gridLayoutTable']//div[text()='User Details']")
	private static WebElement useDetails_DashBoardTeamMembrs_Headers;
	
	@FindBy(xpath = "//table[@summary='WorkGroupMembers.pxResults' and @id='gridLayoutTable']//div[text()='Count Workable Request (Assigned RGS)']")
	private static WebElement countOfWorkableRequest_DashBoardTeamMembrs_Headers ;
	
	@FindBy(xpath = "//table[@summary='WorkGroupMembers.pxResults' and @id='gridLayoutTable']//div[text()='Total Request Groups']")
	private static WebElement totalRGs_DashBoardTeamMembrs_Headers;
	
	@FindBy(xpath = "//table[@summary='WorkGroupMembers.pxResults' and @id='gridLayoutTable']//div[text()='Total Due today Workable requests(Assigned RGs)']")
	private static WebElement totalDueToday_DashBoardTeamMembrs_Headers;
	
	@FindBy(xpath = "//table[@summary='WorkGroupMembers.pxResults' and @id='gridLayoutTable']//div[text()='Count Of Due Today RGs']")
	private static WebElement countOfDueToday_DashBoardTeamMembrs_Headers;
	
	@FindBy(xpath = "//table[@summary='WorkGroupMembers.pxResults' and @id='gridLayoutTable']//div[text()='Total Non Workable Requests']")
	private static WebElement totalNonWorkable_DashBoardTeamMembrs_Headers;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupsDashboard']//tr[2]//td[2]")
	private static WebElement firstROW_RGID_SearchResults;	

	@FindBy(xpath = "//div[@node_name='RequestGroupsDashboard']//tr[2]//td[3]")
	private static WebElement firstROW_AssignedTeam_SearchResults;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupsDashboard']//tr[2]//td[4]")
	private static WebElement firstROW_AssignedAgent_SearchResults;
	
	@FindBy(xpath = "//div[@node_name='RequestGroupsDashboard']//tr[2]//td[5]")
	private static WebElement firstROW_OpenResults_SearchRequests;
	
	@FindBy(xpath = "//div[contains(@param_name,'EXPANDEDSubSectionCSAgeingByAssign')]")
	private static WebElement caseAging_Report;
	
	@FindBy(xpath = "//div[contains(@param_name,'EXPANDEDSubSectionCaseVolume')]")
	private static WebElement caseVolumeOnDailyBasis_Report;
	
	
	public static WebElement getCloseAll_Btn() {
		return closeAll_Btn;
	}
	
	public static WebElement getCaseAgingSection_section() {
	return caseAgingSection_section;
	}
	public static WebElement getCaseVolumeOnDailyBasis_section() {
	return CaseVolumeOnDailyBasis_section;
	}
	public static WebElement getRequestGroups_section() {
	return requestGroups_section;
	}
	public static WebElement getTeamMembers_Section() {
	return teamMembers_Section;
	}
	public static WebElement getActions_DDL() {
		return Actions_DDL;
	}
	public static WebElement getRequestGroupID_DashBoardRG_Headers() {
		return requestGroupID_DashBoardRG_Headers;
	}
	public static WebElement getAssignedTeam_DashBoardRG_Headers() {
		return assignedTeam_DashBoardRG_Headers;
	}
	public static WebElement getAssignedAgent_DashBoardRG_Headers() {
		return assignedAgent_DashBoardRG_Headers;
	}
	public static WebElement getOpenRequests_DashBoardRG_Headers() {
		return openRequests_DashBoardRG_Headers;
	}
	public static WebElement getFirstRGInSearchResults_DashBoardRG() {
		return getFirstRGInSearchResults_DashBoardRG();
	}
	public static WebElement getUseDetails_DashBoardTeamMembrs_Headers() {
		return useDetails_DashBoardTeamMembrs_Headers;
	}
	public static WebElement getCountOfWorkableRequest_DashBoardTeamMembrs_Headers() {
		return countOfWorkableRequest_DashBoardTeamMembrs_Headers;
	}
	public static WebElement getTotalRGs_DashBoardTeamMembrs_Headers() {
		return totalRGs_DashBoardTeamMembrs_Headers;
	}
	public static WebElement getTotalDueToday_DashBoardTeamMembrs_Headers() {
		return totalDueToday_DashBoardTeamMembrs_Headers;
	}
	public static WebElement getCountOfDueToday_DashBoardTeamMembrs_Headers() {
		return countOfDueToday_DashBoardTeamMembrs_Headers;
	}
	public static WebElement getTotalNonWorkable_DashBoardTeamMembrs_Headers() {
		return totalNonWorkable_DashBoardTeamMembrs_Headers;
	}

	public static WebElement getFirstROW_RGID_SearchResults() {
		return firstROW_RGID_SearchResults;
	}

	public static WebElement getFirstROW_AssignedTeam_SearchResults() {
		return firstROW_AssignedTeam_SearchResults;
	}

	public static WebElement getFirstROW_AssignedAgent_SearchResults() {
		return firstROW_AssignedAgent_SearchResults;
	}

	public static WebElement getFirstROW_OpenRequests_SearchResults() {
		return firstROW_OpenResults_SearchRequests;
	}

	public static WebElement getFirstROW_OpenResults_SearchRequests() {
		return firstROW_OpenResults_SearchRequests;
	}

	public static WebElement getCaseAging_Report() {
		return caseAging_Report;
	}

	public static WebElement getCaseVolumeOnDailyBasis_Report() {
		return caseVolumeOnDailyBasis_Report;
	}	
	
	
	
	
	
	
	
	

}
