package WebTest;

import org.openqa.selenium.By;

public class MailToFriend extends Utils {

    public void MailToFriend() { //unregistred user should not be able to send a mail
        driver.findElement(By.linkText("Jewelry")).click();
        driver.findElement(By.linkText("Flower Girl Bracelet")).click();
        driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("rajpatel@mail.com");
        driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("kajpatel@mail.com");
        driver.findElement(By.xpath("//textarea[@id=\"PersonalMessage\"]")).sendKeys("hi");
        driver.findElement(By.xpath("//input[@name=\"send-email\"]")).click();
        String expectedresult = "Only registered customers can use email a friend feature";
        String actualresult = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText();
      //  Assert.assertEquals("comparing result", expectedresult, actualresult);
    }
}
