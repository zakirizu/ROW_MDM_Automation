package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg_RequestGroup {
	
	public WebDriver driver ;	
	public Pg_RequestGroup (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//iframe[contains(@id,'PegaGadget') and contains(@title,'S-')]")
	private static WebElement RGSection_Frame;
	public static WebElement getRGSection_Frame() {
		return RGSection_Frame;
	}
		
	@FindBy(xpath = "//h3[text()='Basic Information']")
	private static WebElement RGBasicInformation;
		
	@FindBy(xpath = "//h3[text()='Contact Information']")
	private static WebElement RGContactInformation;	

	@FindBy(xpath = "//h3[text()='Facility/Practitioner Linking']")
	private static WebElement RGFacilityPractitionerLinking;

	@FindBy(xpath = "//h3[text()='Address Information']")
	private static WebElement RGAddressInformation;

	@FindBy(xpath = "//h3[text()='Additional Information']")
	private static WebElement RGAdditionalInformation;

	@FindBy(xpath = "//h3[text()='Hours Of Operation']")
	private static WebElement RGHoursOfOperation;

	@FindBy(xpath = "//div[text()='First Name']")
	private static WebElement RGFirstNameContactInformation;	
	
	@FindBy(xpath = "//div[text()='Facility Name']")
	private static WebElement RGFacilityNameFPLinking;
	
	@FindBy(xpath = "//span[text()='AddresseeName']")
	private static WebElement RGAddresseeNameAddressInformation ;
	
	@FindBy(xpath = "//span[text()='EMR System']")
	private static WebElement RFEMRSystemAdditionalInformation;
	
	@FindBy(xpath = "//h3[text()='Hours Of Operation']/following::span[text()='Time Zone']")
	private static WebElement RGTimeZoneHoursOfOperation ;
	
	
	public static WebElement getRGBasicInformation() {
		return RGBasicInformation;
	}

	public static WebElement getRGContactInformation() {
		return RGContactInformation;
	}

	public static WebElement getRGFacilityPractitionerLinking() {
		return RGFacilityPractitionerLinking;
	}

	public static WebElement getRGAddressInformation() {
		return RGAddressInformation;
	}

	public static WebElement getRGAdditionalInformation() {
		return RGAdditionalInformation;
	}

	public static WebElement getRGHoursOfOperation() {
		return RGHoursOfOperation;
	}

	public static WebElement getRGFirstNameContactInformation() {
		return RGFirstNameContactInformation;
	}

	public static WebElement getRGFacilityNameFPLinking() {
		return RGFacilityNameFPLinking;
	}

	public static WebElement getRGAddresseeNameAddressInformation() {
		return RGAddresseeNameAddressInformation;
	}

	public static WebElement getRFEMRSystemAdditionalInformation() {
		return RFEMRSystemAdditionalInformation;
	}

	public static WebElement getRGTimeZoneHoursOfOperation() {
		return RGTimeZoneHoursOfOperation;
	}
	

}
