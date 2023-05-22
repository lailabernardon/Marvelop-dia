# [id UCN8] : Pagamento

## Description

Payment process

### Precondition

Payment declined by the payment gateway

## Test Steps

Scenario: Payment declined by the payment gateway

          Given I am on the payment screen
          
          When I enter valid payment details
          
          And the payment gateway declines the payment
          
          And I click on the "Pay Now" button
          
          Then I should see an error message indicating payment declined
          



    
  Examples:
  
  | Card Number |	Cardholder | Expiry Date	 | Security Code 
  
  | 1234567890123456|  Laila Bernardon       	| 12/2024	| 111	| 
  
  | 1234567890123456|  Laila Bernardon       	| 10/2025	| 123	| 
  
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon      | 10/2025    	  | 991	| 
  
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon  | 10/2020 | 991	| 
    

## Expected Result

error message indicating payment declined

This is how the tester determines if the test case is a “pass” or “fail”.


