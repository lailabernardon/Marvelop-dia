# [id UP5] : Pesquisa de quadrinho 

## Description

Comic Book Search invalid

### Precondition

Valid credentials logged

## Test Steps


Feature: Comic Book Search

Scenario: Invalid search with invalid data type
    Given I am on the comic book search page
    When I enter a search query with an invalid data type
    And I click the search button
    Then I should see an error message indicating an invalid data type

Examples:
    | Search Query | Expected Error Message                     |
    | 123          | "Invalid data type. Please enter a valid search query." |
    

## Expected Result

Error Message is showed

This is how the tester determines if the test case is a “pass” or “fail”.


