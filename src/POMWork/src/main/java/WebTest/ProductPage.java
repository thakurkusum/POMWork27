package WebTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductPage extends Utils {
    LoadProp loadprop = new LoadProp();
    By login =By.linkText("Log in");
    By email =By.xpath("//input[@class=\"email\"]");
    By password =By.xpath("//input[@id=\"Password\"]");
    By submitlogin=By.xpath("//input[@value=\"Log in\"]");
    By electronics =By.linkText("Electronics");
    By cellphone =By.linkText("Cell phones");
    By nokialumia1020=By.linkText("Nokia Lumia 1020");
    By click_on_mail_a_friend =By.xpath("//input[@value=\"Email a friend\"]");
    By input_friends_mail =By.xpath("//input[@id=\"FriendEmail\"]");
    By input_user_mail= By.xpath("//input[@id=\"YourEmailAddress\"]");
    By personal_message =By.xpath("//textarea[@id=\"PersonalMessage\"]");
    By click_on_send_email =By.xpath("//input[@name=\"send-email\"]");



    public void ProductPage() {  // registered user should send a mail successfully
        click_element(login);
       // driver.findElement(By.linkText("Log in")).click();
        enter_text(email,"lotusrana12@mail.com");
       // driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("lotusrana12@mail.com");
        enter_text(password,loadprop.getProperty("refugee"));
       // driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("refugee");
        click_element(submitlogin);
       // driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
        click_element(electronics);
       //driver.findElement(By.linkText("Electronics")).click();
        click_element(cellphone);
      //  driver.findElement(By.linkText("Cell phones")).click();
        click_element(nokialumia1020);
      //  driver.findElement(By.linkText("Nokia Lumia 1020")).click();
        click_element(click_on_mail_a_friend);
      //  driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        enter_text(input_friends_mail,loadprop.getProperty("kusum.thakur@outlook.com"));
     //   driver.findElement(By.xpath("//input[@id=\"FriendEmail\"]")).sendKeys("kusum.thakur@outlook.com");
        enter_text(input_user_mail,loadprop.getProperty("lotusrana12@mail.com"));
        //driver.findElement(By.xpath("//input[@id=\"YourEmailAddress\"]")).sendKeys("lotusrana12@mail.com");
        enter_text(personal_message,loadprop.getProperty("check out this"));
     //   driver.findElement(By.xpath("//textarea[@id=\"PersonalMessage\"]")).sendKeys("check out this");
        click_element(click_on_send_email);
       // driver.findElement(By.xpath("//input[@name=\"send-email\"]")).click();
        String expectedresult = "Your message has been sent.";
        String actualmessage = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        Assert.assertEquals("Comparing result", expectedresult, actualmessage);
        // driver.findElement(By.xpath("//*[@href=\"/logout\"]")).click();
        //   driver.close();
    }




}
