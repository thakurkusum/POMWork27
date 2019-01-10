package POM.Work;

import WebTest.*;
import org.testng.annotations.Test;

public class TestSuits extends BaseTest {
    RegistrationPage reg = new RegistrationPage();
    LoginPage log = new LoginPage();
    ProductPage pp =new ProductPage();
    TermsAndCondition tc =new TermsAndCondition();
    MailToFriend mail =new MailToFriend();
    HomePage hp = new HomePage();
    PaymentPage pay =new PaymentPage();

    @Test //User should register successfully
    public void Registration(){
    reg.Registration();
    }

    @Test // User should login successfully
    public void LoginPage(){
        log.LoginPage();
    }
    @Test // registered user should send a mail to friend
    public void ProductPage(){
    pp.ProductPage();
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
    public void HomePage (){
        hp.homepage();
    }
    @Test
    public void PaymentPage(){
        pay.PaymentPage();
    }


}
