Feature: What is this feature about //Facebook Login Validation

  Scenario: login Facebook with valid credentials
    Given User landed on facebook loginPage "https:...."
    When user clicks on Login Icon
    Then user enters <username> and <password>
    Example :
      |username|password|
      |test1|pass1|
      |test2|pass2|