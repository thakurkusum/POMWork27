package WebTest;

import org.openqa.selenium.By;

public class JewelryPage extends Utils {
    By selectproduct =By.linkText("Jewelry");
    By changecurrency =By.xpath("//select[@name=\"customerCurrency\"] / option[2]");

    public void user_changes_TheCurrencySymbol_toEuros(){
        // Click on Jewellery Category
        click_element(selectproduct);
        // user change the currency to Euros
        click_element(changecurrency);


    }















   /* public void homepage(){

        // Click on Computers
        click_element(By.linkText("Computers"));
        // Click on Desktops
        click_element(By.linkText("Desktops"));
        // Sort by price  high to low
        click_element(By.xpath("// select [@id=\"products-orderby\"] / option[5]"));

    }*/
}
