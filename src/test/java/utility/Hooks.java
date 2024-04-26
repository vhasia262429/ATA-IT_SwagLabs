package utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static BrowserDriver driver;
    public static ChromeOptions options;

    @Before
    public void setUp() throws InterruptedException
    {
        Thread.sleep(2000);
        driver = new BrowserDriver();
    }

    @After
    public void tearDown()
    {
        driver.close();
    }
}

