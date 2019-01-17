package WebTest;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginPage extends Utils {
    LoadProp loadprop = new LoadProp();

    By login =By.linkText("Log in");
    By inputemail =By.xpath("//input[@class=\"email\"]");
    By inputpassword =By.xpath("//input[@id=\"Password\"]");
    By click_on_login_button =By.xpath("//input[@value=\"Log in\"]");

    public void LoginPage () throws IOException {  // registered user should send a mail successfully

        click_element(login);
        enter_text(inputemail,loadprop.getProperty("lotusrana12@mail.com"));
        enter_text(inputpassword,loadprop.getProperty("refugee"));
        click_element(click_on_login_button);

        //  driver.findElement(By.linkText("Log in")).click();
       // driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("lotusrana12@mail.com");
      //  driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("refugee");
       // driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./Screenshots/ecommerce"));
        System.out.println("screenshot taken");
        driver.close();
    }
}
