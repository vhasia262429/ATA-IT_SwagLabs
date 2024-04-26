package pages;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class LogInPage {

    //text
    public static String login_header = "//div[@class='login_logo']";
    //fields
    public static String username = "//*[@id='user-name']";
    public static String password = "//*[@id='password']";
    public static String error_message = "//h3[@data-test='error']";

    //buttons
    public static String login = "//*[@id='login-button']";


    //Methods
    public static String visibilitySwagLabsLogo()
    {
       String actualLogInLogo = driver.findElement(By.xpath(login_header)).getText();
       return  actualLogInLogo;
    }

    public static void enterValidUserName()
    {
        driver.findElement(By.xpath(username)).sendKeys("standard_user");
    }

    public static void enterLockedOutUserName()
    {
        driver.findElement(By.xpath(username)).sendKeys("locked_out_user");
    }

    public static void enterValidPassword()
    {
        driver.findElement(By.xpath(password)).sendKeys("secret_sauce");
    }

    public static void clickLogIn() throws InterruptedException {
        driver.findElement(By.xpath(login)).click();
        Thread.sleep(10000);
    }

    public static String validatesErrorLogInMessage()
    {
        String actualLogInErrorMessage = driver.findElement(By.xpath(error_message)).getText();
        return  actualLogInErrorMessage;
    }
}
