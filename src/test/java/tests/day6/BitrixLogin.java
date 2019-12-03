package tests.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class BitrixLogin {
    public static void main(String[] args) {
        //getDriver method returns object of webdriver
        //we need webdriver object to send commands to the browser
        //left side is a reference variable to reuse this object'//object can be created and used without reference cariable
        //but it's gonna be impossible to use thatt object more than once
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //go to bitrix
        driver.get("https://login1.nextbasecrm.com/?login=yes");
        //enter email
        //WebElement email = driver.findElement("");
        driver.findElement(By.xpath(("//input[@name='USER_LOGIN']"))).sendKeys("helpdesk59@cybertekschool.com");
        //enter password
        //* matches any element
        //it is better to specify tagname to avoid issues with finding element
        //driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[starts-with(@onclick,'BX')]")).sendKeys("UserUser");
        //click the button
        //driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();
        BrowserUtils.wait(3);
        driver.close();
    }
}
