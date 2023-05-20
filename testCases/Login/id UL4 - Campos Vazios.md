# [id UL21] : Campos vazios

## Description

Check login is unsuccessful with empty credentials

### Precondition

Valid credentials registered

## Test Steps

  Scenario: check login behaviour with invalid credentials
  
    Given app is open
    
    And user is on login page
    
    When user enters <email> and <password>
    
    And user clicks on login 
    
    Then user is navigated to the home page

    
  Examples:
  
  | username | password |
  
  |                            |        | 
    

## Expected Result

Error message must be showed

This is how the tester determines if the test case is a “pass” or “fail”.
