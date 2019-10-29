package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindelementTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //once we oppenned the page we have to capture a title
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedTitle = driver.getTitle();
        System.out.println(expectedTitle);
        //Step1: Open inspector in chrome and find locator for the element
        //Step2: create object of webElement
        //Step3: Use WebElement
        WebElement  button = driver.findElement(By.id("form_submit"));
        //to click
        button.click();
        //read title again,after click
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected Title is: "+ expectedTitle);
            System.out.println("Actual Title is: "+actualTitle);
        }
        BrowserUtils.wait(2);
        driver.close();
    }
}
