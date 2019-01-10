package WebTest;

import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utils extends BasePage {



        public static void click_element(By by){
            driver.findElement(by).click();

        }
        public static void enter_Element(By by,String text)
        {
            driver.findElement(by).sendKeys(text);
        }
        public static void get_text(By by){
            driver.findElement(by).getText();
        }

        public static void explicity_wait(By by){
            driver.manage().timeouts();
        }
        public static void simpleDateFormat(){
            DateFormat dateFormat=new SimpleDateFormat("MMddyyyyHHmmss");
            Date date=new Date();
            String date1=dateFormat.format(date);
        }
        public static void implicitlyWait(){
            driver.manage().timeouts();
        }
        public static void fullscreen(){
            driver.manage().window();
        }

        public static void clear(By by)
        {driver.findElement(by).clear();}

        public static void is_selected(By by){
            driver.findElement(by).isSelected();
        }

        public static void get_attribute(By by){
            driver.findElement(by).getAttribute("text");
               }
        public static void getCurrentUrl(){
            driver.getCurrentUrl();
                }
        public static void wait_for_element(){

        }


        }





