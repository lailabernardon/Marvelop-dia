# [id UCN6] : Pagamento

## Description

Payment process

### Precondition

Required fields left blank

## Test Steps

Scenario: Required fields left blank

          Given I am on the payment screen

          When I leave the "Card Number", "Cardholder Name", "Expiry Date", and "Security Code" fields blank

          And I click on the "Pay Now" button

          Then I should see error messages indicating that the fields are required



    
  Examples:
  | Card Number |	Cardholder | Expiry Date	 | Security Code 
  | 1234567890123456|  Laila Bernardon       	| 12/2024	| 	| 
  |                	|  Laila Bernardon       	| 10/2025	| 123	| 
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon      |     	  | 991	| 
  | ABCDEFGHIJKLMNOP	|                       | 10/2020 | 991	| 
    

## Expected Result

error messages indicating that the fields are required

This is how the tester determines if the test case is a “pass” or “fail”.


