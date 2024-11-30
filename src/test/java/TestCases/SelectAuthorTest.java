package TestCases;

import Pages.SelectAuthor;
import Utilities.DriverSetup;
import org.testng.annotations.Test;

public class SelectAuthorTest extends DriverSetup {
    SelectAuthor selectAuthor = new SelectAuthor();

@Test
public void viewAuthor(){
    getDriver().navigate().to(selectAuthor.authorUrl);
            //get(selectAuthor.authorUrl);
    selectAuthor.clickOnElement(selectAuthor.clickAuthor);


}}
