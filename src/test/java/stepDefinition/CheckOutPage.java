package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.CartPage.*;
import static pages.CheckOutPage.*;


public class CheckOutPage {

    @And("^user proceed to checkout$")
    public void user_proceed_to_checkout() throws InterruptedException {
        clickCheckOut();
        String actualCheckOutInformation = validatesCheckOutInformationHeader();
        assertEquals(actualCheckOutInformation, "Checkout: Your Information");
        enterCheckoutInformation();
        clickContinue();
    }

    @And("^log the checkout summary$")
    public void log_the_checkout_summary() {
        String actualPaymentInformation = validatePaymentInformationValue();
        assertEquals(actualPaymentInformation, "SauceCard #31337");
        String actualShippingInfo = validateShippingInformation();
        assertEquals(actualShippingInfo, "Free Pony Express Delivery!");
        String actualSubTotalPrice = validateSubTotalPrice();
        assertEquals(actualSubTotalPrice, "Item total: $31.98");
        String actualTaxPrice = validateTaxPrice();
        assertEquals(actualTaxPrice,"Tax: $2.56");
        String actualTotalPrice = validateTotalPrice();
        assertEquals(actualTotalPrice,"Total: $34.54");

    }

    @And("^user completes the purchase$")
    public void user_completes_the_purchase() {
        clickFinish();
    }

    @Then("^user validates that the checkout is complete$")
    public void user_validates_that_the_checkout_is_complete() {
        String actualCheckOutCompleteHeader = validatesCheckOutComplete();
        assertEquals(actualCheckOutCompleteHeader, "Checkout: Complete!");
        clickBackToHome();
    }
}
