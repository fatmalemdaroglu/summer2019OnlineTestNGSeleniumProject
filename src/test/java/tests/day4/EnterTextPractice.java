package tests.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //grey text "browser" is not a value
        //it's a placeholder/ or name of the method parameter
        //you don't enter that,it comes up automatically
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement inputbox = driver.findElement(By.name("email"));
        //to enter the test
        inputbox.sendKeys("random@email.com");
        WebElement button = driver.findElement(By.id("form_submit"));
        //to click element
        button.click();
        BrowserUtils.wait(2);
        String expextedURL = "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();
        if(expextedURL.equals(actualURL)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        driver.close();
    }
}
