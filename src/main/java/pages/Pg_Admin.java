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
	
	
	// This is temaplate to add a single webElement
	@FindBy(xpath = "//input[@name='$PSearchPage$pRequestInfo$pRapidRequestID']")
	private static WebElement RequestID;		
	public static WebElement getRequestID() {
		return RequestID;
	}

	



	

}
