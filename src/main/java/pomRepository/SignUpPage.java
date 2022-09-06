package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	@FindBy(xpath="//a[@class='underline-hover']") private WebElement signUpFromHomePage_Button;
	@FindBy(id = "email") private WebElement yourEmailAddress_TextBox;
	@FindBy(id = "passwd") private WebElement password_TextBox;
	@FindBy(id = "cname") private WebElement yourCountry_TextBox;
	@FindBy(id = "mob") private WebElement phoneNumber_TextBox;
	@FindBy(xpath="//button[@data-target ='sign-up-2']") private WebElement submit_button;  //submit()
	@FindBy(name = "fname") private WebElement firstName_TextBox;
	@FindBy(name = "lname") private WebElement secondName_TextBox;
	@FindBy(name = "dob") private WebElement dateOfBirth_TextBox;
	@FindBy(xpath="//select[@title='Select a year']") private WebElement selectAYear_fromCalenderPopUp;
	@FindBy(xpath=" //select[@title='Select a month']") private WebElement selectAMonth_fromCalenderPopUp;
	
	@FindBy(xpath="//div[@aria-label='05-Jun-2022']") private WebElement selectADate_fromCalenderPopUp;
	@FindBy(xpath="//button[text()='Sign me up!']") private WebElement signMeUp_Button;
	@FindBy(xpath="//div[@class = 'profile-icon']")  private WebElement profileIcon;
	@FindBy(xpath="//img[@src = 'https://cdn.igp.com/raw/upload/assets/svg-icons/Icon-Logout.svg']")  private WebElement logoutIcon;
	
	
	

	
	
	
	

	
//	driver.findElement(By.xpath("//div[text()='"+month+"']/..//span[text()='"+year+"']/../../..//p[text()='"+date+"']")).click(
	
	
	
	
	
	
	
	
	public SignUpPage(WebDriver driver) {          //contructor
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
