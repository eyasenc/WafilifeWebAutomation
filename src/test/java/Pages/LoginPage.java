package Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public By email_input_box= By.xpath("//input[@id='username']");
    public By password_input_box= By.xpath("//input[@id='password']");
    public By login_button= By.xpath("//input[@name='login']");

    public void navigateToLoginPage(){
        HomePage homePage= new HomePage();
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.login_register);
    }


}
