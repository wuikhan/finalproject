Feature: Test the login funtionality
  As a user I should be able to login to the application

  Scenario: As a valid user, I should be able to login to the application
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad