package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class DragAndDropPractice {

    @Test
    public void Test3(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        //click on accept cookies
        driver.findElement(By.cssSelector("button[title='Accept Cookies']"));
        Actions actions = new Actions(driver);
        //moon-it's a dragable object
        //earth-target where we want to drop draggable object
        WebElement moon = driver.findElement(By.id("draggable"));
        WebElement earth = driver.findElement(By.id("droptarget"));
        BrowserUtils.wait(3);//for demo
        //source element emulate btton down at
        //target element to move to and release the mouse at
        actions.dragAndDrop(moon,earth).perform();
        BrowserUtils.wait(3);
        driver.quit();
    }
}
