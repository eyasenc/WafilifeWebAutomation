package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoryResultPage extends BasePage{
    public static String authorUrl = "https://www.wafilife.com/cat/books/author";
    public By fourthPage = By.xpath("//a[contains(text(),'4')]");
    public By location =  By.xpath("//a[@class='next page-numbers']");
    public By nextPage = By.xpath("//a[@class='next page-numbers']");
}
