package WebTest;

import org.openqa.selenium.By;

public class TermsAndCondition extends Utils {

    public void TermAndCondition() {  //user should accepet the term and condition
       // driver.findElement(By.linkText("Books")).click();
        click_element(By.linkText("Books")); // click on books
        click_element(By.linkText("First Prize Pies")); //click on first prize
       // driver.findElement(By.linkText("First Prize Pies")).click();
        click_element(By.xpath("//input[@id=\"add-to-cart-button-38\"]"));//click on add to cart button
       // driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-38\"]")).click();
        click_element(By.xpath("//span[@class=\"cart-label\"]"));
       // driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
        click_element(By.xpath("//*[@id=\"checkout\"]"));//CLICK ON CHECKOUT
       // driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        click_element(By.xpath("//*[@id=\"terms-of-service-warning-box\"]/p"));
       // driver.findElement(By.xpath("//*[@id=\"terms-of-service-warning-box\"]/p")).click();
        click_element(By.xpath("//button[@title=\"Close\"]"));
       // driver.findElement(By.xpath("//button[@title=\"Close\"]")).click();
        click_element(By.xpath("//input[@id=\"termsofservice\"]"));
        //driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
        click_element(By.xpath("//*[@id=\"checkout\"]"));
       // driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        boolean expectedresult = true;
        boolean actualresult = false;
        if (driver.findElement(By.tagName("termsofservice")).isSelected()) {
            //(driver.findElement(By.xpath(//input[@id="termsofservice"])).isSelected()){
            actualresult = true;
        }
       // Assert.assertEquals("comparing", expectedresult, actualresult);

    }

}
