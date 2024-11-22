package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoryResultPage extends BasePage{
    public static String authorUrl = "https://www.wafilife.com/cat/books/author";
    public By location =  By.xpath("//a[@class='next page-numbers']");
    public By nextPage = By.xpath("//li/a[@class='page-numbers' and contains(@href, '/author/page/2') and text()='2']");
}
