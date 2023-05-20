## [Input aceitando espaços]
Inputs aceitam espaço como caracteres

## To Reproduce

Scenario: check register is successful with invalid credentials
  
    Given app is open
    
    And user is on register page
    
    When user enters valid <email> and <password> with enters
    
    And user clicks on register 
    
    Then user is registered

## Expected behavior
Input não deveria aceitar espaços como caracteres

## Priority
Impacto : P1

## Screenshots/Video

<a>https://github.com/lailabernardon/Marvelop-dia/blob/main/reports/P1/Screenshot_20230520-200828_Marvelopdia.jpg</a>

## Mobile/Tablet
- Marvelopédia Version 0.0.1
- Android Version 9
- Hardware Galaxy S10

## Additional context
---
