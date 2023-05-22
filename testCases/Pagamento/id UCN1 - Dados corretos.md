# [id UCN1] : Pagamento

## Description

Payment process

### Precondition

Successful payment with correct payment details

## Test Steps

Scenario: Successful payment with correct payment details
          Given I am on the payment screen

          When I enter a valid "Card Number"

          And I enter a valid "Cardholder Name"

          And I enter a future "Expiry Date"

          And I enter a valid "Security Code"

          And I click on the "Pay Now" button

          Then the payment should be processed successfully




    
  Examples:
  | Card Number |	Cardholder Name	| Expiry Date	 | Security Code 
  | 1234567890123456	| Laila Beernardon	| 12/2024	| 123	| 
  

  
    

## Expected Result

Payment processed successfully

This is how the tester determines if the test case is a “pass” or “fail”.


