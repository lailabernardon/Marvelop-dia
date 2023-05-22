# [id UP2] : Pesquisa de quadrinho 

## Description

Comic Book Search invalid

### Precondition

Valid credentials logged

## Test Steps


Scenario: Invalid search with empty query
    Given I am on the comic book search page
    When I leave the search field empty
    And I click the search button
    Then I should see an error message indicating an empty search query

Examples:
    | Search Query | Expected Error Message                |
    |              | "Please enter a search query."         |
  

  
    

## Expected Result

Error Message is showed

This is how the tester determines if the test case is a “pass” or “fail”.


