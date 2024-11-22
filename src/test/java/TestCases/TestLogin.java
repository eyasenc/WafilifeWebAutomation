package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import Utilities.DriverSetup;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends DriverSetup {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void loadTestPage(){

        loginPage.navigateToLoginPage();
    }
    @Test
    public void testLoginWithValidCredentials(){
        loginPage.writeOnElement(loginPage.email_input_box, "md.eyasenchowdhury@gmail.com");
        loginPage.writeOnElement(loginPage.password_input_box, "bWAnDydk6U6Fp@7");
        loginPage.clickOnElement(loginPage.login_button);
        Assert.assertTrue(homePage.is_element_visible(homePage.logout_button));
        Assert.assertFalse(loginPage.is_element_visible(loginPage.login_button));
    }
}
