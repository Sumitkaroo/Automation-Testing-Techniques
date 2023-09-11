package Mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HandleCheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMIT\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
      //  driver.findElement(By.xpath("//input[@id='tuesday']")).click();

        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));

        for(int i=0;i<checkboxes.size();i++)
        {
            checkboxes.get(i).click();
            System.out.println("Selected Days are: "+checkboxes.get(i).getText());
        }

        //select last 2 checkbox

        /*for(int i=checkboxes.size()-2;i<checkboxes.size();i++)
        {
            checkboxes.get(i).click();
        }*/

        //select first 2 checkbox
       /* for(int i=0;i<checkboxes.size()-5;i++)
        {
            checkboxes.get(i).click();
        }*/

    }
}
