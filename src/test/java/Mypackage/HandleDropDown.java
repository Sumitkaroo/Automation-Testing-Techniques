package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMIT\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://register.csc.gov.in/register");

      //  driver.findElement(By.xpath("//option[@value='shg']")).click();

        WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='app_type']"));

        Select drpCountry=new Select(drpCountryEle);

        //drpCountry.selectByVisibleText("CSC VLE");
        //drpCountry.selectByValue("shg");
        //drpCountry.selectByIndex(3);
    }
}
