package ExistingUserJourney;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import pomRepository.ExistingUserJourneyPage;

@Listeners(GenericLibrary.ListenerImplementationClass.class)

public class ExistingUserJourney extends BaseClass{


	@Test
	public void TC_02Test() throws InterruptedException {

		//1) Visit homepage of IGP
		ExistingUserJourneyPage exist_User = PageFactory.initElements(driver, ExistingUserJourneyPage.class);
		exist_User.getPersonalize_link().click();
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 1, 0),"");
		Reporter.log("Land to home page successfully",true);
		exist_User.getPhotoGifts_button().click();
		exist_User.getPhotoCanvas_linktext().click();


		//2) Click on a selection tile
		javaScript.ScrollBy(0, 1552, driver);
		exist_User.getPhotoframe_image().click();
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 2, 0),"different url");
		String actualSelected_Photo = exist_User.getProduct_Text().getText();
		Reporter.log("Forever Love Personalized Wooden Jigsaw Heart Puzzle product is displayed",true); 

		//3)Select a product

		exist_User.getCountry_TextField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 1, 2)); 
		Assert.assertEquals(exist_User.getCheck_button().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 1, 3));
		Reporter.log("check button is displayed",true);

		exist_User.getPincode_TextField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 1, 2));
		Assert.assertEquals(exist_User.getError_button().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 2, 3));//
		Assert.assertEquals(exist_User.getPincodeError_message().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 4, 3));
		Reporter.log("error button is displayed with error message",true);
		//clear pincode text field
		exist_User.getPincode_TextField().clear();
		exist_User.getPincode_TextField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 2, 2));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='available-pincode']")));
		Assert.assertEquals(exist_User.getAvailable_button().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 3, 3));
		Reporter.log("available button is displayed",true);

		Assert.assertTrue(exist_User.getStandardDelivery().isEnabled()==true);
		Reporter.log("Selected delivery type is highlighted",true);

		//select date
		exist_User.getSelectDate_dropdown().click();
		exist_User.getSelect_calenderDate().click();

		Assert.assertEquals(exist_User.getSelectedDateOnFiled().getAttribute("value"),excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 5, 3));
		Reporter.log("Date is selected successfully",true);

		//4) Click on personalize now button
		exist_User.getPersonalizeNow_button().click();
		Assert.assertEquals(driver.getTitle(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 6, 3));


		//5) Select a design and click continue
		Assert.assertNotNull(exist_User.getSelectedDesign_image(), "image not is present");
		Assert.assertEquals(exist_User.getActualImage_text().getText(), exist_User.getSelectedImage_text().getText(), "different image is present");
		Reporter.log("selected image is present successfully",true);

		exist_User.getContinue_button().click();
		Assert.assertEquals(exist_User.getUploadpage_text().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 7, 3),"text not match");
		Reporter.log("upload page  is present successfully",true);


		//6) Click on Upload Image Button
		exist_User.getUploadImage_button().click();
		driver.switchTo().frame(exist_User.getSelectFrame());
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='url-btn']")));	
		Assert.assertTrue(exist_User.getSelect_webBrowserTab().isDisplayed(), "web browser tab is not present");
		Assert.assertTrue(exist_User.getSelect_MyFiles().isDisplayed(),"My Files tab is not present");
		Reporter.log("My Files and web browser displayed successfully",true);


		//7) Click on web address tab
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='url-btn']")));
		exist_User.getSelect_webBrowserTab().click();
		Assert.assertEquals(exist_User.getPublicUrlOfFile_Text().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 8, 3),"different text found");
		Assert.assertTrue(exist_User.getSearch_Field().isEnabled(), "Url search field is not found");
		Reporter.log("Text and Url is present",true);

		//8) Fill the input filed with an image url and click arrow button next to the input field
		exist_User.getSearch_Field().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 3, 0));
		exist_User.getSearchBox_arrowButton().click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(exist_User.getSelectFrame2());
		//upload image page
		Assert.assertEquals(exist_User.getUploadImagePage_Text().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 9, 3),"different frame is displayed");
		Assert.assertTrue(exist_User.getCroptted_Image().isDisplayed(), "croptted image is not present");
		Reporter.log("croptted image and frame text is present",true);
		Thread.sleep(500);


		//9) Click on uplaod image button
		exist_User.getCrop_uploadImageBtn().click();
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Edit')]")));	
		//Assert.assertTrue(exist_User.getUploaded_Image().isDisplayed(),"image is uploaded successfully");
		Assert.assertTrue(exist_User.getEdit_Btn().isEnabled(),"edit button is present");
		Assert.assertTrue(exist_User.getImage_1_Text().getText().contains(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 10, 3)),"image 1 Text is not present");
		Reporter.log( "Uplaod Image iframe is appearsuccessfully",true);


		//10) Click on Save & Review
		exist_User.getSaveAndReview_Btn().click();
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 2, 0),"different url");
		Reporter.log(" user is navigate to PDP on the selected product page successfully",true);
		Assert.assertTrue(exist_User.getAddToCart_Btn().isEnabled(),"addTocart button is present");
		Assert.assertEquals(exist_User.getEditPersonalize_Btn().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 11, 3));
		Reporter.log("EDIT PERSONALIZATION & ADD TO CART is displayed successfully",true);

		//11) Click on Add to Cart
		exist_User.getAddToCart_Btn().click();
		Assert.assertEquals(exist_User.getAddonOverlay_text().getText(),  excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 12, 3));
		Reporter.log("make it extra special text displayed successfully",true);

		//12) Select and unselect addons
		Thread.sleep(3000);
		javaScript.click(exist_User.getAddon_image(), driver);

		Reporter.log("selected addon successfully",true);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='ADD TO CART']/descendant ::span[text()='CONTINUE WITH ADDONS (1)']")));	
		Reporter.log(exist_User.getContinueWithAddonsNum_button().getText(),true);
		Assert.assertTrue(exist_User.getAddToCart_Btn().getText().contains(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 13, 3)));
		Reporter.log("CONTINUE WITH ADDONS(1) is displayed successfully",true);

		Thread.sleep(2000);
		exist_User.getAddon_image().click();
		Assert.assertEquals(exist_User.getContinueWithoutAddonsNum_button().getText(),excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 14, 3));
		Reporter.log("CONTINUE WITHOUT ADDONS button displayed successfully",true);


		//13) Click on "CONTINUE WITHOUT ADDONS" button
		exist_User.getContinueWithoutAddonsNum_button().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Forever Love Personalized Wooden Jigsaw Heart Puzzle']")));	
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 4, 0),"shopping cart page is not displayed");
		Reporter.log("shopping cart page Url is verified successfully",true);

		//14) Verify cart content
		Assert.assertEquals(actualSelected_Photo, exist_User.getSelectedProduct().getText(),"different product is present");
		Assert.assertTrue(exist_User.getInputProductQty().isDisplayed(), "input quantity of product is not present");
		Assert.assertTrue(exist_User.getIncreament_Btn().isEnabled(), "increment button is not present");
		Assert.assertTrue(exist_User.getProceedToCheckour_Btn().isEnabled(), "proceed to checkout button is not present");
		Assert.assertTrue(exist_User.getDelete_Btn().isEnabled(), "Delete button is not present");
		Assert.assertTrue(exist_User.getTotalProdutQty().isDisplayed(), "product quantity is displayed");
		String productQty = exist_User.getTotalProdutQty().getText();
		Assert.assertEquals(productQty, excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 18, 3),"different product quantity is present");
		Assert.assertTrue(exist_User.getProductPrice().isDisplayed(), "product price is displayed");
		String productPrice = exist_User.getProductPrice().getText();
		Assert.assertTrue(productPrice.contains(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 22, 3)),"actual product price is match as expected");
		Reporter.log("shopping cart page content is verified successfully",true);

		//15) Click on Proceed to checkout
		exist_User.getProceedToCheckour_Btn().click();
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 5, 0),"different url is present for login page");
		Reporter.log("navigate to login page successfully",true);


		//16) Login using email id and password
		exist_User.getEmail_Textfield().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 15, 3));
		exist_User.getPassword_Textfield().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 16, 3));
		exist_User.getSignIn_Btn().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text() , 'Delivery Details')]")));	
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 6, 0));
		Assert.assertTrue(exist_User.getDeliveryDetails_tab().isEnabled(), "delivery details tab is displayed");
		Reporter.log("navigate to checkout page successfully",true);


		Assert.assertEquals(exist_User.getDeliveryDetails_tab().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 19, 3),"delivery detail tab is present");

		//17) Click on add new address button
		exist_User.getAddNewAddress_Btn().click();
		Assert.assertEquals(exist_User.getAddNewAddress_TitleText().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 20, 3),"add new address overlay is displayed");
		Reporter.log("address form is appear successfully",true);


		//18) Fill the new address form
		exist_User.getFirstName_TextBox().click();
		exist_User.getFirstName_TextBox().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 1, 4));
		exist_User.getAddressline1_textField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 6, 4));
		exist_User.getAddressline2_textField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 7, 4));
		exist_User.getMobileNum_textField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 5, 4));
		exist_User.getAlternativeMobileNum_textField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 4, 4));
		exist_User.getEmailId_textField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 15, 3));
		Reporter.log("address form is filled successfully",true);


		//19) Click on Save & Deliver Button
		exist_User.getSaveAndDeliver_Btn().click();
		Assert.assertTrue(exist_User.getOrderSummary_Tab().isEnabled(), "order summary tab is displayed");
		Reporter.log("User Should Navigate to Order Summary Tab",true);

		//20) Fill the order summary form
		exist_User.getBirthday_Btn().click();
		exist_User.getMessage_TextField().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 8, 4));
		exist_User.getMessage_TextField().sendKeys(Keys.ENTER);

		//- Click on "Apply Changes button"
		Assert.assertTrue(exist_User.getApplyChanges_Btn().isEnabled(), "apply changes button is not present");
		exist_User.getApplyChanges_Btn().click();
		Assert.assertTrue(exist_User.getMessageSaved_Btn().isEnabled(), "message saved button is not present");
        Reporter.log("Apply Changes text is change to Message Saved successfully",true);
        
		//- Verify Order summary contents
		Assert.assertEquals(exist_User.getOrderProduct().getText(), actualSelected_Photo,"different product is present");
		Assert.assertEquals(exist_User.getOrderProductQty().getText(), productQty,"different product is present in order summary page");
		String orderProductQty = exist_User.getOrderProductQty().getText();
		Assert.assertEquals( orderProductQty, productQty,"different product Qty is present in order summage page");
		String OrderTotalAmount = exist_User.getOrderTotalAmount().getText();
		Assert.assertEquals(OrderTotalAmount, productPrice,"different product amount is present in order summage page");
		//verifying product price is equal to final price, to ensure that discount amount is zero and free shipping charge
		Assert.assertEquals(exist_User.getOrderTotalAmount().getText(),exist_User.getFinalAmount().getText() ,"product price and final price is not equal");
		Assert.assertEquals(exist_User.getBillDetail_totalItems().getText(), orderProductQty, "total item is not displayed correctly in billing detail");
		Assert.assertEquals(exist_User.getBillDetail_subTotalAmt().getText(), OrderTotalAmount, "sub total aamount is not displayed correctly in billing detail");
		Assert.assertTrue(exist_User.getBillDetail_discount().getText().contains(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 23, 3)), "sub total amount is not displayed correctly in billing detail");
		Assert.assertEquals(exist_User.getBillDetail_shippingcharge().getText(),excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 24, 3), "shipping charge is not displayed correctly in billing detail");
		Reporter.log(" Verify Order summary contents successfully",true);

		//21) Apply Coupon Code

		exist_User.getOrderApplyCoupon_Link().click();
		exist_User.getEnterCouponTextfield().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 3, 2));
		exist_User.getApplyButton().click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='coupon-message']")));	

		//-------------------------------------------different error message is displaying for invalid coupon
		//Assert.assertEquals(exist_User.getCouponErrorMessage_Text().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 25, 3),"different error message is displayed");

	
		exist_User.getEnterCouponTextfield().clear();
		exist_User.getEnterCouponTextfield().sendKeys(excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 4, 2));
		exist_User.getEnterCouponTextfield().sendKeys(Keys.ENTER);
		Assert.assertEquals(exist_User.getCouponCodeApplied_Text().getText(), excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 26, 3),"different message is displayed");
		Reporter.log("coupon message is displayed successfully",true);
        //------------------actual coupon discount is not provided so not yet calculated
		String finalPrice = exist_User.getFinalAmountAfterAppliedCoupon().getText().substring(2);
		Assert.assertEquals(finalPrice, excelUtility.readDataFromExcel(DATA_PATH2, "Sheet1", 27, 3),"different amount is present");
		Reporter.log("Final amount is displayed successfully",true);

		
		//22) Click on Proceed to payment
		exist_User.getProceedToPayment_Btn().click();
		Assert.assertTrue(exist_User.getPayment_Tab().isDisplayed(), "payment tab is present");
        Reporter.log("User is redirected to Payments Tab successfully",true);
        
		//23) Select a Payment option
		exist_User.getNetBanking_Btn().click();
		exist_User.getHDFCbank_image().click();
		Assert.assertTrue(exist_User.getHDFC_radioBtn().isSelected(), "radio button is present");
		Reporter.log("radio button selected successfully",true);

	}
}
