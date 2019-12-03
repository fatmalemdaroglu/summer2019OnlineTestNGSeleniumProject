package tests.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;
import java.util.Set;

public class WindowSwitching {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
    }

    @Test(description = "Verify that title is still Practice")
    public void test1(){
        driver.findElement(By.linkText("New tab")).click();
        //After 3 seconds another website will be openned in the second window
        //selenium doesn't switch aoutomatically to the wimdow
        BrowserUtils.wait(4);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Practice" , "Title is wrong");
    }

    @Test(description = "Verify that user is able to see new window successfully")
    public void test2(){
        driver.findElement(By.linkText("New tab")).click();
        //record id of original window
        String oldWindow = driver.getWindowHandle();
        BrowserUtils.wait(5);
        //int the selenium every window has an id. That id calls window handle
        //to read window handle we use method getWindowHandle()
        //after new window was openned we can get list oof all window's id's/window handles.
        //list - it's a data structure
        //set - it's also a data structure, like list, but it doesn't allow duplicates
        //also you can not easily access anything from there
        //there is no .get() method
        //that's why we need to loop through the set to read a data from there
        //set can store only unique values
        Set<String> windowHandles = driver.getWindowHandles();
        //loop through the collection
        for(String windowHandle: windowHandles){
            //if it's not an old window
            if(!windowHandle.equals(oldWindow)){
                //switch to that window
                driver.switchTo().window(windowHandle);
            }
        }
        //let's verify that title of new window is a Fresh tab
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Fresh tab", "Tittle is wrong");


        //comeback to original page
        //we can build a function that will jump in between windows
        //based on page tittle
        String pageTitle = "Practice";
        for(String windowHHandle : windowHandles){
            //keep jumping from window to window
            driver.switchTo().window(windowHHandle);
            //once we found a correct page title
            if(driver.getTitle().equals(pageTitle)){
                //just exit, stop jumping
                break;
            }
        }
        System.out.println(driver.getTitle());

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//driver.switchTo().window(tabs.get(0));