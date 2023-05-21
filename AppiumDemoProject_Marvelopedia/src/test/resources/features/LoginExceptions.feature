Feature: Test Login functionality

  Scenario: check login behaviour with invalid credentials
    Given browser is open
    And user is on login page
    When user enters <email> and <password>
    And user clicks on login 
    Then user is navigated to the home page

    
  Examples:
  | username | password |
  | lailabernardon@outlook.com | 123456 |
  | lailabernardon@outlook.com | 12345 |
  |                            |        |  
  | laila.bernardon@outlook.com | 654321 |