package POM.Work;

import WebTest.Utils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    @BeforeMethod
    public static void beforemethod() {
        System.setProperty("webdriver.chrome.driver", "src\\browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterMethod
    public static void aftermethod() {
        driver.close();

    }
    public static void captureScreenshot(){
        captureScreenshot();
    }



}