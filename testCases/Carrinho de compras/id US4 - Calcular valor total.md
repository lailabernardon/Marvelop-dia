# [id US4] : Calcular valor total

## Description

Shopping Cart Functionality

### Precondition

Valid credentials logged

## Test Steps

Scenario: Calculate total price in the shopping cart

    Given I have <item> in my shopping cart

    And I am on the shopping cart page

    When I view the total price

    Then the total price displayed should be the sum of the <price> of all items in my shopping cart
    
  Examples:
        | Item         | Price |
        | Fantastic Four by Dan Slott Vol. l (Hardcover)      | R$ 39,99   |
  

  
    

## Expected Result

Total price displayed should be the sum of the prices of all items in my shopping cart

This is how the tester determines if the test case is a “pass” or “fail”.


