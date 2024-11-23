package TestCases;

import Pages.ClickOrderPage;
import Pages.OrderCompletePage;
import Pages.ViewBookDetails;
import Utilities.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class OrderCompletePageTest extends DriverSetup {
    //ViewBookDetails viewBookDetails = new ViewBookDetails();
    ClickOrderPage clickOrderPage = new ClickOrderPage();
    //OrderCompletePage orderCompletePage = new OrderCompletePage();
    public WebDriver driver;

    @Test
    public void testOrderCompletePage() {
        getDriver().get(clickOrderPage.orderUrl);

        // Click the order `button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement orderButton = wait.until(ExpectedConditions.elementToBeClickable(clickOrderPage.orderButton));
        orderButton.click();

        // Store the main window handle
        String mainWindowHandle = driver.getWindowHandle();

        // Wait for the popup window
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Switch to the popup window
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        WebElement popupButton = getDriver().findElement(By.xpath("//*[@id=\"proceed_to_checkout\"]/a[1]/span"));
        popupButton.click();
        // Perform actions on the popup
//        WebElement orderCompleteButton = wait.until(ExpectedConditions.elementToBeClickable(orderCompletePage.orderCompleteButton));
//        orderCompleteButton.click();

        // Close the popup window
        driver.close();

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
    }
}



