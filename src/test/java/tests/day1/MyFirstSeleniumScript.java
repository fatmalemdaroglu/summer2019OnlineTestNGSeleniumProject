package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumScript {
    public static void main(String[] args) {
        //We have to set webdriver based on the browser that we gonna use
        //old way of configuring webdriver
        //System.setProperty("webdriver.chrome.driver","/path/chromedriver");
        //better way to setup webdriver because any platform any version is available in one line of code
        WebDriverManager.chromedriver().setup();
        //We need to create an abject of appropriate class
        ChromeDriver driver = new ChromeDriver();
        // let's open google.com
        //.get() method allows to open some website
        driver.get("http://google.com");
        //to read page title, there is method .getTitle()
        //Test 1. Verify that title of the page is "Google"
        String actualResult = driver.getTitle();
        String expectedResult ="Google";
        if(actualResult.equals(expectedResult)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        //to close browser
        //at the end of test execution
        //if we opened a gate- we need to close it.
        driver.close();

    }
}
