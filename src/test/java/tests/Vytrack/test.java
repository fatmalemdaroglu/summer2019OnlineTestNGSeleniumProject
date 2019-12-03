package tests.Vytrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class test {
    public static void main(String[] args) {
        //to create an object by using BrowserFactory class
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //to get login page of VyTrack app
        driver.get("https://qa2.vytrack.com/user/login");
        //to find username box
        WebElement userName = driver.findElement(By.name("_username"));
        //to enter username
        userName.sendKeys("storemanager207");
        //to find password box
        WebElement password = driver.findElement(By.name("_password"));
        //to enter password
        password.sendKeys("UserUser123");
        //to find submit button
        WebElement button = driver.findElement(By.id("_submit"));
        //to click that button
        button.click();
        //to test if the app login
        String expextedURL = "https://qa2.vytrack.com/";
        String actualURL = driver.getCurrentUrl();
        if(expextedURL.equals(actualURL)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        //to close the tab
        driver.close();
    }
}
