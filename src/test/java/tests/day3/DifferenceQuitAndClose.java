package tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferenceQuitAndClose {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);//will pause program execution for 4 seconds
        // let's try to close browser
        driver.close();//will close only one tab
        Thread.sleep(2000);
        driver.quit();//to shutdown entire browser
    }
}
