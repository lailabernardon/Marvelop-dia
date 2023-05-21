# [id UL21] : Senha incorreta

## Description

Check login is unsuccessful with invalid password

### Precondition

Valid credentials registered

## Test Steps

  Scenario: check login behaviour with invalid credentials
  
    Given app is open
    
    And user is on login page
    
    When user enters <email> and <password>
    
    And user clicks on login 
    
    Then error message is showed

    
  Examples:
  
  | username | password |
  
  | lailabernardon@outlook.com | 12345 |
    

## Expected Result

Error message must be showed

This is how the tester determines if the test case is a “pass” or “fail”.
