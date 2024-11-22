package TestCases;

import Pages.ViewBookDetails;
import Utilities.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ViewBookDetailsTest extends DriverSetup {
    ViewBookDetails viewBook = new ViewBookDetails();
    
    @Test
    public void viewBookDescription() {
        getDriver().get(viewBook.viewBookUrl);
        viewBook.clickOnElement(viewBook.ViewBookThumbnail);
}
}