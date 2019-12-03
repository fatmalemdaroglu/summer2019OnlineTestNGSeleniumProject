package tests.day7;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsTest {

    //runs only ones before BeforeMethod , and before all tests
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    //runs only ones after AfterMethod, and all tests
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }


    //runs automatically before every test
    @BeforeMethod
    public void setUp(){
    //some code that will be running before e very test,like: test1,test2,test3
    //we can use method with @BeforeMethod annotation
        System.out.println("Before Method!");
    }

    //runs automatically after every test
    @AfterMethod
    public void teardown(){
        System.out.println("After Method");
    }

    @Test
    public void test1(){
        System.out.println("Test 1!");
        Assert.assertTrue(5 == 5);
    }
    @Test
    public void test2(){
        System.out.println("Test 2!");
    }
    @Test
    public void test3(){
        System.out.println("Test 3!");
    }
}
