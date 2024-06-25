Feature: Bank Login Page Feature

  Scenario: Verify Login Page title
    Given user is on the login page
    When user gets the title of the page
    Then title of page should be "Swag Labs"

  Scenario: Verify User is able to login with valid credentials
    Given user is on the login page
    When user enters username as "standard_user"
    And user enters password as "secret_sauce"
    And user clicks on login button
    Then user gets the title of the page
    And title of page should be "Swag Labs"
