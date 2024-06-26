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
        |Sauce Labs Backpack|
        |Sauce Labs Bike Light|
        |Sauce Labs Bolt T-Shirt|
        |Sauce Labs Fleece Jacket|
        |Sauce Labs Onesie|
        |Test.allTheThings() T-Shirt (Red)|

        Scenario: User add product into the cart
          Given user is on the Products page
          When user gets the list of all products
          And user click on "Sauce Labs Onesie" product
          And user click on Add to cart button
          Then user verify the product should be available to cart


          Scenario: User verify products Menu button
            Given user is on the Products page
            When user click the Menu btn
            And user gets the list of menu items
            Then count of menu items should be 4
            And menu product list should be
            |All Items|
            |About    |
            |Logout   |
            |Reset App State|


