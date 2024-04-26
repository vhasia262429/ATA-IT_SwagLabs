package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class CartPage {

    //buttons
    public static String checkout = "//button[@id='checkout']";

    //Methods
    public static void clickCheckout()
    {
        driver.findElement(By.xpath(checkout)).click();
    }
}
