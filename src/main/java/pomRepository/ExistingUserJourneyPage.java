package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistingUserJourneyPage {

 // public WebDriver driver ;

	@FindBy(xpath="//img[contains(@src,'/w-tiles-personalize-v1.svg')]") private WebElement Personalize_link;
	
	@FindBy(xpath="//div[@data-selected-type='202717']") private WebElement photoGifts_button;
	
	@FindBy(xpath="//p[text()='Photo Canvas & Plaques']") private WebElement PhotoCanvas_linktext;
	
	@FindBy(xpath="//p[@id='pin-error-text']") private WebElement pincodeError_message;	
	
	@FindBy(xpath="//img[contains(@src,'n-jigsaw-heart-puzzle-149085-m.jpg')]") private WebElement photoframe_image;
	
	@FindBy(xpath="//h1[text()='Forever Love Personalized Wooden Jigsaw Heart Puzzle']") private WebElement product_Text;
	
	@FindBy(name = "countries") private WebElement country_TextField;
	
	@FindBy(id = "location-input") private WebElement Pincode_TextField;
	
	@FindBy(id = "pincode-check-btn") private WebElement check_button;
	
	@FindBy(xpath = "//button[@id='available-pincode']") private WebElement available_button;  
	
	@FindBy(xpath="//button[@class = 'pincode-notfound']") private WebElement error_button;
	
	@FindBy(xpath="//span[text() = 'Standard Delivery']") private WebElement standardDelivery;

	@FindBy(id = "std-datepicker") private WebElement selectDate_dropdown;

	@FindBy(xpath="//span[text()='Next']") private WebElement calenderNext_button;

	@FindBy(xpath="//a[text()='8']") private WebElement Select_calenderDate;

	@FindBy(xpath="//input[@id ='std-datepicker']") private WebElement SelectedDateOnField; 

	@FindBy(id = "personalize-revamp") private WebElement personalizeNow_button;

	@FindBy(xpath = "//img[contains(@src,'rs/13450/13401/small.jpg')]")  private WebElement selectedDesign_image;

	@FindBy(xpath ="//h1[text()='Forever Love Personalized Wooden Jigsaw Heart Puzzle']") private WebElement actualImage_text;
	
	@FindBy(xpath ="//h3[text()='Forever Love Personalized Wooden Jigsaw Heart Puzzle']")  private WebElement selectedImage_text;
	
	@FindBy(id = "continue-icon") private WebElement continue_button;

	
	//uploading image page
	@FindBy(xpath ="//p[text()='Start Personalizing']")  private WebElement uploadpage_text;
	
	@FindBy(id = "opener") private WebElement uploadImage_button;

	@FindBy(xpath = "//button[@data-test='url-btn']") private WebElement select_webBrowserTab;
	
	@FindBy(xpath = "//span[text()='My Files']") private WebElement select_MyFiles;
	
	@FindBy(xpath = "//iframe[@data-test='uw-iframe']") private WebElement selectFrame;

	@FindBy(xpath = "//iframe[contains(@src,'https://www.igp.com')]") private WebElement selectFrame2;
	
	@FindBy(xpath = "//div[contains(@class,'css-1emeo9b')]") private WebElement publicUrlOfFile_Text;
	
	@FindBy(xpath = "//input[@data-test = 'search-input-box']") private WebElement Search_Field;

	@FindBy(xpath = "//button[@data-test = 'upload-from-link-btn']") private WebElement SearchBox_arrowButton;

	@FindBy(xpath ="//div[@class='css-5nfit2 self-center relative pl5 f5 fw6 c-window-border bl']")  private WebElement uploadImagePage_Text;
	
	@FindBy(xpath = "//button[@data-test = 'cropBtn']") private WebElement Crop_uploadImageBtn;

	@FindBy(xpath = "//img[contains(@src,'format&fit=crop&w=1964&q=80')]") private WebElement Croptted_Image;
	
	@FindBy(xpath = "//img[contains(@src,'65469734/b0pcwvvttkptsfzyiegk.png')]")  private WebElement uploaded_Image;
	
	@FindBy(xpath = "//div[contains(text(),'Image 1')]") private WebElement image_1_Text;

	@FindBy(xpath = "//a[contains(text(),'Edit')]")  private WebElement Edit_Btn;

	@FindBy(xpath ="//a[contains(text(),'Save & Review')]")  private WebElement saveAndReview_Btn;

	@FindBy(xpath ="//button[@title='ADD TO CART']")  private WebElement addToCart_Btn;
	
	@FindBy(xpath ="//button[text()='EDIT PERSONALISATION']")  private WebElement editPersonalize_Btn;
	
	@FindBy(xpath="//span[text()='Make it extra special']") private WebElement addonOverlay_text;
	
	@FindBy(xpath ="//p[contains(text(),'Besan Ladoo (200 Gms)')]")  private WebElement addon_image;

	@FindBy(xpath ="//button[@title='ADD TO CART']/descendant ::span[text()='CONTINUE WITH ADDONS (1)']")  private WebElement continueWithAddonsNum_button; 
	
	@FindBy(xpath ="//span[text()='CONTINUE WITHOUT ADDONS']")  private WebElement continueWithoutAddonsNum_button;
		
	//Shopping Cart

	@FindBy(xpath ="//p[text()='Forever Love Personalized Wooden Jigsaw Heart Puzzle']") private WebElement SelectedProduct;

	@FindBy(xpath ="//a[text()=' Proceed To Checkout']") private WebElement proceedToCheckour_Btn;
	
	@FindBy(xpath ="//span[@id='i-count']") private WebElement totalProdutQty;
	
	@FindBy(xpath ="//span[@id='inc-quantity-588045']") private WebElement increament_Btn;
	
	@FindBy(xpath ="//span[@id='cart-total-val']") private WebElement productPrice;
	
	@FindBy(xpath ="//input[@id='c-item-qty-588045']") private WebElement inputProductQty;
	
	@FindBy(xpath ="//img[@alt='outlined-trash-icon img']") private WebElement delete_Btn;
	
	@FindBy(id = "email") private WebElement email_Textfield;
	
	@FindBy(id = "passwd") private WebElement password_Textfield;
	
	@FindBy(xpath ="(//button[text()='SIGN IN'])[1]") private WebElement signIn_Btn;
	
	@FindBy(xpath ="//div[contains(text() , 'Delivery Details')]") private WebElement deliveryDetails_tab;
	
	@FindBy(xpath ="//div[contains(@class,'container-add-new-address')]/descendant::img[contains(@src,'svg-icons/add-new-address-5.svg')]") private WebElement addNewAddress_Btn;
	
	//Add new address page
	@FindBy(xpath ="//span[contains(text(),'Add new address')]") private WebElement addNewAddress_TitleText;
	
	@FindBy(xpath ="//span[text()=' Add new address']/../..//input[@name='fname']") private WebElement firstName_TextBox;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='saddr']") private WebElement addressline1_textField;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='saddr2']") private WebElement addressline2_textField;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='mob']") private WebElement mobileNum_textField;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='alternateMob']") private WebElement alternativeMobileNum_textField;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='email']") private WebElement emailId_textField;
	
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//button[text()='Save & Deliver']") private WebElement saveAndDeliver_Btn;
	
	@FindBy(xpath ="//div[contains(text(),'Order Summary')]") private WebElement orderSummary_Tab;
	
	@FindBy(xpath ="//label[@for='occasion-2'] ") private WebElement birthday_Btn;
	      
	@FindBy(xpath ="//textarea[@id='msg-field']") private WebElement message_TextField;
	
	@FindBy(xpath = "//div[@class= 'revamp-update-card-btn']") private WebElement messageSaved_Btn;
	
	@FindBy(xpath = "//button[contains(@class,'btn revamp-apply-btn1')]") private WebElement applyChanges_Btn;
			
	
	
	@FindBy(xpath = "//span[contains(@class,'vamp-ordsummary-number ')]") private WebElement orderTotalAmount;
	
	@FindBy(xpath = "//span[contains(@id,'c_item_qty_588045')]") private WebElement orderProductQty;
	
	@FindBy(xpath = "//span[text()='Forever Love Personalized Wooden Jigsaw Heart Puzzle']") private WebElement orderProduct;
	
	@FindBy(xpath = "//div[contains(@class,'billing-total-header')]") private WebElement billingDetails;
	
	@FindBy(xpath = "//div[contains(@class,'billing-total-header')]/..//span[contains(text(),'1')]") private WebElement billDetail_totalItems;
	
	@FindBy(xpath = "//div[contains(@class,'billing-total-header')]/..//span[contains(text(),'645')][1]") private WebElement billDetail_subTotalAmt;
	
	@FindBy(xpath = "//div[contains(@class,'billing-total-header')]/..//span[contains(text(),'0')]") private WebElement billDetail_discount;
	
	@FindBy(xpath = "//span[contains(text(),'Free')]") private WebElement billDetail_shippingcharge;
	
	@FindBy(xpath = "//span[contains(@class,'Montbold-font u-case bold')]/..//span[contains(text(),'645')]") private WebElement finalAmount;
	
	@FindBy(xpath = "//button[contains(@class,'mp-payment-button')]") private WebElement proceedToPayment_Btn;
	
	@FindBy(xpath = "//span[@class='coupon-form-focus']") private WebElement orderApplyCoupon_Link;
	
	@FindBy(xpath = "//button[contains(@class,'-apply-coupan-btn')] ") private WebElement applyButton;
	
	@FindBy(id = "coupon") private WebElement enterCouponTextfield;
	
	@FindBy(xpath = "//p[@id='coupon-message']") private WebElement couponErrorMessage_Text;
	
	@FindBy(xpath = "//p[@class='Montbold-font coupon-band-text']") private WebElement couponCodeApplied_Text;
	
	@FindBy(xpath ="//span[contains(@class,'Montbold-font u-case bold')]/..//span[contains(text(),'581')]") private WebElement finalAmountAfterAppliedCoupon;
	
	
	@FindBy(xpath = "//div[@class='header-link payment-text chkpayment desktop']") private WebElement payment_Tab;
	
	@FindBy(xpath = "//div[contains(text(),'NET BANKING')]") private WebElement netBanking_Btn;
	
	@FindBy(xpath = "//img[@alt='HDFC']") private WebElement HDFCbank_image;
	
	@FindBy(xpath = "//button[contains(text(),'MAKE PAYMENT')]") private WebElement MakePayment_Btn;

	@FindBy(xpath ="//input[@id='pm-HDFC']") private WebElement HDFC_radioBtn;
	
	public ExistingUserJourneyPage(WebDriver driver) {          //contructor
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHDFC_radioBtn() {
		return HDFC_radioBtn;
	}
	
	public WebElement getMakePayment_Btn() {
		return MakePayment_Btn;
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
	
	
	public WebElement getProceedToPayment_Btn() {
		return proceedToPayment_Btn;
	}
	
	public WebElement getFinalAmount() {
		return finalAmount;
	}
	
	public WebElement getBillDetail_shippingcharge() {
		return billDetail_shippingcharge;
	}
	
	public WebElement getBillDetail_discount() {
		return billDetail_discount;
	}
	
	
	public WebElement getBillDetail_subTotalAmt() {
		return billDetail_subTotalAmt;
	}
	
	public WebElement getBillDetail_totalItems() {
		return billDetail_totalItems;
	}
	
	public WebElement getBillingDetails() {
		return billingDetails;
	}
	
	public WebElement getOrderProduct() {
		return orderProduct;
	}
	
	public WebElement getOrderProductQty() {
		return orderProductQty;
	}
	
	public WebElement getOrderTotalAmount() {
		return orderTotalAmount;
	}
	
	
	public WebElement getApplyChanges_Btn() {
		return applyChanges_Btn;
	}
	
	public WebElement getMessageSaved_Btn() {
		return messageSaved_Btn;
	}
	
	public WebElement getBirthday_Btn() {
		return birthday_Btn;
	}
	
	public WebElement getMessage_TextField() {
		return message_TextField;
	}
	
	
	public WebElement getSaveAndDeliver_Btn() {
		return saveAndDeliver_Btn;
	}
	
	public WebElement getOrderSummary_Tab() {
		return orderSummary_Tab;
	}
	
	public WebElement getProceedToCheckour_Btn() {
		return proceedToCheckour_Btn;
	}
	
	public WebElement getTotalProdutQty() {
		return totalProdutQty;
	}
	
	public WebElement getIncreament_Btn() {
		return increament_Btn;
	}
	
	public WebElement getDeliveryDetails_tab() {
		return deliveryDetails_tab;
	}
	
	public WebElement getProductPrice() {
		return productPrice;
	}
	
	public WebElement getInputProductQty() {
		return inputProductQty;
	}
	
	public WebElement getDelete_Btn() {
		return delete_Btn;
	}
	
	public WebElement getEmail_Textfield() {
		return email_Textfield;
	}
	
	public WebElement getPassword_Textfield() {
		return password_Textfield;
	}
	
	public WebElement getSignIn_Btn() {
		return signIn_Btn;
	}
	
	public WebElement getAddNewAddress_Btn() {
		return addNewAddress_Btn;
	}
	
	public WebElement getAddNewAddress_TitleText() {
		return addNewAddress_TitleText;
	}
	
	public WebElement getFirstName_TextBox() {
		return firstName_TextBox;
	}
	
	public WebElement getAddressline1_textField() {
		return addressline1_textField;
	}
	
	
	public WebElement getAddressline2_textField() {
		return addressline2_textField;
	}
	
	public WebElement getMobileNum_textField() {
		return mobileNum_textField;
	}
	
	public WebElement getAlternativeMobileNum_textField() {
		return alternativeMobileNum_textField;
	}
	
	public WebElement getEmailId_textField() {
		return emailId_textField;
	}

	
	public WebElement getAddonOverlay_text() {
		return addonOverlay_text;
	}
	
	public WebElement getProduct_Text() {
		return product_Text;
	}
	
	
	public WebElement getUploaded_Image() {
		return uploaded_Image;
	}
	public WebElement getEditPersonalize_Btn() {
		return editPersonalize_Btn;
	}
	
	
	public WebElement getCroptted_Image() {
		return Croptted_Image;
	}
	
	public WebElement getUploadImagePage_Text() {
		return uploadImagePage_Text;
	}
	
	
	public WebElement getSelect_MyFiles() {
		return select_MyFiles;
	}
	
	public WebElement getPublicUrlOfFile_Text() {
		return publicUrlOfFile_Text;
	}
	
	public WebElement getSelectFrame() {
		return selectFrame;
	}
	
	public WebElement getSelectFrame2() {
		return selectFrame2;
	}
	public WebElement getUploadpage_text() {
		return uploadpage_text;
	}
	
	public WebElement getActualImage_text() {
		return actualImage_text;
	}

	public WebElement getSelectedImage_text() {
		return selectedImage_text;
	}

	
	 public WebElement getPhotoGifts_button() {
			return photoGifts_button;
		}
	 
	 public WebElement getPincodeError_message() {
			return pincodeError_message;
		}
	 

		public WebElement getPhotoCanvas_linktext() {
			return PhotoCanvas_linktext;
		}

	public WebElement getPhotoframe_image() {
		return photoframe_image;
	}

	public WebElement getPersonalize_link() {
		return Personalize_link;
	}

	public WebElement getCountry_TextField() {
		return country_TextField;
	}

	public WebElement getPincode_TextField() {
		return Pincode_TextField;
	}

	
	public WebElement getCheck_button() {
		return check_button;
	}
	

	public WebElement getAvailable_button() {
		return available_button;
	}
	
	public WebElement getError_button() {
		return error_button;
	}


	public WebElement getStandardDelivery() {
		return standardDelivery;
	}


	public WebElement getSelectDate_dropdown() {
		return selectDate_dropdown;
	}


	public WebElement getCalenderNext_button() {
		return calenderNext_button;
	}

	public WebElement getSelect_calenderDate() {
		return Select_calenderDate;
	}

	public WebElement getSelectedDateOnFiled() {
		return SelectedDateOnField;
	}

	public WebElement getPersonalizeNow_button() {
		return personalizeNow_button;
	}


	public WebElement getSelectedDesign_image() {
		return selectedDesign_image;
	}


	public WebElement getContinue_button() {
		return continue_button;
	}

	public WebElement getUploadImage_button() {
		return uploadImage_button;
	}


	public WebElement getSelect_webBrowserTab() {
		return select_webBrowserTab;
	}

	public WebElement getSearch_Field() {
		return Search_Field;
	}

	public WebElement getSearchBox_arrowButton() {
		return SearchBox_arrowButton;
	}

	public WebElement getCrop_uploadImageBtn() {
		return Crop_uploadImageBtn;
	}


	public WebElement getImage_1_Text() {
		return image_1_Text;
	}


	public WebElement getEdit_Btn() {
		return Edit_Btn;
	}


	public WebElement getSaveAndReview_Btn() {
		return saveAndReview_Btn;
	}

	public WebElement getAddToCart_Btn() {
		return addToCart_Btn;
	}

	public WebElement getAddon_image() {
		return addon_image;
	}


	public WebElement getContinueWithAddonsNum_button() {
		return continueWithAddonsNum_button;
	}


	public WebElement getContinueWithoutAddonsNum_button() {
		return continueWithoutAddonsNum_button;
	}

	public WebElement getSelectedProduct() {
		return SelectedProduct;
	}

	public void click(){
		Personalize_link.click();

	}
}

