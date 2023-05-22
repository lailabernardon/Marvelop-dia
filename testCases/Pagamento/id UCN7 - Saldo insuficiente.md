# [id UCN7] : Pagamento

## Description

Payment process

### Precondition

Insufficient funds in the account

## Test Steps

Scenario: Insufficient funds in the account

          Given I am on the payment screen
          When I enter valid payment details
          And the account associated with the payment method has insufficient funds
          And I click on the "Pay Now" button
          Then I should see an error message indicating insufficient funds



    
  Examples:
  | Card Number |	Cardholder | Expiry Date	 | Security Code 
  | 1234567890123456|  Laila Bernardon       	| 12/2024	| 111	| 
  | 1234567890123456|  Laila Bernardon       	| 10/2025	| 123	| 
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon      | 10/2025    	  | 991	| 
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon  | 10/2020 | 991	| 
    

## Expected Result

error message indicating insufficient funds

This is how the tester determines if the test case is a “pass” or “fail”.


