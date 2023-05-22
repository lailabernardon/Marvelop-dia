# [id US3] : Atualizar itens no carrinho

## Description

Shopping Cart Functionality

### Precondition

Valid credentials logged

## Test Steps

Scenario: Update quantity of an item in the shopping cart
    Given I have items in my shopping cart
    And I am on the shopping cart page
    When I update the <quantity> of a specific item
    Then the quantity of the item in my shopping cart should be updated accordingly



    
  Examples:
  | quantity | 
 
  | 1 | 
  | 10 | 

  

  
    

## Expected Result

Total quantity of the item in my shopping cart should be updated accordingly

This is how the tester determines if the test case is a “pass” or “fail”.


