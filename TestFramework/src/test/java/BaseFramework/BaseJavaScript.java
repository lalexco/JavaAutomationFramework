package BaseFramework;

import org.openqa.selenium.JavascriptExecutor;

public class BaseJavaScript extends BasePage {
	JavascriptExecutor js = (JavascriptExecutor ) _driver;

	public void ExecutedJavaScript(String script)
	{
		js.executeScript(script);
	}
	

}
