package nopcommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{
    @Before
    public void driverSetup(){

        System.setProperty("webdriver.chrome.driver","src\\test\\Recources\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }
    @After
    public void driverTearDown(){
        driver.quit();
    }
}
