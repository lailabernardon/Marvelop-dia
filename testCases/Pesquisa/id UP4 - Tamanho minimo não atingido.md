# [id UP4] : Pesquisa de quadrinho 

## Description

Comic Book Search invalid

### Precondition

Valid credentials logged

## Test Steps


Feature: Comic Book Search

    Given I am on the comic book search page
    When I enter a search query with less than 3 characters
    And I click the search button
    Then I should see an error message indicating the minimum search query length

Examples:
    | Search Query | Expected Error Message                            |
    | "ab"         | "The search query must contain at least 3 characters." |
  

  
    

## Expected Result

Error Message is showed

This is how the tester determines if the test case is a “pass” or “fail”.


