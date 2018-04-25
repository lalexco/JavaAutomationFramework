package BaseFramework;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseBrowser {
	private WebDriver driver;
	
	protected WebDriver SetUpDriver(String BrowserName)
	{
		switch (BrowserName)
		{
		case "Chrome":
		  System.setProperty("webdriver.chrome.driver", System.getenv("CHROMEDRIVER"));
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  break;
		  
		  default: break;		  
		}
		
		  return driver;
	}
	
	protected void GoTo(String Url)
	{
		driver.get(Url);
	}
	
	protected BaseBrowser ClickElement(WebElement element)
	{
		WaitForelement(element);
		element.click();	
		return this;
	}
	
	protected void WaitForelement(WebElement element)
	{
		boolean isDisplayed = false;
		
		while(!isDisplayed)
		{
		try
		{
			isDisplayed = element.isDisplayed();
			System.out.println("Element was found");
			
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Element not found.... searching");
		}
		}
	}
	
	protected WebElement FindMyElement(String SearchBy, String Path)
	{
		WebElement element = null;
		while (element == null)
		{
			try
			{
				switch (SearchBy)
				{
				case "Xpath":
					element = driver.findElement(By.xpath(Path));					
					break;
					
				case "Id":
					element = driver.findElement(By.id(Path));	
					break;
					
				case "Class":
					element = driver.findElement(By.className(Path));					
					break;
					
				default:
					break;
					}
				
			}
			catch(Exception e )
			{
				
				System.out.println("Element not found.... searching: " + Path);					
			}		
		}		
		
		return element;
	}
	
	protected void VerifyChilds(WebElement element, String xpath)
	{
		List<WebElement> ChildList = null;
		
		ChildList = element.findElements(By.xpath(xpath));
		
        for (WebElement ele:ChildList)
        System.out.println(ele.getText());
		
		
	}
	
	protected void Submit (WebElement element)
	{
		element.submit();
	}
	
	protected void EnterText(WebElement element, String value)
	{
		element.sendKeys(value);
	}

}
