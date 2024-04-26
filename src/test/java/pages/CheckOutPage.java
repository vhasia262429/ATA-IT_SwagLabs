package pages;

import org.openqa.selenium.By;
import static utility.BrowserDriver.driver;

public class CheckOutPage {

    //text
    public static String checkout_complete = "//span[contains(.,'Checkout: Complete!')]";
    public static String checkout_information = "//span[contains(.,'Checkout: Your Information')]";
    public static String subtotal_price = "//div[@class='summary_subtotal_label']";
    public static String tax = "//div[@class='summary_tax_label']";
    public static String total_price = "//div[@class='summary_total_label']";
    public static String payment_info_value = "//*[@id='checkout_summary_container']/div/div[2]/div[2]";
    public static String shipping_info = "//*[@id='checkout_summary_container']/div/div[2]/div[4]";

    //fields
    public static String first_name = "//input[@id='first-name']";
    public static String last_name = "//input[@id='last-name']";
    public static String zip_code = "//input[@id='postal-code']";

    //button
    public static String checkout = "//button[@id='checkout']";
    public static String continue_checkout = "//input[@id='continue']";
    public static String finish_checkout = "//button[@id='finish']";
    public static String back_to_homepage = "//button[@id='back-to-products']";

    public static void clickCheckOut() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(checkout)).click();

    }

    public static String validatesCheckOutInformationHeader()
    {
        String actualCheckOutInformation = driver.findElement(By.xpath(checkout_information)).getText();
        return actualCheckOutInformation;
    }

    public static void enterCheckoutInformation()
    {
        driver.findElement(By.xpath(first_name)).sendKeys("test123");
        driver.findElement(By.xpath(last_name)).sendKeys("test123");
        driver.findElement(By.xpath(zip_code)).sendKeys("1910");
    }

    public static void clickContinue() throws InterruptedException {
        driver.findElement(By.xpath(continue_checkout)).click();
        Thread.sleep(3000);
    }

    public static void clickFinish()
    {
        driver.findElement(By.xpath(finish_checkout)).click();
    }

    public static String validatesCheckOutComplete()
    {
        String actualCheckOutCompleteHeader = driver.findElement(By.xpath(checkout_complete)).getText();
        return actualCheckOutCompleteHeader;
    }

    public static String validatePaymentInformationValue()
    {
        String actualPaymentInformation = driver.findElement(By.xpath(payment_info_value)).getText();
        return actualPaymentInformation;
    }

    public static String validateSubTotalPrice()
    {
        String actualSubTotalPrice = driver.findElement(By.xpath(subtotal_price)).getText();
        return actualSubTotalPrice;
    }

    public static String validateShippingInformation()
    {
        String actualShippingInfo = driver.findElement(By.xpath(shipping_info)).getText();
        return actualShippingInfo;
    }

    public static String validateTaxPrice()
    {
        String actualTaxPrice = driver.findElement(By.xpath(tax)).getText();
        return actualTaxPrice;
    }

    public static String validateTotalPrice()
    {
        String actualTotalPrice = driver.findElement(By.xpath(total_price)).getText();
        return actualTotalPrice;
    }

    public static void clickBackToHome()
    {
        driver.findElement(By.xpath(back_to_homepage)).click();
    }
}
