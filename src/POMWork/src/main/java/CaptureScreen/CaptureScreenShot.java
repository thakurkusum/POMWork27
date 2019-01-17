package CaptureScreen;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;



public class CaptureScreenShot  {
    protected static  WebDriver driver;
    @Test
    public void screenshot()throws Exception{
        System.setProperty("webdriver.chrome.driver", "src\\browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Jewelry")).click();
        driver.findElement(By.linkText("Flower Girl Bracelet")).click();
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("rajpatel@mail.com");
        driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("kajpatel@mail.com");
        driver.findElement(By.xpath("//textarea[@id=\"PersonalMessage\"]")).sendKeys("hi");
        driver.findElement(By.xpath("//input[@name=\"send-email\"]")).click();
        String expectedresult = "Only registered customers can use email a friend feature";
        String actualresult = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText();


        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./Screenshots/ecommerce"));
        System.out.println("screenshot taken");
        driver.quit();
    }
}
