package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static pages.LogInPage.*;
import static pages.HomePage.*;

public class HomePage {

    @Given("^user is logged in on the web application$")
    public void user_is_logged_in_on_the_web_application() throws InterruptedException {
        enterValidUserName();
        enterValidPassword();
        clickLogIn();
    }

    @When("^user sort price of the product from high to low$")
    public void user_sort_price_of_the_product_from_high_to_low() throws InterruptedException {
        clickSorting();
        clickPriceHighToLow();
    }

    @Then("^user validates that the price of the product is sorted from high to low$")
    public void user_validates_that_the_price_of_the_product_is_sorted_from_high_to_low() throws InterruptedException {
        validateProductsHighToLow();
    }

    @When("^user add two items in the cart with a price of fifteen dollars and ninety nine cents$")
    public void user_add_two_items_in_the_cart_with_a_price_of_fifteen_dollars_and_ninety_nine_cents() throws InterruptedException {
        addItemOnTheCart();
    }
}