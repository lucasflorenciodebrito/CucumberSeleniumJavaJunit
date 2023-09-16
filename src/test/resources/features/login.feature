Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials

    Given the user is on login page
    When user enters "<username>" and "<password>"
    Then user is navigated to the home page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |




