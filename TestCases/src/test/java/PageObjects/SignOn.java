package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import BaseFramework.BasePage;
import GenericMethods.GenImplementation;

public class SignOn extends BasePage implements GenImplementation{

	String PageTitle;
	
	public SignOn(String ExpectedTitle)
	{
		InitPageElements();
		PageTitle = ExpectedTitle;
	}
	
	public static String GetUrl()
	{
		return _driver.getCurrentUrl();
	}

	// Sign On
    @FindBy(name="userName")
    public WebElement UserName;
    
    @FindBy(name="password")
    public WebElement Password;
    
    @FindBy(name="login")
    public WebElement Login;
    
    //End Sign On
    
    
    public SignOn Click(WebElement element)
    {
    	ClickElement(element);
    	return this;
    }
    
    public SignOn enterText(WebElement element, String value)
    {
    	EnterText(element,value);
    	return this;
    }
    
    public SignOn SubmitValue(WebElement element)
    {
    	Submit(element);
    	return this;
    }

    public SignOn ValidateCurrentTitle()
    {
    	ValidateTitle(); 
    	return this;
    }
    
    public WebElement ElementManualSearch(String SearchBy, String Path)
    {
    	WebElement ToFind = FindMyElement(SearchBy,Path);

    	return ToFind;
    }
    
	public void ValidateTitle() {
    	String DriverTitle = _driver.getTitle();
    	Assert.assertTrue(DriverTitle.contains(PageTitle));
    	System.out.println("Title is correct: "+ DriverTitle);		
	}
}

