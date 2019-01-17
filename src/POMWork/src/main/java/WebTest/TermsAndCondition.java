package WebTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class TermsAndCondition extends Utils {

    By books=By.linkText("Books");
    By firstpies= By.linkText("First Prize Pies");
    By addtocart=By.xpath("//input[@id=\"add-to-cart-button-38\"]");
    By cartlabel =By.xpath("//span[@class=\"cart-label\"]");
    By checkout =By.xpath("//*[@id=\"checkout\"]");
    By warningbox =By.xpath("//*[@id=\"terms-of-service-warning-box\"]/p");
    By closebutton =By.xpath("//button[@title=\"Close\"]");
    By termsofservice=By.xpath("//input[@id=\"termsofservice\"]");
    By checkut =By.xpath("//*[@id=\"checkout\"]");

    public void TermAndCondition() {  //user should accepet the term and condition
       // driver.findElement(By.linkText("Books")).click();
        click_element(books); // click on books
        click_element(firstpies); //click on first prize
       // driver.findElement(By.linkText("First Prize Pies")).click();
        click_element(addtocart);//click on add to cart button
       // driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-38\"]")).click();
        click_element(cartlabel);
       // driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
        click_element(checkout);//CLICK ON CHECKOUT
       // driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        click_element(warningbox);
       // driver.findElement(By.xpath("//*[@id=\"terms-of-service-warning-box\"]/p")).click();
        click_element(closebutton);
       // driver.findElement(By.xpath("//button[@title=\"Close\"]")).click();
        click_element(termsofservice);
        //driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
        click_element(checkut);
       // driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        boolean expectedresult = true;
        boolean actualresult = false;
        if (driver.findElement(By.tagName("termsofservice")).isSelected()) {
           // (driver.findElement(By.xpath(//input[@id="termsofservice"])).isSelected()){
            actualresult = true;
        }
      //  Assert.assertEquals("comparing", expectedresult, actualresult);

    }

}
