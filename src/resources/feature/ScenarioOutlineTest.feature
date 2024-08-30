Feature: Verifying the Scenario and Background keyword

  Background: User landing to facebook signUp page
    Given user invokes the facebook page "url"
    When user clicks on loginBtn
    Then user is navigated to login Page

    Scenario Outline: Verify user login with mutiple credentials
      Given user in on the login Page
      When user send "<username>" and "<password>"
      Then user should be able to login to the HomePage
      Examples:
      |username|password|
      |saumya  |        pass1|
      |rahul  |        pass1|
      |tryaksh  |        pass1|
      |piyush  |        pass1|