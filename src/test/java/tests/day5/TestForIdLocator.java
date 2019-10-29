package tests.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class TestForIdLocator {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button = driver.findElement(By.id("disappearing_button"));
        button.click();
        //<p id="result" style="color:green">Now it's gone!</p>
        WebElement result = driver.findElement(By.id("result"));
        //to get text --> now it's gone!
        System.out.println(result.getText());
        driver.quit();
    }

}
