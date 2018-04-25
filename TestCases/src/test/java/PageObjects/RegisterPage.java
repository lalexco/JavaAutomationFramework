package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import BaseFramework.BasePage;
import GenericMethods.GenImplementation;

public class RegisterPage extends BasePage implements GenImplementation{

	String PageTitle;
	
	public RegisterPage(String ExpectedTitle)
	{
		InitPageElements();
		PageTitle = ExpectedTitle;
	}
	
	public static String GetUrl()
	{
		return _driver.getCurrentUrl();
	}

	// Register Form
    @FindBy(name="firstName")
    public WebElement FristName;
    
    @FindBy(name="lastName")
    public WebElement LastName;
    
    @FindBy(name="phone")
    public WebElement Phone;
    
    @FindBy(name="userName")
    public WebElement UserName;
    
    @FindBy(name="address1")
    public WebElement Address;
    
    @FindBy(name="city")
    public WebElement City;
    
    @FindBy(name="state")
    public WebElement State;
    
    @FindBy(name="postalCode")
    public WebElement PostalCode;
    
    @FindBy(name="email")
    public WebElement Email;
    
    @FindBy(name="password")
    public WebElement Password;
    
    @FindBy(name="confirmPassword")
    public WebElement ConfirmPassword;
    
    @FindBy(name="register")
    public WebElement RegisterBtn;
    //End Register Form
    
    public RegisterPage Click(WebElement element)
    {
    	ClickElement(element);
    	return this;
    }
    
    public RegisterPage enterText(WebElement element, String value)
    {
    	EnterText(element,value);
    	return this;
    }
    
    public RegisterPage SubmitValue(WebElement element)
    {
    	Submit(element);
    	return this;
    }

    public RegisterPage ValidateCurrentTitle()
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



