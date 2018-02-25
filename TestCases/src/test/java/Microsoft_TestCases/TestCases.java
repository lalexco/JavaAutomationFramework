package Microsoft_TestCases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.WinHomePage;

public class TestCases {
	WinHomePage winHomePage;
	  @Test
	  public void GameFlow() {
		  
		  winHomePage
		  .GoTo()
		  .ValidaTitulo("Microsoft")
		  .DoClick(winHomePage.WindowsMenu)
		  .AssertElement(winHomePage.JuegosMenu)
		  .DoClick(winHomePage.JuegosMenu);
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  winHomePage = new WinHomePage();  
	  }

	  @AfterTest
	  public void afterTest() {
	  }
}
