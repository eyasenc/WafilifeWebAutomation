package Pages;

import org.openqa.selenium.By;

public class DashBoard extends BasePage{
    public String dashUrl = "https://www.wafilife.com/my-account";
    public By clickWriterCategory = By.xpath("//span[contains(text(),'লেখক')]");
}
