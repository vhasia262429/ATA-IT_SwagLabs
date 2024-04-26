package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import static utility.BrowserDriver.driver;

public class HomePage {

    //text
    public static  String header = "//span[@class='title']";
    public static String product_price = "//div[@class='inventory_item_price']";

    //dropdown
    public static String sorting = "//select[@class='product_sort_container']";

    //button
    public static String add_red_shirt_to_cart = "//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']";
    public static String add_bolt_to_cart = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']";
    public static String add_cart = "//a[@class='shopping_cart_link']";

    //Methods
    public static String visibilityProductsHeader()
    {
        String actualHomePageLogo = driver.findElement(By.xpath(header)).getText();
        return actualHomePageLogo;
    }

    public static void clickSorting() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sorting)).click();
    }


    public static void clickPriceHighToLow() throws InterruptedException
    {
        Thread.sleep(2000);
        Select select = new
                Select(driver.findElement(By.xpath(sorting)));
        select.selectByValue("hilo");

    }

    public static void validateProductsHighToLow() throws InterruptedException {
        List<WebElement> priceElements = driver.findElements(By.xpath(product_price));

        List<Float> prices = new
                ArrayList<>();
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replace("$", "");

            prices.add(Float.parseFloat(priceText));
        }
        List<Float> sortedPrices = new
                ArrayList<>(prices);
        sortedPrices.sort(Collections.reverseOrder());

        Assert.assertEquals("Prices are not sorted from high to low", prices, sortedPrices);
        Thread.sleep(2000);
    }

    public static void addItemOnTheCart() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElement(By.xpath(add_bolt_to_cart)).click();
        driver.findElement(By.xpath(add_red_shirt_to_cart)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(add_cart)).click();
    }
}

