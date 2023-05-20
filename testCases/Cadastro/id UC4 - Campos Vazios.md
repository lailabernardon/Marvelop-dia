# [id UC4] : Campos vazios

## Description

Check login is successful with valid credentials

### Precondition

Valid credentials registered

## Test Steps

  Scenario: check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <email> and <password>
    And user clicks on login 
    Then user is navigated to the home page

## Expected Result

Home page must be showed

This is how the tester determines if the test case is a “pass” or “fail”.

