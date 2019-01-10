package WebTest;

import org.openqa.selenium.By;

public class LoginPage extends Utils {

    public void LoginPage () {  // registered user should send a mail successfully

        click_element(By.linkText("Log in"));
        enter_Element(By.xpath("//input[@class=\"email\"]"),"\"lotusrana12@mail.com\"");
        enter_Element(By.xpath("//input[@id=\"Password\"]"),"refugee");
        click_element(By.xpath("//input[@value=\"Log in\"]"));

        //  driver.findElement(By.linkText("Log in")).click();
       // driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("lotusrana12@mail.com");
      //  driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("refugee");
       // driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();

    }
}
