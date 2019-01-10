package WebTest;

import org.openqa.selenium.By;

public class ProductPage extends Utils {

    public void ProductPage() {  // registered user should send a mail successfully
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("lotusrana12@mail.com");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("refugee");
        driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
        driver.findElement(By.linkText("Electronics")).click();
        driver.findElement(By.linkText("Cell phones")).click();
        driver.findElement(By.linkText("Nokia Lumia 1020")).click();
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"FriendEmail\"]")).sendKeys("kusum.thakur@outlook.com");
        //driver.findElement(By.xpath("//input[@id=\"YourEmailAddress\"]")).sendKeys("lotusrana12@mail.com");
        driver.findElement(By.xpath("//textarea[@id=\"PersonalMessage\"]")).sendKeys("check out this");
        driver.findElement(By.xpath("//input[@name=\"send-email\"]")).click();
        String expectedresult = "Your message has been sent.";
        String actualmessage = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
       // Assert.assertEquals("Comparing result", expectedresult, actualmessage);
        // driver.findElement(By.xpath("//*[@href=\"/logout\"]")).click();
        //   driver.close();
    }




}
