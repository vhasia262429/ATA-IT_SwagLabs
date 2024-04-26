Feature: Logged In User

  @LogInSuccessfully
  Scenario: Validate user is able to log in using valid credentials
    Given user navigates to the log in page
    When user log in using valid credentials
    Then user is logged in successfully

  @LogInUnsuccessfully
  Scenario: Validate user logged in unsuccessfully due to locked out account
    Given user navigates to the log in page
    When user log in using locked out credentials
    Then user validates that an error message is displayed