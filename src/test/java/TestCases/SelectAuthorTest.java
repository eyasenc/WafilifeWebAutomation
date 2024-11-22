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

import static java.lang.String.*;

public class SelectAuthorTest extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    CategoryResultPage categoryResultPage = new CategoryResultPage();
    DashBoard dashboard = new DashBoard();
    WebDriver driver;

    @Test
    public void clickAuthorMenu() {
        dashboard.clickOnElement(dashboard.clickWriterCategory);
        String expectedURL = dashboard.dashUrl;
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL, "URL mismatch! Expected: " + expectedURL + ", but got: " + actualURL);
    }

    @Test
    public void scrollToFooter() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(CategoryResultPage.authorUrl);
        System.out.println(driver.getTitle());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Optional: Add an explicit wait if needed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.presenceOfElementLocated(categoryResultPage.location));
        Thread.sleep(2000);
//        WebElement fourthPageLink = wait.until(ExpectedConditions.elementToBeClickable(categoryResultPage.fourthPage));
        categoryResultPage.clickOnElement(categoryResultPage.nextPage);
    }

    @Test
    public void clickAuthorPage4() {
        driver.get(valueOf(categoryResultPage.location));
        // Ensure the fourth page element is visible and clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement fourthPageLink = wait.until(ExpectedConditions.elementToBeClickable(categoryResultPage.fourthPage));

        // Click on the fourth page
        categoryResultPage.clickOnElement(categoryResultPage.fourthPage);
    }
}

//    @Test(priority = 1)
//    public void clickAuthorMenu() {
//        dashboard.clickOnElement(dashboard.clickWriterCategory);
//        String expectedURL = "https://www.wafilife.com/cat/books/author";
//        String actualURL = driver.getCurrentUrl();
//        Assert.assertEquals(expectedURL, actualURL, "URL mismatch! Expected: " + expectedURL + ", but got: " + actualURL);
//    }
//
//    @Test(priority = 2, dependsOnMethods =  "clickAuthorMenu")
//    public void scrollToFooter() throws InterruptedException {
//          driver.get(categoryResultPage.authorUrl);
//        dashboard.clickOnElement(dashboard.clickWriterCategory);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("window.scrollBy(0,500)");
////        Thread.sleep(2000);
////        WebElement location = driver.findElement(By.xpath("//h3[contains(text(),'প্রয়োজনীয় লিংক')]"));
////        js.executeScript("arguments[0].scrollIntoView(true)", location);
////        Thread.sleep(10000);
//        js.executeScript("window.scrollTo(document.body.scrollHeight);");
//        Thread.sleep(1000);
//        js.executeScript("window.scrollTo(0,0)");
//        Thread.sleep(5000);
//
//    }
//    @Test
//    public void clickAuthorPage4() {
//        categoryResultPage.clickOnElement(categoryResultPage.fourthPage);
//    }
//
//
//}
