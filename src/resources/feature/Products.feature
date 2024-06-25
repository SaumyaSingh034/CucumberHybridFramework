Feature: Products List Feature

  Background:
    Given user will login to the Swag Labs Login Page using below credentials
      |userName|password|
      |standard_user|secret_sauce|

    Scenario: User will get the list of all products
      Given user is on the Products page
      When user gets the count of all the products
      Then the count of products should be 6

      Scenario: User gets the list of all products
        Given user is on the Products page
        When user gets the list of all products
        Then product list should contain
        ||
        ||
        ||
        ||
        ||
        ||

        Scenario: