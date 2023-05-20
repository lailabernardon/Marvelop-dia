# [id UC4] : Campos vazios

## Description

Check login is successful with invalid credentials

### Precondition

N/A

## Test Steps

  Scenario: check login is successful with valid credentials
  
    Given app is open
    
    And user is on login page
    
    When user enters <email> and <password>
    
    And user clicks on login 
    
    Then user is navigated to the home page

## Expected Result

Error message is showed

This is how the tester determines if the test case is a “pass” or “fail”.

