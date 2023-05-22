## Describe the bug
Pagamento sem dados válidos inseridos

## To Reproduce
      Given I am on the payment screen

      When I leave the "Card Number", "Cardholder Name", "Expiry Date", and "Security Code" fields blank

      And I click on the "Pay Now" button

      Then I should see error messages indicating that the fields are required

## Expected behavior
error messages indicating that the fields are required

## Priority
P0

## Screenshots/Video
[Screenshot_20230522-174912_Marvelopdia.jpg]([[url](https://github.com/lailabernardon/Marvelop-dia/blob/main/reports/P0/Screenshot_20230522-174912_Marvelopdia.jpg)])


## Mobile/Tablet
- Marvelopédia Version 0.0.1
- Android Version 9
- Hardware Galaxy S10

## Additional context
TC related: https://github.com/lailabernardon/Marvelop-dia/blob/main/testCases/Pagamento/id%20UCN6%20-%20Campos%20obrigat%C3%B3rios.md
