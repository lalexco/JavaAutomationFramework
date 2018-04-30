package PageObjects;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import BaseFramework.BaseJavaScript;
import BaseFramework.BasePage;
import GenericMethods.GenImplementation;

public class FlightFinder extends BasePage implements GenImplementation{

	String PageTitle;
	
	public FlightFinder(String ExpectedTitle)
	{
		InitPageElements();
		PageTitle = ExpectedTitle;
	}
	
	public static String GetUrl()
	{
		return _driver.getCurrentUrl();
	}

	// Flight Finder Form
    @FindBy(xpath="//input[@value = 'roundtrip']")
    public WebElement RoundTrip;
    
    @FindBy(xpath="//input[@value = 'oneway']")
    public WebElement OneWay;
    
    @FindBy(name="findFlights")
    public WebElement FindflightsContinue;
    
    @FindBy(name="reserveFlights")
    public WebElement ReserveFlights;
    
    //End Flight Finder Form   
   
	// Select Airline Dropdown
    
    @FindBy(name="passFirst0")
    public WebElement PassFirstName;
    
    @FindBy(name="passLast0")
    public WebElement PassLastName;
    
    @FindBy(name="creditnumber")
    public WebElement CardNumber;
    
    @FindBy(name="buyFlights")
    public WebElement PurchaseBtn;
        
    //End Flight Finder Form
    
	// Book A Flight
    
    @FindBy(name="airline")
    public WebElement AirlineDrop;
    
    @FindBy(xpath="//select[@name = 'airline']//child::option[contains(text(),'Blue Skies Airlines')]")
    public WebElement BlueSkies;
    
    @FindBy(xpath="//select[@name = 'airline']//child::option[contains(text(),'Unified Airlines')]")
    public WebElement UnifiedAirlines;
    
    //End Book A Flight
    
    // Flight Confirmation
    
    @FindBy(xpath="//font[@size = '+1']")
    public WebElement MessageConfirmation;
    
    @FindBy(xpath="//img[contains(@src, '/images/forms/home.gif')]")
    public WebElement BackToHomeBtn;
    //End Flight Confirmation
    
    
    public FlightFinder Click(WebElement element)
    {
    	ClickElement(element);
    	return this;
    }
    
    public FlightFinder enterText(WebElement element, String value)
    {
    	EnterText(element,value);
    	return this;
    }
    
    public FlightFinder SubmitValue(WebElement element)
    {
    	Submit(element);
    	return this;
    }

    public FlightFinder ValidateCurrentTitle()
    {
    	ValidateTitle(); 
    	return this;
    }
    
    public WebElement ElementManualSearch(String SearchBy, String Path)
    {
    	WebElement ToFind = FindMyElement(SearchBy,Path);

    	return ToFind;
    }
    
    public FlightFinder ValidateMessage(WebElement element, String ExpectedMsg)
    {
    	boolean IsDisplayed = false;
    	
    	while (!IsDisplayed)
    	{
    		try 
    		{
    			IsDisplayed = element.isDisplayed();
    			Assert.assertEquals(element.getText().trim(), ExpectedMsg);
    		}
    		
    		catch (NoSuchElementException e)
    		{
    			System.out.println("Not finding element.....");
    		}
    		}
    		
    	System.out.println("Messsage Found : " + element.getText().trim());	
    	return this;
    }
    
    public FlightFinder Scroll(String jsScript)
    {
    	BaseJavaScript js = new BaseJavaScript();
    	js.ExecutedJavaScript(jsScript);
    	return this;
    }
    
	public void ValidateTitle() {
    	String DriverTitle = _driver.getTitle();
    	Assert.assertTrue(DriverTitle.trim().contains(PageTitle),"Current Title : " + DriverTitle);
    	System.out.println("Title is correct: "+ DriverTitle);		
	}
}

