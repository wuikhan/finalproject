Feature: Testing Account page functionality
  As a user, I should be able to use the accounts page to open new account.

  Background: 
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    And I click on Accounts Tab
    And I click on new button

  Scenario: Add an Account Name field in the Account Object
    Then I should see the Account Name input field
    Then I close the browser

  Scenario: Add a Rating dropdown field in the Accounts objects
    When I click on the Rating
    Then I should see the following options for Rating
      | --None-- |
      | Hot      |
      | Warm     |
      | Cold     |
    Then I close the browser

  Scenario: Add an Account Number field in the Account object
    Then I should be able to see the Account number input field
    Then I close the browser

  Scenario: Add a Phone field in the Account object
    Then I should be able to see the Phone input field
    Then I close the browser

  Scenario: Add an Account Site field in the Account object
    Then I should be able to see the Account site field
    Then I close the browser

  Scenario: Add a Type drop down field in the Account object
    When I should click Type
    Then I should see the following options for Type
      | --None--                   |
      | Prospect                   |
      | Customer - Direct          |
      | Customer - Channel         |
      | Channel Partner / Reseller |
      | Installation Partner       |
      | Technology Partner         |
      | Other                      |
    Then I close the browser
