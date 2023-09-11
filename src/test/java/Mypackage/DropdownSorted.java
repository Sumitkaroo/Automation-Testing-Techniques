package Mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DropdownSorted {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.twoplugs.com/");
        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

        WebElement drpElements=driver.findElement(By.xpath("//select[@name='category_id']"));
        Select drpselect=new Select(drpElements);

        List<WebElement> options=drpselect.getOptions();

        ArrayList oglist=new ArrayList();
        ArrayList templist=new ArrayList();

        for(WebElement option:options)
        {
           oglist.add(option.getText());
           templist.add(option.getText());
        }
        System.out.println("OG list: "+oglist);
        System.out.println("Temp List: "+templist);

        Collections.sort(templist);

        System.out.println("Temp List: "+templist);

        if(oglist.equals(templist))
        {
            System.out.println("Sorted");
        }
        else
        {
            System.out.println("Not Sorted");
        }
        driver.close();
    }
}
