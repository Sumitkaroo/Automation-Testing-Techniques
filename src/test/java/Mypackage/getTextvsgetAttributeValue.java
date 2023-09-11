package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextvsgetAttributeValue {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMIT\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        /*WebElement a=driver.findElement(By.xpath("//input[@id='Email']"));
        a.clear();
        a.sendKeys("abc");*/

        System.out.println("Result is "+driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value"));

    }
}

