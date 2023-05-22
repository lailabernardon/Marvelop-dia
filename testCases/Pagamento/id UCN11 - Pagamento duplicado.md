# [id UCN11] : Pagamento

## Description

Payment process

### Precondition

Timeout during payment processing

## Test Steps

Scenario: Duplicate payment submission

          Given I am on the payment screen
          
          When I enter valid payment details
          
          And I click on the "Pay Now" button multiple times
          
          Then I should see an error message indicating duplicate payment submission



    
  Examples:
  
  | Card Number |	Cardholder | Expiry Date	 | Security Code 
  
  | 1234567890123456|  Laila Bernardon       	| 12/2024	| 111	| 
  
  | 1234567890123456|  Laila Bernardon       	| 10/2025	| 123	| 
  
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon      | 10/2025    	  | 991	|
  
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon  | 10/2020 | 991	| 
    

## Expected Result

error message indicating duplicate payment submission

This is how the tester determines if the test case is a “pass” or “fail”.


