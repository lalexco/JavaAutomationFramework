package Microsoft_TestCases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.WinHomePage;
import PageObjects.WinSupport;

public class TestCases {
	WinHomePage winHomePage;
	WinSupport winSupport;
	
	  @Test
	  public void FlujoSupport() {
		  
		  winHomePage
		  .GoTo()
		  .DoClick(winHomePage.WindowsMenu)
		  .ValidaTitulo("Windows");
		  
		  winSupport
		  .Click(winSupport.SupportMenu)
		  .ValidaTitulo("Soporte")
		  .Click(winSupport.SupportBar)
		  .enterText(winSupport.SupportBar, "Visual Studio")
		  .SubmitValue(winSupport.SupportBar);
		  
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  winHomePage = new WinHomePage();  
		  winSupport = new WinSupport();
		  
	  }

	  @AfterTest
	  public void afterTest() {
	  }
}
