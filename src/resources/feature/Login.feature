Feature: Bank Login Page Feature

  Scenario: Verify Login Page title
    Given user is on the login page
    When user gets the title of the page
    Then title of page should be "ParaBank | Welcome | Online Banking"

    Scenario: Verify Forget Login Info link
      Given user is on the login page
      Then Forgot login info? link should be displayed

      Scenario: Verify Register Link
        Given user is on the login page
        Then Register link should be displayed

  Scenario: Verify User is able to login with valid credentials
    Given user is on the login page
    When user enters username as "AutomationTest"
    And user enters password as "test123"
    And user clicks on login button
    Then user gets the title of the page
    And title of page should be "ParaBank | Accounts Overview"
