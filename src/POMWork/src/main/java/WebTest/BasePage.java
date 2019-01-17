package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage  {

  protected static  WebDriver driver;

  public static void set_chrome_driver() {


    System.setProperty("webdriver.chrome.driver", "src\\browserdriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
    driver.get("https://demo.nopcommerce.com/");
  }



}
