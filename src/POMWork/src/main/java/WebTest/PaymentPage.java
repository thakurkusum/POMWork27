package WebTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PaymentPage extends Utils {
    LoadProp loadprop = new LoadProp();

    By login =By.linkText("Log in");
    By email =By.xpath("//input[@class=\"email\"]");
    By password =By.xpath("//input[@id=\"Password\"]");
    By submitlogin =By.xpath("//input[@value=\"Log in\"]");
    By electronics =By.linkText("Electronics");
    By cellphone =By.linkText("Cell phones");
    By phonemodel =By.partialLinkText("HTC One M8");
    By addtocartbutton =By.xpath("//*[@id=\"add-to-cart-button-18\"]");
    By cartlabel =By.xpath("//span[@class=\"cart-label\"]");
    By clearqty =By.xpath("//input[@class=\"qty-input\"]");
    By inputqty =By.xpath("//input[@class=\"qty-input\"]");
    By updateshoppingcart =By.xpath("//input[@class=\"button-2 update-cart-button\"]");
    By termofservice =By.xpath("//input[@id=\"termsofservice\"]");
    By checkoutbutton =By.xpath("//button[@id=\"checkout\"]");
    By billingbutton =By.xpath("//*[@id=\"billing-buttons-container\"]/input");
    By billingbuttonagain =By.xpath("//div[@id=\"billing-buttons-container\"]");
    By shippingmethod =By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]");
    By paymentmethod =By.xpath("//input[@id=\"paymentmethod_1\"]");
    By paymentmethodnextbutton =By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    By cardholdername =By.xpath("//input[@id=\"CardholderName\"]");
    By cardnumber = By.xpath("//input[@id=\"CardNumber\"]");
    By expirymonth =By.xpath("//select[@id=\"ExpireMonth\"]");
    By expireyear =By.xpath("//select[@id=\"ExpireYear\"]");
    By cardcode =By.xpath("//input[@id=\"CardCode\"]");
    By paymentinfonextstepbutton =By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    By confirm =By.xpath("//input[@value=\"Confirm\"]");

    public void PaymentPage(){
        click_element(login);
        enter_text(email,loadprop.getProperty("lotusrana12@mail.com"));
        enter_text(password,loadprop.getProperty("refugee"));
        click_element(submitlogin);
        click_element(electronics);
        click_element(cellphone);
        click_element(phonemodel);
        click_element(addtocartbutton);
        click_element(cartlabel);
        clear(clearqty);
        enter_text(inputqty,loadprop.getProperty("1"));
        click_element(updateshoppingcart);
        click_element(termofservice);
        click_element(checkoutbutton);
        click_element(billingbutton);
        click_element(billingbuttonagain);
        click_element(shippingmethod);
        click_element(paymentmethod);
        click_element(paymentmethodnextbutton);
        enter_text(cardholdername,loadprop.getProperty("cardholdername"));
        enter_text(cardnumber,loadprop.getProperty("cardnumber"));
        enter_text(expirymonth,loadprop.getProperty("expirymonth"));
        enter_text(expireyear,loadprop.getProperty("2011"));
        enter_text(cardcode,loadprop.getProperty("737"));
        click_element(paymentinfonextstepbutton);
        click_element(confirm);
        // driver.findElement(By.partialLinkText("\"Your order has been successfully processed!\"")).getText();
        String expectedresult ="Your order has been successfully processed!";
       //  String actualresult = driver.findElement(By.xpath("//div[2]/div/div[@class=\"title\"][strong]]")).getText();
        String actualresult = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).getText();
        Assert.assertEquals("comparing", "Your order has been successfully processed!", actualresult);

    }
    }

