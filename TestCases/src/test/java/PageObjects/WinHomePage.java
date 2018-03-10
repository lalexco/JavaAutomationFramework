package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import Tecgurus.com.TestFramework.BasePage;
import TestInitializer.TestContext;

public class WinHomePage extends BasePage{

	public WinHomePage()
	{
		super();
	}
		
	
    @FindBy(id="shellmenu_1")
    public WebElement WindowsMenu;
    

    public WinHomePage ValidaTitulo(String ExpectedTitle) {
    	String DriverTitle = driver.getTitle();
    	Assert.assertTrue(DriverTitle.contains(ExpectedTitle));
    	System.out.println("El titulo es correcto: "+ DriverTitle);
    	return this;
    }
    
    public WinHomePage DoClick(WebElement element) {
    	ClickElement(element);
    	return this;
    }
    
    public WinHomePage AssertElement(WebElement element)
    {
    	WaitForelement(element);
    	return this;	
    }
    
    public WinHomePage GoTo()
    {
    	GoTo(TestContext.GetUrl());
    	return this;	
    }
}
