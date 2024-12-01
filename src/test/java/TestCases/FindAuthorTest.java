package TestCases;
import Pages.*;
import Utilities.DriverSetup;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class FindAuthorTest extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    CategoryResultPage categoryResultPage = new CategoryResultPage();
    DashBoard dashboard = new DashBoard();
    public WebDriver driver;

    @Test
    public void clickAuthorMenu() {
        dashboard.clickOnElement(dashboard.clickWriterCategory);
        String expectedURL = dashboard.dashUrl;
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL, "URL mismatch! Expected: " + expectedURL + ", but got: " + actualURL);
    }

    @Test
    public void scrollToFooter() throws InterruptedException {
        getDriver().navigate().to(CategoryResultPage.authorUrl);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfElementLocated(categoryResultPage.location));
    }

    @Test
    public void navigateToNextPage() {
        getDriver().navigate().to(CategoryResultPage.authorUrl);
        //driver.get(String.valueOf(categoryResultPage.location));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement nextPageButton = wait.until(ExpectedConditions.elementToBeClickable(categoryResultPage.nextPage));
        categoryResultPage.clickOnElement(categoryResultPage.nextPage);
    }
}
