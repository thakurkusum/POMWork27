package WebTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MailToFriend extends Utils {
    LoadProp loadprop = new LoadProp();

    By selectproduct =By.linkText("Jewelry");
    By productname =By.linkText("Flower Girl Bracelet");
    By clickonemailafriend=By.xpath("//input[@value=\"Email a friend\"]");
    By inputfriendsemail =By.xpath("//*[@id=\"FriendEmail\"]");
    By inputownmailaddress =By.xpath("//*[@id=\"YourEmailAddress\"]");
    By personalmessage = By.xpath("//textarea[@id=\"PersonalMessage\"]");
    By clickonsendmail =By.xpath("//input[@name=\"send-email\"]");


    public void MailToFriend() { //unregistred user should not be able to send a mail
        click_element(selectproduct);
        //driver.findElement(By.linkText("Jewelry")).click();
        click_element(productname);
      //  driver.findElement(By.linkText("Flower Girl Bracelet")).click();
        click_element(clickonemailafriend);
      //  driver.findElement(By.xpath("//input[@value=\"Email a friend\"]")).click();
        enter_text(inputfriendsemail,loadprop.getProperty("rajpatel@mail.com"));
        enter_text(inputownmailaddress,loadprop.getProperty("kajpatel@mail.com"));
        enter_text(personalmessage,loadprop.getProperty("hi"));
        click_element(clickonsendmail);
        String expectedresult = "Only registered customers can use email a friend feature";
        String actualresult = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText();
        Assert.assertEquals("comparing result", expectedresult, actualresult);
    }
}
