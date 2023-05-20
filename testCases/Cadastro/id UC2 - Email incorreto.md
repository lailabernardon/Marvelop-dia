# [id UC2] : Email incorreto

## Description

check register behaviour with invalid credentials

### Precondition

N/A

## Test Steps

  Scenario: check register behaviour with invalid credentials
  
    Given app is open
    
    And user is on login page
    
    When user enters <email> and <password> and <passwordConfirmation>
    
    And user clicks on register 
    
    Then error message is showed

    
  Examples:
  
  | email | password | passwordConfirmation |
  
  | lailabernardon@outlook.com | 123456 | 123456 |

## Expected Result

Error message

This is how the tester determines if the test case is a “pass” or “fail”.

