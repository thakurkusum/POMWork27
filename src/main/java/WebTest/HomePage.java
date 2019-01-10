package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    public void homepage(){
        click_element(By.xpath("//select[@id=\"customerCurrency\"]"));
        click_element(By.xpath("//select[@name=\"customerCurrency\"] / option[2]"));
        //clicked on currency
        //driver.findElement(By.xpath("//div[@class=\"currency-selector\"]")).isSelected();
    }
}
