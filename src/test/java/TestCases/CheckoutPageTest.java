package TestCases;

import Pages.CheckoutPage;
import Utilities.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckoutPageTest extends DriverSetup {
CheckoutPage checkoutPage = new CheckoutPage();
@Test
public void testCheckoutPage(){
    getDriver().navigate().to(checkoutPage.checkoutUrl);
    checkoutPage.writeOnElement(checkoutPage.nameInputField, "TestName");
    checkoutPage.writeOnElement(checkoutPage.phoneNumberField, "12154646721");
    checkoutPage.writeOnElement(checkoutPage.EmergencyPhoneNumberField, "46575482456");
    checkoutPage.writeOnElement(checkoutPage.emailField, "nnheo@example.com");
    checkoutPage.writeOnElement(checkoutPage.districField, "dhaka");
    checkoutPage.writeOnElement(checkoutPage.areaField, "dhanmondi");
    checkoutPage.writeOnElement(checkoutPage.addressField, "staff quarter, dhanmondi 15");
    checkoutPage.writeOnElement(checkoutPage.otherAddressField, "circle road, dhanmondi");
    checkoutPage.clickOnElement(checkoutPage.agreeTerms);
//  checkoutPage.clickOnElement(checkoutPage.finalOrderButton);
}
}
