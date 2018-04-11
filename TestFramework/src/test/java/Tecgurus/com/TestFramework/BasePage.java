package Tecgurus.com.TestFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends BaseBrowser {
	public static WebDriver _driver;
	
	public  void InitBrowser()
	{
		_driver = SetUpDriver("Chrome");
	}
	
	protected void InitPageElements()
	{
		PageFactory.initElements(_driver,this);	
		
	}
	

}
