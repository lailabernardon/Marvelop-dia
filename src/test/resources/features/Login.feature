Feature: Test Login functionality

  Scenario: check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <email> and <password>
    And user clicks on login 
    Then user is navigated to the home page

    
  Examples:
  | email | password |
  | Laila Bernardon | 12345 |
  | Ele | 12345 |
  