package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  Pg_Reports {
	public WebDriver driver ;	
	public Pg_Reports (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}





	@FindBy(xpath = "//span[text()='Reports']")
	private static WebElement report_Tab;
	
	@FindBy(xpath = "//iframe[@id='PegaGadget0Ifr']")
	private static WebElement frameReports_frame;
	
	@FindBy(xpath = "//div[@class='header']//*[contains(text(),'All reports')]")
	private static WebElement allReports_lnk;
	
	
	/*Xpaths for 
	 * Actions 
	 * New Report
	 * Manage Cateogries
	 * Back to reports
	 * Search with description
	 * Category 
	 * Xpaths for all the 7 Reports
	 * Select Date 
	 * Generate Report 
	 * Total Uploads per Day report frame
	 * Total Uploads per Day report ---4 headers
	 * Close Button for the Total uploads per day report
	
	*/
	@FindBy(xpath = "//div[@node_name='pyReportBrowserHeaderReports']//button[@title='Actions']")
	private static WebElement Actions ;
	
	@FindBy(xpath = "//div[@node_name='pyReportBrowserHeaderReports']//button[@title='New Report']")
	private static WebElement  NewReport  ;
	
	@FindBy(xpath = "//ul[@class='menu menu-format-standard menu-regular']//span[text()='Manage Categories']")
	private static WebElement  ManageCateogries ;
	
	@FindBy(xpath = "//div[@param_name='EXPANDEDSubSectionpyReportBrowserHeaderCategoryB']//button[text()='Back to reports']")
	private static WebElement BackToReports ;
	
	@FindBy(xpath = "//div[@node_name='pyReportBrowserMyReports']//input[@name='$PD_pzReportBrowser7$ppySearchMyReports']")
	private static WebElement SearchWithDescription ;
	
	@FindBy(xpath = "//div[@node_name='pyReportBrowserMyReports']//input[@class='multiselect-list']")
	private static WebElement CategoryUnderMyReports ;
	
	@FindBy(xpath = "//div[@data-node-id='pyReportBrowserAllReports']//span[text()='Total Uploads Per Day']/../..")
	private static WebElement TotalUploadsPerDayReport ;
	
	@FindBy(xpath = "//div[@data-node-id='pyReportBrowserAllReports']//span[text()='Total Uploads by Agent']")
	private static WebElement TotalUploadsByAgentReport ;
	
	@FindBy(xpath = "//div[@data-node-id='pyReportBrowserAllReports']//span[text()='Total Uploads Per Day – Cotiviti Download']")
	private static WebElement TotalUploadsPerDayCotivitiDownloadReport ;
	
	@FindBy(xpath = "//div[@data-node-id='pyReportBrowserAllReports']//span[text()='Cotiviti Download Pending Uploads by Agent and Workbasket']")
	private static WebElement CotivitiDownloadPendingUploadsByAgentAndWorkbasket ;
	
	@FindBy(xpath = "//div[@data-node-id='pyReportBrowserAllReports']//span[@title='Pending Request ID']")
	private static WebElement PendingRequestID_Report ;
	
	@FindBy(xpath = "//div[@data-node-id='pyReportBrowserAllReports']//span[@title='Records Unavailable Daily Volume Report']")
	private static WebElement RecordsUnavailableDailyVolumeReport_Report ;
	
	@FindBy(xpath = "//select[@name='$PCustomFilter$pSelectDateFilter']")
	private static WebElement selectDat_TotalUploadsPerDay_Report ;
	
	@FindBy(xpath = "//div[@class='layout layout-noheader layout-noheader-information']//div[text()='Generate Report']")
	private static WebElement TotalUploadsPerDay_GenerateReport;
	
	@FindBy(xpath = "//iframe[@title='Total Uploads Per Day']")
	private static WebElement TotalUploadsPerDay_Frame;
	
	@FindBy(xpath = "//div[@class='summaryReport']//*[contains(text(),'Upload Date')]")
	private static WebElement totalUploadsPerDay_UploadDate_Header;
	
	@FindBy(xpath = "//div[@class='summaryReport']//*[contains(text(),'Success Uploads')]")
	private static WebElement totalUploadsPerDay_SuccessUploads_Header;
	
	@FindBy(xpath = "//div[@class='summaryReport']//*[contains(text(),'Failed Uploads')]")
	private static WebElement totalUploadsPerDay_FailedUploads_Header;
	
	@FindBy(xpath = "//div[@class='summaryReport']//*[contains(text(),'Total Uploads')]")
	private static WebElement totalUploadsPerDay_TotalUploads_Header;
	
	@FindBy(xpath = "//li[@title='Total Uploads Per Day']//span[@id='close']")
	private static WebElement totalUploadsPerDay_Close_Button;
	
	@FindBy(xpath = "//div[@data-node-id='pyReportBrowserHeader']")
	private static WebElement ReportsSection;
	
	@FindBy(xpath = "//div[@node_name=\"pyReportBrowserAllReports\"]//input[@class='multiselect-list']")
	private static WebElement Category_UnderAllReports;
	
	@FindBy(xpath = "//div[text()='Showing 7 report(s)']")
	private static WebElement CDQReport_Results;
	
	
	@FindBy(xpath = "//div[text()='Showing all reports']")
	private static WebElement ShowingAllReports_AllReports;
	
	public static WebElement getShowingAllReports_AllReports() {
		return ShowingAllReports_AllReports;
	}
	
	@FindBy(xpath = "//a[text()='[Clear all]']")
	private static WebElement clearAll_Link;
	
	
	@FindBy(xpath = "//div[@node_name='pxReportChartDisplay']")
	private static WebElement GraphChart;	
	public static WebElement getGraphChart() {
		return GraphChart;
	}
	
	
	public static WebElement getclearAll_Link() {
		return clearAll_Link;
	}
	
	

	public static WebElement getCDQReport_Results() {
		return CDQReport_Results;
	}
	
	public static WebElement getCategory_UnderAllReports() {
		return Category_UnderAllReports;
	}
	

	
	public static WebElement getReportsSection() {
		return ReportsSection;
	}
		
	public static WebElement getReport_Tab() {
		return report_Tab;
	}

	public static WebElement getReports_frame() {
		return frameReports_frame;
	}

	public static WebElement getAllReports_lnk() {
		return allReports_lnk;
	}

	public static WebElement getActions() {
		return Actions;
	}

	public static WebElement getNewReport() {
		return NewReport;
	}

	public static WebElement getManageCateogries() {
		return ManageCateogries;
	}

	public static WebElement getBackToReports() {
		return BackToReports;
	}

	public static WebElement getSearchWithDescription() {
		return SearchWithDescription;
	}

	public static WebElement getCategory_UnderMyReports() {
		return CategoryUnderMyReports;
	}

	public static WebElement getTotalUploadsPerDayReport() {
		return TotalUploadsPerDayReport;
	}

	public static WebElement getTotalUploadsByAgentReport() {
		return TotalUploadsByAgentReport;
	}

	public static WebElement getTotalUploadsPerDayCotivitiDownloadReport() {
		return TotalUploadsPerDayCotivitiDownloadReport;
	}

	public static WebElement getCotivitiDownloadPendingUploadsByAgentAndWorkbasket() {
		return CotivitiDownloadPendingUploadsByAgentAndWorkbasket;
	}

	public static WebElement getPendingRequestID_Report() {
		return PendingRequestID_Report;
	}

	public static WebElement getRecordsUnavailableDailyVolumeReport_Report() {
		return RecordsUnavailableDailyVolumeReport_Report;
	}

	public static WebElement getTotalUploadsPerDayReport_SelectDate() {
		return selectDat_TotalUploadsPerDay_Report;
	}

	public static WebElement getTotalUploadsPerDay_GenerateReport() {
		return TotalUploadsPerDay_GenerateReport;
	}

	public static WebElement getTotalUploadsPerDay_Frame() {
		return TotalUploadsPerDay_Frame;
	}

	public static WebElement getTotalUploadsPerDay_UploadDate_Header() {
		return totalUploadsPerDay_UploadDate_Header;
	}

	public static WebElement getTotalUploadsPerDay_SuccessUploads_Header() {
		return totalUploadsPerDay_SuccessUploads_Header;
	}

	public static WebElement getTotalUploadsPerDay_FailedUploads_Header() {
		return totalUploadsPerDay_FailedUploads_Header;
	}

	public static WebElement getTotalUploadsPerDay_TotalUploads_Header() {
		return totalUploadsPerDay_TotalUploads_Header;
	}

	public static WebElement getTotalUploadsPerDay_Close_Button() {
		return totalUploadsPerDay_Close_Button;
	}


	
	
	
	

}
