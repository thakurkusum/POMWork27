package POM.Work;

import WebTest.BrowserSelector2;
import WebTest.Utils;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    public static BrowserSelector2 browserSelector = new BrowserSelector2();
    @BeforeMethod
    public void beforemethod() {
    browserSelector.browser();

    }

    @AfterMethod
    public  void aftermethod() throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./Screenshots/ecommerce"));
        System.out.println("screenshot taken");
        driver.quit();
        driver.close();

    }



}