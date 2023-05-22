# [id UP3] : Pesquisa de quadrinho 

## Description

Comic Book Search invalid

### Precondition

Valid credentials logged

## Test Steps


Feature: Comic Book Search

Scenario: Invalid search with invalid characters
    Given I am on the comic book search page
    When I enter an invalid search query containing special characters
    And I click the search button
    Then I should see an error message indicating invalid characters

Examples:
    | Search Query | Expected Error Message                          |
    | "@#$%^"      | "Special characters are not allowed in the search query." |
      |
  

  
    

## Expected Result

Error Message is showed

This is how the tester determines if the test case is a “pass” or “fail”.


