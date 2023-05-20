Feature: Test Register functionality

  Scenario: check register behaviour with invalid credentials
    Given browser is open
    And user is on login page
    When user enters <email> and <password> and <passwordConfirmation>
    And user clicks on register 
    Then user is navigated to the home page

    
  Examples:
  | email | password | passwordConfirmation |
  | lailabernardon@outlook.com | 123456 | 123456 |
  | lailabernardon@outlook.com | 12345 | 12345 |
  |                            |        |        |   
  |                @.com       | 123456 | 123456 |
  | lailabernardon@outlook.com | 12345 |  2345 |