package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;



public class TestBase {

    public static WebDriver driver;




    @BeforeTest
    public void startDriver() {
        driver = new ChromeDriver();
        driver.manage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://automationexercise.com/");
    }

    @AfterTest
    public void stopDriver() {

    }

}
