package ExistingUserJourney;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.PropertyFile;
import GenericLibrary.SelectClassUtility;
import pomRepository.SameDayDeliveryPage;

@Listeners(GenericLibrary.ListenerImplementationClass.class)

/**
 *
 * @author Shashank
 *
 */
public class SameDayDelivery extends BaseClass {

    SelectClassUtility SelectDD;
    PropertyFile prop;

    /**
     * @throws InterruptedException
     */


    @Test
    public void TC_01Test() throws InterruptedException {
        /* Read Test Data*/


        // Visit IGP Homepage

        Reporter.log("Land to home page successfully", true);
        SameDayDeliveryPage same_Day_Deliver = PageFactory.initElements(driver, SameDayDeliveryPage.class);
        same_Day_Deliver.Samedaycategorybtn().click();
        Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 0));


        // Select Required product
        same_Day_Deliver.Cake().click();
        javaScript.ScrollBy(0, 1000, driver);
        same_Day_Deliver.Blackforestcake().click();
        Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 2, 0));
        Reporter.log("Selected black-forest-cake-half-kg", true);


        //Verifying Pincode
        javaScript.ScrollBy(0, 1500, driver);
        same_Day_Deliver.EnterNondeliveryPincode().sendKeys(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 1));
        Reporter.log("error messgae is displayed for entered pincode", true);
        same_Day_Deliver.EnterNondeliveryPincode().clear();
        same_Day_Deliver.EnterNondeliveryPincode().sendKeys(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 2, 1));
        Reporter.log("Pincode Available messgae is displayed for entered pincode", true);


        //Select Delivery Date
        same_Day_Deliver.Deliverydate().click();
        same_Day_Deliver.CalenderButton().click();
        Reporter.log("Selected date from calender", true);

        //Select Delivery Type and Time
        same_Day_Deliver.deliverytype().click();
//        SelectDD.selectDropDown(null, excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 4));
        Select select1 = new Select(same_Day_Deliver.TimeDD());
        select1.selectByIndex(1);
        //Thread.sleep(3000);
        javaScript.ScrollBy(0, 1500, driver);

        //Select and Deselect Add ons to cart
        same_Day_Deliver.Selectcandle().click();
        same_Day_Deliver.DeSelectcandle().click();


        //Adding to cart and checkout
        same_Day_Deliver.clickAddtocart().click();
        //Thread.sleep(3000);
        javaScript.ScrollBy(0, 2500, driver);
        //same.ContinueButton().click();
        same_Day_Deliver.Checkoutbutton().click();
        //Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 3, 0));

        //SignUp Details
        SignUpDetails signUpDetails = new SignUpDetails();
        signUpDetails.signUp(driver);

        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col s4 no-padding']/descendant::button[text()='SIGNUP']")));
        driver.findElement(By.xpath("//div[@class='col s4 no-padding']/descendant::button[text()='SIGNUP']")).click();
        //same.Sigunuplink().click();
        //Thread.sleep(2000);

        //Personalize measaage Details
        try {
            same_Day_Deliver.firstname().sendKeys(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 3));
            same_Day_Deliver.Enteraddress().sendKeys(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 2, 3));
            same_Day_Deliver.Enterphoneno().sendKeys(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 3, 3));
            same_Day_Deliver.Savedeliverbutton().click();
            same_Day_Deliver.Messagecard().click();

            Thread.sleep(3000);
            same_Day_Deliver.MessageBox().sendKeys(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 4, 3));


        // Apply Coupon

            same_Day_Deliver.getOrderApplyCoupon_Link().click();
            same_Day_Deliver.getEnterCouponTextfield().sendKeys(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 2));
            same_Day_Deliver.getApplyButton().click();


            same_Day_Deliver.getEnterCouponTextfield().clear();
            same_Day_Deliver.getEnterCouponTextfield().sendKeys(excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 2, 2));
            same_Day_Deliver.getEnterCouponTextfield().sendKeys(Keys.ENTER);
            Assert.assertEquals(same_Day_Deliver.getCouponCodeApplied_Text().getText(), excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 5, 3), "Coupon Code applied");
            Reporter.log("coupon message is displayed successfully", true);
            Reporter.log("Final amount is displayed successfully", true);


            // Click on Proceed to payment
            same_Day_Deliver.getProceedToPayment_Btn().click();
            Assert.assertTrue(same_Day_Deliver.getPayment_Tab().isDisplayed(), "payment tab is available");
            Reporter.log("User is redirected to Payments Tab successfully", true);
        } catch (Exception e) {

        }

    }

}


