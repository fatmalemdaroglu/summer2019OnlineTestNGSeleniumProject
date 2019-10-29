package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //to maximize browser
        driver.get("http://google.com");
        driver.manage().window().maximize();
        //we want to navigate, to the different page
        //within same browser
        //we are gonna open new browser or new tab
        //URL can be passed as an object
        //or as a string
        //we use string
        driver.navigate().to("http://amazon.com");
        //if i want to comeback to the previous page
        driver.navigate().back();
        //if i want to know Url of current site
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //selenium can not close browser automatically
        //for this we use method close()
        driver.quit();


    }
}
