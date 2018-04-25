package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import BaseFramework.BaseJavaScript;
import BaseFramework.BasePage;
import GenericMethods.GenImplementation;
import TestInitializer.TestContext;

public class HomePage extends BasePage implements GenImplementation{

	String PageTitle;
	
	public HomePage(String ExpectedTitle)
	{
		InitBrowser();
		InitPageElements();
		PageTitle = ExpectedTitle;
	}
		
	//Menu buttons
	
    @FindBy(xpath="//a[contains(text(),'REGISTER')]")
    public WebElement RegisterMenu;
    
    @FindBy(xpath="//a[contains(text(),'SIGN-OFF')]")
    public WebElement SignOn;
    
    //End Menu buttons
        
    
    public HomePage DoClick(WebElement element) 
    {
    	ClickElement(element);
    	return this;
    }
    
    public HomePage AssertElement(WebElement element)
    {
    	WaitForelement(element);
    	return this;	
    }
    
    public HomePage GoTo()
    {
    	GoTo(TestContext.GetUrl());
		ValidateTitle();
    	return this;	
    }
    
    public HomePage Scroll(String jsScript)
    {
    	BaseJavaScript js = new BaseJavaScript();
    	js.ExecutedJavaScript(jsScript);
    	return this;
    }

	public void ValidateTitle() {
		
    	String DriverTitle = _driver.getTitle();
    	Assert.assertTrue(DriverTitle.contains(PageTitle));
    	System.out.println("Title is correct: "+ DriverTitle);
		
	}
}
