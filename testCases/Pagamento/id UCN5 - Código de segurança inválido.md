# [id UCN5] : Pagamento

## Description

Payment process

### Precondition

"Security Code" is invalid

## Test Steps

Scenario: Invalid "Security Code" entered

          Given I am on the payment screen

          When I enter an invalid "Security Code"

          And I enter valid values for other fields

          And I click on the "Pay Now" button

          Then I should see an error message indicating that the "Security Code" is invalid



    
  Examples:
  | Card Number |	Cardholder | Expiry Date	 | Security Code 
  
  | 1234567890123456|  Laila Bernardon       	| 12/2024	| 12	| 
  
  | 9876543210987654	|  Laila Bernardon       	| 10/2025	| 1234	| 
  
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon      	| 12/2018	| 99	| 
  
  
    

## Expected Result

error message indicating that the "Security Code" is invalid

This is how the tester determines if the test case is a “pass” or “fail”.


