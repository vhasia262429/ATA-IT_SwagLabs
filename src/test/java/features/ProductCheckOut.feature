Feature: Checking out product successfully

 @CompleteCheckOut
Scenario: Validate user is able to checkout products successfully
 Given user is logged in on the web application
 When user sort price of the product from high to low
 Then user validates that the price of the product is sorted from high to low
 When user add two items in the cart with a price of fifteen dollars and ninety nine cents
 And user proceed to checkout
 And log the checkout summary
 And user completes the purchase
 Then user validates that the checkout is complete

