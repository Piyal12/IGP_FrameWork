package ExistingUserJourney;

import GenericLibrary.BaseClass;
import GenericLibrary.PropertyFile;
import GenericLibrary.SelectClassUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import pomRepository.SameDayDeliveryPage;

import java.util.Random;

public class SignUpDetails extends BaseClass {
    PropertyFile propertyFile=new PropertyFile();
    SelectClassUtility select1=new SelectClassUtility();
    public void signUp(WebDriver driver){
        try {
            SameDayDeliveryPage same_Day_Deliver = PageFactory.initElements(driver, SameDayDeliveryPage.class);

            //SignUp Details
            same_Day_Deliver.Sigunuplink().click();
            same_Day_Deliver.EnterFirstname().sendKeys(propertyFile.readDataFromProperty("./src/test/resources/Data.properties", "Firstname"));
            //Thread.sleep(3000);

            WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebDriverWait wait1= new WebDriverWait(driver, 10);
//		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='accord-input revamp-login-input login-input required input suggestCountry error ui-autocomplete-input']")));
//		driver.findElement(By.xpath("//input[@class='accord-input revamp-login-input login-input required input suggestCountry error ui-autocomplete-input']")).sendKeys("India");
            same_Day_Deliver.EnterCountryName().sendKeys(propertyFile.readDataFromProperty("./src/test/resources/Data.properties", "CountryName"));
            same_Day_Deliver.Entermobileno().sendKeys(propertyFile.readDataFromProperty("./src/test/resources/Data.properties", "Mobileno"));
            Random r = new Random();
            int next = r.nextInt();
            same_Day_Deliver.Entermailid().sendKeys(propertyFile.readDataFromProperty("./src/test/resources/Data.properties", "Mailid1st") + next + propertyFile.readDataFromProperty("./src/test/resources/Data.properties", "MailidDomain"));
            same_Day_Deliver.Enterpassword().sendKeys(propertyFile.readDataFromProperty("./src/test/resources/Data.properties", "Password"));
            //Thread.sleep(2000);
//        same_Day_Deliver.Dateofbirth().click();
//        same_Day_Deliver.YearDropdown().click();
//		Select select2=new Select(same_Day_Deliver.YearDropdown());
//		select2.selectByVisibleText(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 5));
//        same_Day_Deliver.DobDate().click();
////        WebElement YEAR=same_Day_Deliver.YearDropdown();
////        select1.selectDropDown(YEAR, excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 5));
        Reporter.log("Selected Required Delivery TYpe and Time",true);

        }catch (Exception e){

        }
    }
}
