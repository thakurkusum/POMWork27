package POM.Work;

import WebTest.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSuits extends BaseTest {
    RegistrationPage reg = new RegistrationPage();
    LoginPage log = new LoginPage();
    ProductPage pp =new ProductPage();
    TermsAndCondition tc =new TermsAndCondition();
    MailToFriend mail =new MailToFriend();
    JewelryPage jp = new JewelryPage();
    PaymentPage pay =new PaymentPage();

    @Test //User should register successfully
    public void verifyusercanregistredsuccessfully(){
    reg.Registration();
        String actualresult1 = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Registration completed", "Your registration completed", actualresult1);
    }

    @Test // User should login successfully
    public void LoginPage() throws IOException {
        log.LoginPage();
    }
    @Test // registered_user_Select_Any_Product_And_Use_Email_a_Friend_Feature
    public void ProductPage(){
    pp.ProductPage();
        String expectedresult = "Your message has been sent.";
        String actualmessage = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        Assert.assertEquals("Comparing result", expectedresult, actualmessage);
    }
    @Test // Accept term and condition
    public void TermsAndCondition(){
        tc.TermAndCondition();
    }
    @Test //unregistred user should not be able to send a mail
    public void MailToFriend(){
        mail.MailToFriend();
    }
    @Test
    public void JewelryPage (){
        jp.user_changes_TheCurrencySymbol_toEuros();
    }
    @Test
    //user should able to buy product
    public void PaymentPage(){
        pay.PaymentPage();
    }


}
