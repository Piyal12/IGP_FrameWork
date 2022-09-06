package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;

@Listeners(GenericLibrary.ListenerImplementationClass.class)

public class SameDayDeliveryPage {
	
	public SameDayDeliveryPage(WebDriver driver) 
	{          //contructor
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(xpath=("//a[@class='tile-8 sdd']"))
		private WebElement Samedaydelivery;
		
		@FindBy(xpath=("//span[@id='ab-test-filters-2-3']"))
		private WebElement Clickoncake;
		
//		@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt8prodlp/products/p-black-forest-cake-half-kg--13461-m.jpg')]/ancestor::div[@class='product-grid-item product-grid-item-revamp col s3']"))
		@FindBy(xpath = "//p[normalize-space()='Black Forest Cake (Half Kg)']")
		private WebElement Blackforest;
		
		@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt3prodlp/products/p-black-forest-cake-half-kg--13461-m.jpg')]"))
		private WebElement Halfkg;
		
		@FindBy(xpath=("//input[@id='location-input']"))
		private WebElement Pincode;
		
		@FindBy(xpath=("//input[@id='location-input']"))
		private WebElement NonPincode;
		
		@FindBy(xpath ="//button[@id='show-Select_Date']") 
		private WebElement selectDate_dropdown;
		
		@FindBy(xpath="//span[text()='Next']") 
		private WebElement calenderNext_button;
		
		@FindBy(xpath="//a[text()='8']") 
		private WebElement Select_calenderDate;
		
		@FindBy(xpath="//select[@class='picker__select--year']") 
		private WebElement YearDD;
		
		@FindBy(xpath=("//button[@id='cal-Midnight']"))
		private WebElement Midnight;
		
		@FindBy(xpath=("//button[@id='cal-Fixed_Time']"))
		private WebElement Fixedtime;
		
		@FindBy(xpath=("//button[@id='cal-Standard']"))
		private WebElement standard;
		
		@FindBy(xpath=("//select[@id='timepicker']"))
		private WebElement Timeslot;
		
		@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt2prodlp/products/p-sparkle-candle-135048-m.jpg')]"))
		private WebElement Candle;
		
		@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt2prodlp/products/p-sparkle-candle-135048-m.jpg')]"))
		private WebElement removeCandle;
		
		@FindBy(xpath=("//span[text()='ADD TO CART']"))
		private WebElement Addtocart;
		
		@FindBy(xpath=("//span[text()='ADD TO CART']"))
		private WebElement Continuewithoutaddons;
		
		@FindBy(xpath=("//a[text()=' Proceed To Checkout']"))
		private WebElement proceedtocheckout;
		
		@FindBy(xpath=("//span[@id='goto-signup']"))
		private WebElement signup;
		
		@FindBy(xpath=("//input[@id='cname']"))
		private WebElement firstname;
		
		@FindBy(xpath=("//div[@class='col s4 no-padding']/descendant::input[@class='accord-input revamp-login-input login-input required input suggestCountry']"))
		private WebElement Country;
		
		@FindBy(xpath=("//input[@id='email']"))
		private WebElement email;
		
		@FindBy(xpath=("//input[@id='passwd']"))
		private WebElement password;
		
		@FindBy(xpath=("//input[@id='dob']"))
		private WebElement DOB;
				
		@FindBy(xpath=("//div[@class='col s4 no-padding']/descendant::button[text()='SIGNUP']"))
		private WebElement SIGNUP;
		
		@FindBy(xpath=("//input[@name='fname']"))
		private WebElement fname;
		
		/*@FindBy(xpath=("//input[@name='cname']"))
		private WebElement cname;

		@FindBy(xpath=("//input[@id='location-input']"))
		private WebElement pcode;
		
		@FindBy(xpath=("//button[@id='show-Tomorrow,_01_Sep']"))
		private WebElement dateselect;*/

		@FindBy(xpath=("//input[@name='saddr']"))
		private WebElement Address;
		
		@FindBy(xpath=("//input[@name='mob']"))
		private WebElement mobileno ;
		
		@FindBy(xpath=("//input[@id='e-form-email-']"))
		private WebElement mail;
		
		@FindBy(xpath=("//button[@class='btn revamp-c-save-addr-btn address-save-btn z-depth-1 waves-effect revamp-c-save-addr-btn u-case deliver text-center c-save-addr-btn c-btn btn-red ']"))
		private WebElement savedeliver;
		
		@FindBy(xpath=("//label[text()='Birthday']"))
		private WebElement Birthday;
		
		@FindBy(xpath=("//input[@id='to-field']"))
		private WebElement orderto;
		
		@FindBy(xpath=("//input[@id='from-field']"))
		private WebElement orderfrom;
		
		@FindBy(xpath=("//textarea[@id='msg-field']"))
		private WebElement textarea;
		
		@FindBy(id = "coupon") private WebElement enterCouponTextfield;
		
		@FindBy(xpath = "//p[@id='coupon-message']") private WebElement couponErrorMessage_Text;
		
		@FindBy(xpath = "//p[@class='Montbold-font coupon-band-text']") private WebElement couponCodeApplied_Text;
		
		@FindBy(xpath ="//span[contains(@class,'Montbold-font u-case bold')]/..//span[contains(text(),'581')]") 
		private WebElement finalAmountAfterAppliedCoupon;
		
		@FindBy(xpath = "//span[@class='coupon-form-focus']")
		private WebElement orderApplyCoupon_Link;
		
		@FindBy(xpath = "//button[contains(@class,'-apply-coupan-btn')] ") 
		private WebElement applyButton;
		
		@FindBy(xpath = "//div[@class='header-link payment-text chkpayment desktop']") 
		private WebElement payment_Tab;
		
		@FindBy(xpath = "//button[contains(@class,'mp-payment-button')]")
		private WebElement proceedToPayment_Btn;
		
		@FindBy(xpath = "//div[contains(text(),'NET BANKING')]") 
		private WebElement netBanking_Btn;
		
		
		@FindBy(xpath = "//img[@alt='HDFC']") private WebElement HDFCbank_image;
		
		@FindBy(xpath = "//button[contains(text(),'MAKE PAYMENT')]") private WebElement MakePayment_Btn;

		@FindBy(xpath ="//input[@id='pm-HDFC']") private WebElement HDFC_radioBtn;

	@FindBy(xpath ="//table//td/div[text()='31']") private WebElement DATE;
		
		public WebElement Samedaycategorybtn() {
			return Samedaydelivery;
		}
		
		public WebElement Cake() {
			return Clickoncake;
		}
		
		public WebElement Blackforestcake() {
			return Blackforest;
		}
		
		public WebElement EnterPincode() {
			return Pincode;
		}
		
		public WebElement EnterNondeliveryPincode() {
			return NonPincode;
		}
		
		public WebElement Deliverydate() {
			return selectDate_dropdown;
		}
		
		public WebElement CalenderButton() {
			return Select_calenderDate;
		}
		
		
		public WebElement deliverytype() {
			return standard;
		}
		
		public WebElement Selectcandle() {
			return Candle;
		}
		
		public WebElement DeSelectcandle() {
			return removeCandle;
		}
		
		
		public WebElement clickAddtocart() {
			return Addtocart;
		}
		
		public WebElement TimeDD() {
			return Timeslot;
		}
		
//		public WebElement ContinueButton() {
//			return Continuewithoutaddons;
//		}
		
		public WebElement Checkoutbutton() {
			return proceedtocheckout;
		}
		
		
		public WebElement Sigunuplink() {
			return signup;
		}
		
		public WebElement EnterFirstname() {
			return firstname;
		}
		
		public WebElement EnterCountryName() {
			return Country;
		}
		
		public WebElement Entermailid() {
			return email;
		}
		
		public WebElement Entermobileno() {
			return mobileno;
		}
		
		public WebElement Enterpassword() {
			return password;
		}
		
		
		public WebElement Dateofbirth() {
			return DOB;
		}
		
		public WebElement YearDropdown() {
			return YearDD;
		}
//	public WebElement Date() {
//		return DATE;
//	}
		
		public WebElement DobDate() {
			return DATE;
		}
		
		public WebElement ClickSignup() {
			return SIGNUP;
		}
		
		public WebElement firstname() {
			return fname;
		}
		
		public WebElement Enteraddress() {
			return Address;
		}
		
		public WebElement Enterphoneno() {
			return mobileno;
		}
		
		public WebElement Savedeliverbutton() {
			return savedeliver;
		}
		
		public WebElement Messagecard() {
			return Birthday;
		}
		
		public WebElement MessageBox() {
			return textarea;
		}
		
		
		public WebElement getHDFC_radioBtn() {
			return HDFC_radioBtn;
		}
		
		public WebElement getMakePayment_Btn() {
			return MakePayment_Btn;
		}
		
		public WebElement getProceedToPayment_Btn() {
			return proceedToPayment_Btn;
		}
		
		public WebElement getHDFCbank_image() {
			return HDFCbank_image;
		}
		
		public WebElement getNetBanking_Btn() {
			return netBanking_Btn;
		}
		
		public WebElement getPayment_Tab() {
			return payment_Tab;
		}
		public WebElement getFinalAmountAfterAppliedCoupon() {
			return finalAmountAfterAppliedCoupon;
		}
		
		public WebElement getOrderApplyCoupon_Link() {
			return orderApplyCoupon_Link;
		}
		public WebElement getApplyButton() {
			return applyButton;
		}
		public WebElement getEnterCouponTextfield() {
			return enterCouponTextfield;
		}
		public WebElement getCouponErrorMessage_Text() {
			return couponErrorMessage_Text;
		}
		public WebElement getCouponCodeApplied_Text() {
			return couponCodeApplied_Text;
		}
		
		
		
}


