package GenericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {
	
	public void click(WebElement element, WebDriver driver)  {
		JavascriptExecutor javaScript=(JavascriptExecutor) driver;
		javaScript.executeScript("arguments[0].click();", element);
	}
	public void sendValue(WebElement element,String data, WebDriver driver)  {
		JavascriptExecutor javaScript=(JavascriptExecutor) driver;
		javaScript.executeScript("arguments[0].value='data';", element);
	}
	public void scrollIntoView(WebElement element,boolean trueorFalse, WebDriver driver)  {
				JavascriptExecutor javaScript=(JavascriptExecutor) driver;
		javaScript.executeScript("arguments[0].scrollIntoView(trueorFalse)", element);
	}
	public void scrollTo(WebElement element,int x, int y,WebDriver driver)  {
		JavascriptExecutor javaScript=(JavascriptExecutor) driver;
		
		javaScript.executeScript("arguments[0].scrollTo("+x+","+y+")",element);
	}
	
	public void ScrollBy(int x,int y,WebDriver driver) {
		JavascriptExecutor javaScript=(JavascriptExecutor) driver;
		
		javaScript.executeScript("window.scrollBy("+x+","+y+")");
	}	
}
