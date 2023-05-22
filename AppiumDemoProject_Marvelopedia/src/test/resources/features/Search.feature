Feature: 
Comic Book Search

Scenario: Search for information 

    Given I am on the home search page

    When I enter <Name> in the search field

    And I click the search button

    Then I should see search results related to the name



    
  Examples:
  | Name | 
 
  | Witch hunter | 

