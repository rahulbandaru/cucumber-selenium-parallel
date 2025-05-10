Feature: Cucumber selenium parallel test feature

  Scenario: Open google
    Given I am on Google
    Then the search button is present
    
  Scenario: Open Gmail
    Given I am on Gmail
    Then the Signin button is present
 