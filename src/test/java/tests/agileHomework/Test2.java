package tests.agileHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class Test2 {
    public static void main(String[] args) {
        //to create an object by using BrowserFactory class
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //to get login page of VyTrack app
        driver.get("https://qa2.vytrack.com/user/login");
        //to find username box
        WebElement userName = driver.findElement(By.name("_username"));
        //to enter username
        userName.sendKeys("storeman207");
        BrowserUtils.wait(2);
        //to find password box
        WebElement password = driver.findElement(By.name("_password"));
        //to enter password
        password.sendKeys("User123");
        //to find submit button
        WebElement button = driver.findElement(By.id("_submit"));
        //to click that button
        button.click();
        BrowserUtils.wait(2);
        String ActualErrorMessage = driver.findElement(By.xpath("//div[contains(text(),\"Invalid user name or password.\")]")).getText();
        String ExpectedErrorMessage = "Invalid user name or password.";
        if(ActualErrorMessage.equals(ExpectedErrorMessage)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        //to close the tab
        driver.quit();
    }
}
