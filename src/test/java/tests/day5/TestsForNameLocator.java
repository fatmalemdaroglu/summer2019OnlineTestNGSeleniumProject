package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class TestsForNameLocator {
    public static void main(String[] args) {
        //remember! for mac users: you don't need to use WebDriverManager for Safari
        //safari has embedded webdriver support
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");
        //if you want to do in one line,without creating webelement reference variable
        //enter full name
        driver.findElement(By.name("full_name")).sendKeys("Test User");
        //enter mail
        driver.findElement(By.name("email")).sendKeys("fatmalemdaroglu@icloud.com");
        //click sign up
        driver.findElement(By.name("wooden_spoon")).click();
        driver.quit();
    }
}
