# [id UCN9] : Pagamento

## Description

Payment process

### Precondition

Network connection failure during payment

## Test Steps

Scenario: Network connection failure during payment

          Given I am on the payment screen
          
          When I enter valid payment details
          
          And there is a network connection failure during the payment process
          
          And I click on the "Pay Now" button
          
          Then I should see an error message indicating network connection failure



    
  Examples:
  | Card Number |	Cardholder | Expiry Date	 | Security Code 
  
  | 1234567890123456|  Laila Bernardon       	| 12/2024	| 111	| 
  
  | 1234567890123456|  Laila Bernardon       	| 10/2025	| 123	| 
  
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon      | 10/2025    	  | 991	|
  
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon  | 10/2020 | 991	| 
    

## Expected Result

error message indicating network connection failure

This is how the tester determines if the test case is a “pass” or “fail”.


