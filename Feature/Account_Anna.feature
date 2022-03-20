Feature: Test the account page functionality
  As a user I should be able to create and save account information

  Background: 
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    And I click the login button
    When I click on the Accounts link
    And I click the New button

  Scenario: I should be able to enter Account Name in the Account object
    When I enter "HelloWorld" in the Account Name field
    And I click the Save button
    Then I should see "HelloWorld" on the current page
    And I quit the browser

  Scenario: I should see folowing fields in the Rating drop down field
    And I should see the following options in the Rating field
      | --None-- |
      | Hot      |
      | Warm     |
      | Cold     |
    And I quit the browser

  Scenario: I should be able to enter Account Number in the Account object
    When I enter "AccountNumber-Test" in the Account Name field
    And I enter "00012345" in the Account Number field
    And I click the Save button
    Then I should see "00012345" in Account Number field
    And I quit the browser

  Scenario: I should be able to enter Phone in Account object
    When I enter "Phone-Test" in the Account Name field
    And I enter "8001234567" in Phone field
    And I click the Save button
    Then I should see "8001234567" in Phone field
    And I quit the browser

  Scenario: I should be able to enter Account Site in Account obect
    When I enter "AccountSite-Test" in the Account Name field
    And I enter "Test" in the Account Site field
    And I click the Save button
    Then I should see "Test" in the Account Site field
    And I quit the browser

  Scenario: I should see folowing fields in the Type drop down field
    And I should see the following options in the Type field
      | --None--                       |
      | Prospect                   |
      | Customer - Direct          |
      | Customer - Channel         |
      | Channel Partner / Reseller |
      | Installation Partner       |
      | Technology Partner         |
      | Other                      |
      And I quit the browser
