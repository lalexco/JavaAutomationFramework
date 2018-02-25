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
    
    @FindBy(id="shellmenu_67")
    public WebElement JuegosMenu;    
    
    @FindBy(id="shellmenu_68")
    public WebElement JuegosMenuTwo;   
    
    @FindBy(id="shellmenu_69")
    public WebElement JuegosMenuThree; 
        
    public WinHomePage ValidaTitulo(String ExpectedUrl) {
    	String DriverTitle = driver.getTitle();
    	Assert.assertTrue(DriverTitle.contains(ExpectedUrl));
    	System.out.println("El titulo es correcto: "+ DriverTitle);
    	return this;
    }
    
    public WinHomePage DoClick(WebElement element) {
    	ClickElement(element);
    	System.out.println("Msg Changed");
    	System.out.println("New Message");
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
