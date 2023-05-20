# [id UC5] : Senha incorreta

## Description

Check register behaviour with invalid credentials

### Precondition

N/A

## Test Steps

  Scenario: check register behaviour with invalid credentials
  
    Given browser is open
    
    And user is on login page
    
    When user enters <email> and <password> and <passwordConfirmation>
    
    And user clicks on register 
    
    Then error message is showed

    
  Examples:
  
  | email | password | passwordConfirmation |
  
  | lailabernardon@outlook.com | 12345 | 12345 |

## Expected Result

Error message

This is how the tester determines if the test case is a “pass” or “fail”.
