Feature: Account Service Feature

  Background:
    Given user will login to the bank portal using below credentials
    |userName|password|
    |AutomationTest|Test123|

    Scenario: Verify user is on the Account Service Page
      Given user is on the Account Section Page
      When user gets the title of the page
      Then title of page should be "ParaBank | Accounts Overview"

      Scenario: Verify Account Services Section
        Given user is on the Account Section Page
        Then user gets the Account Services
        |Open New Account|
        |Accounts Overview|
        |Transfer Funds   |
        |Bill Pay         |
        |Find Transactions|
        |Update Contact Info|
        |Request Loan       |
        |Log Out            |
        And user gets the count of Account Services as 8

