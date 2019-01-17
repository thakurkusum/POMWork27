package WebTest;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationPage extends Utils {
    LoadProp loadprop = new LoadProp();

    By register =By.linkText("Register");
    By selectgender=By.xpath("//input[@id=\"gender-female\"]");
    By firstname =By.name("FirstName");
    By lastname =By.id("LastName");
    By dateofbirth=By.xpath("//select[@name=\"DateOfBirthDay\"]");
    By dateofmonth=By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    By dateofyear=By.xpath("//select[@name=\"DateOfBirthYear\"]");
    By email =By.name("Email");
    By companyname =By.id("Company");
    By newsletter =By.id("Newsletter");
    By password =By.name("Password");
    By confirmpassword =By.name("ConfirmPassword");
    By registersubmitbutton =By.xpath("//input[@value=\"Register\"]");


    public void Registration() {  //User should registered successfully
        //click on register
        click_element(register);
     //   driver.findElement(By.linkText("Register")).click();
        //select gender
        click_element(selectgender);
     //   driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();  //select gender
        //enter first name
        enter_text(firstname,loadprop.getProperty("firstName"));

      //  driver.findElement(By.name("FirstName")).sendKeys("lotus");  // first name
        //enter last name
        enter_text(lastname,loadprop.getProperty("lastName"));
     //   driver.findElement(By.id("LastName")).sendKeys("rana");  //last name
        //enter date of birth
        enter_text(dateofbirth,loadprop.getProperty("25"));
     //   driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")).sendKeys("25");
        // enter date of month
        enter_text(dateofmonth,loadprop.getProperty("January"));
     //    driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")).sendKeys("January");
        //enter date of year
        enter_text(dateofyear,loadprop.getProperty("1990"));
     //   driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")).sendKeys("1990");
        DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
        Date date = new Date();
        String date1 = dateFormat.format(date);

        //enter email
        enter_text(email,loadprop.getProperty("email"));
        //   driver.findElement(By.name("Email")).sendKeys("lotusrana" + date1 + "12@mail.com");
        // enter company name
        enter_text(companyname,loadprop.getProperty("companyname"));
     //   driver.findElement(By.id("Company")).sendKeys("Inspiring next");
        // click on newsletter
        click_element(newsletter);
     //   driver.findElement(By.id("Newsletter")).click();
        // enter password
        enter_text(password,loadprop.getProperty("password"));
       // driver.findElement(By.name("Password")).sendKeys("refugee");
        // confirm password
        enter_text(confirmpassword,loadprop.getProperty("refugee"));
       // driver.findElement(By.name("ConfirmPassword")).sendKeys("refugee");
        // click on submit button
        click_element(registersubmitbutton);
      //  driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
        String actualresult1 = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Registration completed", "Your registration completed", actualresult1);
         driver.close();
    }


}
