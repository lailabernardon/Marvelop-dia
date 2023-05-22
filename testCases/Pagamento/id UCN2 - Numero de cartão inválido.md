# [id UCN2] : Pagamento

## Description

Payment process

### Precondition

"Card Number" is invalid

## Test Steps

Scenario: Invalid "Card Number" entered

            Given I am on the payment screen

            When I enter an invalid "Card Number"

            And I enter valid values for other fields

            And I click on the "Pay Now" button

            Then I should see an error message indicating that the "Card Number" is invalid




    
  Examples:
  | Card Number |	Cardholder Name	| Expiry Date	 | Security Code 
  | 1234	| Laila Beernardon	| 12/2024	| 123	| 
  | 987654321	| Laila Beernardon	| 12/2024	| 123	| 
  | ABCDEFGHIJKLMNOP	| Laila Beernardon	| 12/2024	| 123	| 
  
    

## Expected Result

error message indicating that the "Card Number" is invalid

This is how the tester determines if the test case is a “pass” or “fail”.


