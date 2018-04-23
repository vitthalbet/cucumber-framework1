@Open-Account @Acquisition
Feature: Acceptance testing to validate opening an account is working.
  

  @Open-Account-Positive
  Scenario: Open savings or checking account US12345/US45678
    Given I am on the Home Page "https://www.citibank.com" of Citibank website
    When I move to Open an Account Option
    And click on Basic Banking Package Apply now link
    Then I should see page title as "Regular Checking"
    
    