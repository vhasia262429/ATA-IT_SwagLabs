package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static pages.HomePage.*;
import static pages.LogInPage.*;
import static org.junit.Assert.assertEquals;

public class BasePage {

    @Given("^user navigates to the log in page$")
    public void user_navigates_to_the_log_in_page() {
        String actualLogInLogo = visibilitySwagLabsLogo();
        assertEquals(actualLogInLogo, "Swag Labs");
    }

    @When("^user log in using valid credentials$")
    public void user_log_in_using_valid_credentials() throws InterruptedException {
        enterValidUserName();
        enterValidPassword();
        clickLogIn();
    }

    @Then("^user is logged in successfully$")
    public void user_is_logged_in_successfully() {
        String actualHomePageLogo = visibilityProductsHeader();
        assertEquals(actualHomePageLogo, "Products");
    }

    @When("^user log in using locked out credentials$")
    public void user_log_in_using_locked_out_credentials() throws InterruptedException {
        enterLockedOutUserName();
        enterValidPassword();
        clickLogIn();
    }

    @Then("^user validates that an error message is displayed$")
    public void user_validates_that_an_error_message_is_displayed() {
        String actualLogInErrorMessage = validatesErrorLogInMessage();
        assertEquals(actualLogInErrorMessage, "Epic sadface: Sorry, this user has been locked out.");
    }
}
