package Mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofWebElement {
    public static void main(String[] args) {
       /* WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(); */
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMIT\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        WebElement abc=driver.findElement(By.xpath("//input[@id='Email']"));
        System.out.println("Display Status: "+abc.isDisplayed());
        System.out.println("Enable Status: "+abc.isEnabled());


        WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Status is: "+male.isSelected());
        System.out.println("Status is: "+female.isSelected());

        male.click();
        System.out.println("Status is: "+male.isSelected());
        System.out.println("Status is: "+female.isSelected());

        female.click();
        System.out.println("Status is: "+male.isSelected());
        System.out.println("Status is: "+female.isSelected());
    }
}

