# [id UP1] : Pesquisa de quadrinho

## Description

Comic Book Search

### Precondition

Valid credentials logged

## Test Steps

Scenario: Search for information 

    Given I am on the home search page

    When I enter <Name> in the search field

    And I click the search button

    Then I should see search results related to the name



    
  Examples:
  | Name | 
 
  | Witch hunter | 
  

  
    

## Expected Result

Home page must be showed with results realted the information inputted

This is how the tester determines if the test case is a “pass” or “fail”.


