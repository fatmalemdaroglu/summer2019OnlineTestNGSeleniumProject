package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;


public class EnterTestPractice2 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputbox = driver.findElement(By.name("email"));
        //Keys.ENTER will simulate Enter button press
        inputbox.sendKeys("random@email.com", Keys.ENTER);
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String expectedMessage = "Your e-mail's been sent!";
        //to get the text from element
        String actualMessage = confirmationMessage.getText();
        if(actualMessage.equals(expectedMessage)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        driver.close();
    }
}
