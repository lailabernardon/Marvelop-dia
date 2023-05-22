# [id US1] : Adicionar item no carrinho

## Description

Shopping Cart Functionality

### Precondition

Valid credentials logged

## Test Steps

Scenario: Add item to the shopping cart

    Given I am a logged-in user

    And I have selected a product

    When I click on the "Add to Cart" button

    Then the item should be added to my shopping cart

    And the total number of items in the cart should increase by 1



    
  Examples:
  | Cart | 
 
  | Fantastic Four by Dan Slott Vol. I (Hardcover) | 
  

  
    

## Expected Result

Total number of items in the cart should increase by 1

This is how the tester determines if the test case is a “pass” or “fail”.


