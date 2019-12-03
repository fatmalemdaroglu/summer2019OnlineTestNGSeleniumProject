package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigurationReader;
import utils.Driver;

//this class will be a test foundation for all test classes
// we will put here only before and after parts
//in this way before and after methods will be the same
//every test class will extend testbase class
public abstract class TestBase {
    @BeforeMethod
    public void setup(){
        String url = ConfigurationReader.getProperty("url");
        Driver.get().get(url);
    }
    @AfterMethod
    public void teardown(){
        Driver.close();
    }
}
