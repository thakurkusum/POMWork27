package WebTest;

import org.openqa.selenium.By;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationPage extends Utils {

    public void Registration() {  //User should rgisterd successfully
        driver.findElement(By.linkText("Register")).click();  //click on register
        driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();  //select gender
        driver.findElement(By.name("FirstName")).sendKeys("lotus");  // first name
        driver.findElement(By.id("LastName")).sendKeys("rana");  //last name
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")).sendKeys("25");
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")).sendKeys("January");
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")).sendKeys("1990");
        DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        driver.findElement(By.name("Email")).sendKeys("lotusrana" + date1 + "12@mail.com");
        driver.findElement(By.id("Company")).sendKeys("Inspiring next");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.name("Password")).sendKeys("refugee");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("refugee");
        driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
        String actualresult1 = driver.findElement(By.xpath("//div[@class='result']")).getText();
      //  Assert.assertEquals("Registration completed", "Your registration completed", actualresult1);
        // driver.close();
    }


}
