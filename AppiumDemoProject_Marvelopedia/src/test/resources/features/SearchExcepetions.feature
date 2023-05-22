Feature: Comic Book Search

Scenario: Invalid search with invalid data type

    Given I am on the comic book search page

    When I enter a search query with an invalid data type

    And I click the search button

    Then I should see an error message indicating an invalid data type



Examples:
    | Search Query | Expected Error Message                |
    |              | "Please enter a search query."         |
    | "@#$%^"      | "Special characters are not allowed in the search query." |
    | "ab"         | "The search query must contain at least 3 characters." |
    | 123          | "Invalid data type. Please enter a valid search query." |

