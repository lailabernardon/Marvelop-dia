# [id US2] : Remover item no carrinho

## Description

Shopping Cart Functionality

### Precondition

Valid credentials logged

## Test Steps

Scenario: Remove item from the shopping cart

    Given I have items in my shopping cart

    And I am on the shopping cart page

    When I click on the "Remove" button for a specific item

    Then the item should be removed from my shopping cart
    
    And the total number of items in the cart should decrease by 1



    
  Examples:
  | Cart | 
 
  | Fantastic Four by Dan Slott Vol. I (Hardcover) | 
  

  
    

## Expected Result

Total number of items in the cart should decrease by 1

This is how the tester determines if the test case is a “pass” or “fail”.


