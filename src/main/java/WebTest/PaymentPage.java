package WebTest;

import org.openqa.selenium.By;

public class PaymentPage extends Utils {

    public void PaymentPage(){
        click_element(By.linkText("Log in"));
        driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("lotusrana12@mail.com");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("refugee");
        driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
        driver.findElement(By.linkText("Electronics")).click();
        driver.findElement(By.linkText("Cell phones")).click();
        driver.findElement(By.partialLinkText("HTC One M8")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-18\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"qty-input\"]")).clear();
        driver.findElement(By.xpath("//input[@class=\"qty-input\"]")).sendKeys("1");
        driver.findElement(By.xpath("//input[@class=\"button-2 update-cart-button\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
        driver.findElement(By.xpath("//div[@id=\"billing-buttons-container\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"paymentmethod_1\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"CardholderName\"]")).sendKeys("suresh");
        driver.findElement(By.xpath("//input[@id=\"CardNumber\"]")).sendKeys("4111 1111 1111 1111");
        driver.findElement(By.xpath("//select[@id=\"ExpireMonth\"]")).sendKeys("20");
        driver.findElement(By.xpath("//select[@id=\"ExpireYear\"]")).sendKeys("2011");
        driver.findElement(By.xpath("//input[@id=\"CardCode\"]")).sendKeys("737");
        driver.findElement(By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]")).click();
        driver.findElement(By.xpath("//input[@value=\"Confirm\"]")).click();
        // driver.findElement(By.partialLinkText("\"Your order has been successfully processed!\"")).getText();
        //   String expectedresult ="Your order has been successfully processed!";
        // String actualresult = driver.findElement(By.xpath("//div[2]/div/div[@class=\"title\"][strong]]")).getText();
        String actualresult = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).getText();
      //  Assert.assertEquals("comparing", "Your order has been successfully processed!", actualresult);

    }
    }

