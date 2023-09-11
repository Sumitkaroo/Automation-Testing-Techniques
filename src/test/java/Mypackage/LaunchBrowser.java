package Mypackage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        //chrome Browser manually
       /* System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMIT\\Downloads\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(); */

        //chrome driver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println("Title is"+driver.getTitle());


    }

}
