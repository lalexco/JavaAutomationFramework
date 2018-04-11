package Tecgurus.com.TestFramework;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseBrowser {
	private WebDriver driver;
	
	public WebDriver SetUpDriver(String BrowserName)
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
	
	public void GoTo(String Url)
	{
		driver.get(Url);
	}
	
	public BaseBrowser ClickElement(WebElement element)
	{
		WaitForelement(element);
		element.click();	
		return this;
	}
	
	public void WaitForelement(WebElement element)
	{
		boolean isDisplayed = false;
		
		while(!isDisplayed)
		{
		try
		{
			isDisplayed = element.isDisplayed();
			
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Element not found.... searching");
		}
		}
	}
	
	public WebElement FindMyElement(String SearchBy, String Path)
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
			
			System.out.println("Element not found.... searching" + Path);	
			
		}
		
		}		
		
		return element;
	}
	
	public void VerifyChilds(WebElement element)
	{
		List<WebElement> ChildList = null;
		
		ChildList = element.findElements(By.xpath("//child::a[@class = 'c-hyperlink']//p"));
		
        for (WebElement ele:ChildList)
        System.out.println(ele.getText());
		
		
	}
	
	public void Submit (WebElement element)
	{
		element.submit();
	}
	
	public void EnterText(WebElement element, String value)
	{
		element.sendKeys(value);
	}

}
