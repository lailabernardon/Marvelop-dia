# [id UC1] : Cadastro correto

## Description

Check login is successful with valid credentials

### Precondition

N/A

## Test Steps

  Scenario: check register is successful with valid credentials
  
    Given app is open
    
    And user is on register page
    
    When user enters <email> and <password> and <passwordConfirmation>
    
    And user clicks on register 
    
    Then user is navigated to the home page

    
  Examples:
  
  | email | password | passwordConfirmation |
  
  | laila.bernardon@outlook.com | 123456 | 123456 |

## Expected Result

User registered

This is how the tester determines if the test case is a “pass” or “fail”.

