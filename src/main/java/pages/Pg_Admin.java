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
	//In the Below code you need to update the Xpath , WebElement name and the should be returned and add get infront of the Method Name
	@FindBy(xpath = "//TagName[@attribute='value']")
	private static WebElement UserNameDemo;		
	public static WebElement getUserNameDemo() {
		return UserNameDemo;
	}

	



	

}
