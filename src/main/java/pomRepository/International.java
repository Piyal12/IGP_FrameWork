package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class International {

	public International(WebDriver driver) {          //contructor
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt5prodlp/banners/igp_USA_d_country_20220127.jpg')]"))
		private WebElement USA;
		
		@FindBy(xpath=("//span[@id='ab-test-filters-2-3']"))
		private WebElement Clickoncake;
		
		@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt8prodlp/products/p-black-forest-cake-half-kg--13461-m.jpg')]"))
		private WebElement Blackforest;
		
		@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt3prodlp/products/p-black-forest-cake-half-kg--13461-m.jpg')]"))
		private WebElement Halfkg;
		
		@FindBy(xpath=("//input[@id='location-input']"))
		private WebElement Pincode;
		
		@FindBy(xpath=("//span[@class='sddName del-select_last del-select_2']"))
		private WebElement Selectdate;
		
		@FindBy(xpath=("//button[@id='cal-Midnight']"))
		private WebElement Midnight;
		
		@FindBy(xpath=("//button[@id='cal-Fixed_Time']"))
		private WebElement Fixedtime;
		
		@FindBy(xpath=("//button[@id='cal-Standard']"))
		private WebElement standard;
		
		@FindBy(xpath=(""))
		private WebElement Timeslot;
		
		@FindBy(xpath=("//span[text()='ADD TO CART']"))
		private WebElement Addtocart;
		
		@FindBy(xpath=("//span[text()='CONTINUE WITHOUT ADDONS']"))
		private WebElement Continuewithoutaddons;
		
		@FindBy(xpath=("//a[text()=' Proceed To Checkout']"))
		private WebElement proceedtocheckout;
		
		@FindBy(xpath=("//span[@id='goto-signup']"))
		private WebElement signup;
		
		@FindBy(xpath=("//input[@id='cname']"))
		private WebElement firstname;
		
		@FindBy(xpath=("//input[@id='mob']"))
		private WebElement Country;
		
		@FindBy(xpath=("//input[@id='email']"))
		private WebElement email;
		
		@FindBy(xpath=("//input[@id='passwd']"))
		private WebElement password;
		
		@FindBy(xpath=("//button[text()='SIGNUP']"))
		private WebElement SIGNUP;
		
		@FindBy(xpath=(""))
		private WebElement DOB;
		
		@FindBy(xpath=("//input[@name='fname']"))
		private WebElement fname;
		
		@FindBy(xpath=("//input[@name='cname']"))
		private WebElement cname;
		
		@FindBy(xpath=("//input[@id='location-input']"))
		private WebElement pcode;
		
		@FindBy(xpath=("//button[@id='show-Tomorrow,_01_Sep']"))
		private WebElement dateselect;

		
		@FindBy(xpath=("//input[@name='saddr']"))
		private WebElement Address;
		
		@FindBy(xpath=("//input[@name='mob']"))
		private WebElement mob ;
		
		@FindBy(xpath=("//input[@id='e-form-email-']"))
		private WebElement mail;
		
		@FindBy(xpath=(""))
		private WebElement savedeliver;
		
		@FindBy(xpath=("//label[text()='Birthday']"))
		private WebElement Birthday;
		
		@FindBy(xpath=("//input[@id='to-field']"))
		private WebElement orderto;
		
		@FindBy(xpath=("//input[@id='from-field']"))
		private WebElement orderfrom;
		
		@FindBy(xpath=("//textarea[@id='msg-field']"))
		private WebElement textarea;
		
		@FindBy(xpath=("//span[@class='coupon-form-focus']"))
		private WebElement Apply;
	
		@FindBy(xpath=("//input[@id='coupon']"))
		private WebElement Coupon;
		
		@FindBy(xpath=("//div[@class='payment-button-container']"))
		private WebElement payment;
}
