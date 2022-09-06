package GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IAutoContants{
	public WebDriver driver=null;
	public static WebDriver sDriver ;
	public ExcelUtility excelUtility = new ExcelUtility();
	public JavaScriptExecutor javaScript = new JavaScriptExecutor();
	
	
	@BeforeSuite(alwaysRun=true)
	public void ProjectDocuments() {
		Reporter.log("IGP web application",true);
	}


	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		WebDriverManager.chromedriver().setup(); 

	}


	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized successfully",true);
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		sDriver=driver;
	}

	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() {

		driver.get(URL);
				Assert.assertEquals(driver.getCurrentUrl(), URL,"given url is not entered in the address bar");
				Assert.assertEquals(driver.getTitle(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 17, 3));
		
	}

	@AfterMethod(alwaysRun=true)
	public void afterMethod() {
	
		
	}
	@AfterClass(alwaysRun=true)
	public void afterClass() {
      //  driver.close();
		Reporter.log("browser closed",true);
	}
	@AfterSuite(alwaysRun=true)
	public void ReportGenerate() {
		Reporter.log("report generated",true);
	}

}
