package Mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.time.Duration;
import java.util.List;

public class JQueryDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMIT\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

        selectChoiceValues(driver,"choice 1");
       // selectChoiceValues(driver,"all");
       // selectChoiceValues(driver,"choice 1","choice 1 2");
    }
    public static void selectChoiceValues(WebDriver driver,String... value)
    {
        List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

        if (!value[0].equalsIgnoreCase("all")) {
            for (WebElement item : choiceList) {
                String text = item.getText();

                for (String val : value) {
                    if (text.equals(val)) {
                        item.click();
                        break;
                    }
                }
            }
        }
        else {
            for (WebElement item : choiceList) {
                item.click();
            }
        }
    }
}
