package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class DriverSetup {private static String browserName = System.getProperty("browser", "Chrome");
    private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<>();
    public static void setDriver(WebDriver driver){
        DriverSetup.LOCAL_DRIVER.set(driver);
    }

    public static WebDriver getDriver(){
        return DriverSetup.LOCAL_DRIVER.get();
    }

    public WebDriver getBrowser(String browser_name){
        if(browser_name.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if (browser_name.equalsIgnoreCase("firefox"))
            return new FirefoxDriver();
        else if(browser_name.equalsIgnoreCase("edge"))
            return new EdgeDriver();
        else{
            throw new RuntimeException("Browser is not available with the name:" + browser_name);
        }
    }
    @BeforeMethod
    public void openABrowser(){
        WebDriver driver = getBrowser(browserName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        setDriver(driver);
    }
    @AfterMethod
    public void closeBrowser(){
        getDriver().quit();
    }
}
