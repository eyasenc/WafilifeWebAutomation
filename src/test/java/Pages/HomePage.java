package Pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url = "https://www.wafilife.com/";
    public String title = "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife";
    public By login_register = By.xpath("//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'লগইন / রেজিস্টার')]");
    public By logout_button = By.xpath("//a[contains(text(),'লগ অউট করুন')]");
    public By category_author = By.xpath("//span[contains(text(),'লেখক')]");

    public void loadHomePage() {
        loadAWebPage(url);
    }
}
