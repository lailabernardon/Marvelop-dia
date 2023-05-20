# [id UC1] : Login correto

## Description

Check login is successful with valid credentials

### Precondition

Valid credentials registered

## Test Steps

  Scenario: check login is successful with valid credentials
  
    Given app is open
    
    And user is on login page
    
    When user enters <email> and <password>
    
    And user clicks on login 
    
    Then user is navigated to the home page

    
  Examples:
  | email | password |
 
  | laila.bernardon@outlook.com | 123456 |
  
  | lailabernardon13@gmail.com | Senha@ |
  
    

## Expected Result

Home page must be showed

This is how the tester determines if the test case is a “pass” or “fail”.

