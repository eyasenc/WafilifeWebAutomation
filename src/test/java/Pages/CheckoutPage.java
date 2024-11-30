package Pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{
    public String checkoutUrl = "https://www.wafilife.com/checkout";
    public By nameInputField = By.xpath("//input[@id='billing_first_name']");
    public By phoneNumberField = By.xpath("//input[@id='billing_phone']");
    public By EmergencyPhoneNumberField = By.xpath("//input[@id='billing_alternative_phone']");
    public By emailField = By.xpath("//input[@id='billing_email']");
    public By districField = By.xpath("//span[@id='select2-billing_state-container']");
    public By areaField = By.xpath("//select[@id='billing_area']");
    public By addressField = By.xpath("//textarea[@id='billing_address_1']");
    public By otherAddressField = By.xpath("//textarea[@id='order_comments']");
    public By bkashPayment = By.xpath("//input[@id='payment_method_bkash']");
    public By agreeTerms = By.xpath("//input[@id='terms']");
    public By finalOrderButton = By.xpath("//button[@id='place_order']");



}
