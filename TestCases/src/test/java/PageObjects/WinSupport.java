package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Tecgurus.com.TestFramework.BasePage;

public class WinSupport extends BasePage{

	public WinSupport()
	{
		super();
	}

    @FindBy(id="l1_support")
    public WebElement SupportMenu;
    
    @FindBy(id="search-text-hero-fullSize")
    public WebElement SupportBar;
    
    
    public WinSupport Click(WebElement element)
    {
    	ClickElement(element);
    	return this;
    }
    
    public WinSupport enterText(WebElement element, String value)
    {
    	EnterText(element,value);
    	return this;
    }
    
    public WinSupport SubmitValue(WebElement element)
    {
    	Submit(element);
    	return this;
    }
    
    public WinSupport ValidaTitulo(String ExpectedTitle) {
    	String DriverTitle = driver.getTitle();
    	Assert.assertTrue(DriverTitle.contains(ExpectedTitle));
    	System.out.println("El titulo es correcto: "+ DriverTitle);
    	return this;
    }
}





































