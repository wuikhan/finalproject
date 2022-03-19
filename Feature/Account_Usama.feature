Feature: Test the Account functionality
  As a valid user I should be able to create a new account and enter valid information in the fields.

  Background: As a valid user, I should be able to login to the application
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad

  @testThis
  Scenario: As a authentic user I should be able to create new account and enter valid information and save it
    And Accounts link should be present in the menu
    When I click the accounts tab
    And I click the new button
    Then I enter "UsamaAjmal" in the account name field "acc2"
    And In field "acc9" I should be able to see following options in dropdown
      | --None-- |
      | Hot      |
      | Warm     |
      | Cold     |
    And I should be able to enter "2654867978" account number in field "acc5"
    And I should be able to enter "090078601"phone number in field "acc10"
    And I should be able to enter "info@example.com"account site in field "acc23"
    And I field "acc6" I should be able to see following options in dropdown
      | --None--                 |
      | Prospect                 |
      | Customer - Direct        |
      | Customer - Channel       |
      | Channel Partner/Reseller |
      | Installation Partner     |
      | Technology Partner       |
      | Other                    |
		Then I should be able to save it