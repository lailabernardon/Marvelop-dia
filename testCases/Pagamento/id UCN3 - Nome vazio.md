# [id UCN3] : Pagamento

## Description

Payment process

### Precondition

"Card Number" is empty

## Test Steps

Scenario: Empty "Cardholder Name"

        Given I am on the payment screen

        When I leave the "Cardholder Name" field empty

        And I enter valid values for other fields

        And I click on the "Pay Now" button

        Then I should see an error message indicating that the "Cardholder Name" is required




    
  Examples:
  | Card Number |	Cardholder | Expiry Date	 | Security Code 
  | 1234567890123456|         	| 12/2024	| 123	| 
  | 9876543210987654	|         	| 12/2024	| 123	| 
  | ABCDEFGHIJKLMNOP	|         	| 12/2024	| 123	| 
  
    

## Expected Result

 error message indicating that the "Cardholder Name" is required

This is how the tester determines if the test case is a “pass” or “fail”.


