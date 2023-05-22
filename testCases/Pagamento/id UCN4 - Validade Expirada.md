# [id UCN4] : Pagamento

## Description

Payment process

### Precondition

Expired "Expiry Date"

## Test Steps

Scenario: Expired "Expiry Date" entered

          Given I am on the payment screen

          When I enter an expired "Expiry Date"

          And I enter valid values for other fields

          And I click on the "Pay Now" button

          Then I should see an error message indicating that the "Expiry Date" is invalid



    
  Examples:
  | Card Number |	Cardholder | Expiry Date	 | Security Code 
  
  | 1234567890123456|  Laila Bernardon       	| 12/2023	| 123	| 
  
  | 9876543210987654	|  Laila Bernardon       	| 10/2020	| 123	| 
  
  | ABCDEFGHIJKLMNOP	|  Laila Bernardon      	| 12/2019	| 123	|
  
  
    

## Expected Result

error message indicating that the "Expiry Date" is invalid

This is how the tester determines if the test case is a “pass” or “fail”.


