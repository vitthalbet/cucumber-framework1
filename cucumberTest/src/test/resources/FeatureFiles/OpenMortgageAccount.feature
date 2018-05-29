@Open-MortgageAccount @Acquisition
Feature: Acceptance testing to validate opening a mortgage account is working.
  

  @Open-MortgageAccount-Positive
  Scenario: Open account in citibank site US78901 / US99876
    Given I am on the Home Page "https://www.citibank.com" of Citibank website
    When I move to Lending Option
    And click on Mortgage option
    Then I should see page title1 as "Your Dream Home Begins With a Mortgage From Citi"
    
    