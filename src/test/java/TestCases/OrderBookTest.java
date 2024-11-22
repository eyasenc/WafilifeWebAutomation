package TestCases;

import Pages.ClickOrderPage;
import Utilities.DriverSetup;
import org.testng.annotations.Test;

public class OrderBookTest extends DriverSetup {
    ClickOrderPage clickOrderPage = new ClickOrderPage();

    @Test
    public void testOrderBook() throws InterruptedException {
        getDriver().get(clickOrderPage.orderUrl);
        clickOrderPage.clickOnElement(clickOrderPage.orderButton);
        Thread.sleep(3000);
    }
}
