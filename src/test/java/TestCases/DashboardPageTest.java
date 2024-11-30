package TestCases;

import Pages.BasePage;
import Pages.DashBoard;
import Utilities.DriverSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPageTest extends DriverSetup {
    DashBoard dashboardPage =new DashBoard();
    BasePage basePage = new BasePage();
    @Test
    public void testDashboardPage() {
        getDriver().navigate().to(dashboardPage.dashUrl);
        dashboardPage.clickOnElement(dashboardPage.clickWriterCategory);
//        dashboardPage.takeScreenshot(dashboardPage);

    }
}
