Feature: Test the Account page functionality
  As a valid user I should be able to create a new account and enter valid information in the fields.

  Background: As a valid user, I should be able to login to the application
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I click the Accounts Tab in the menu
    And I click the new button

  Scenario: Add an "Account Name" field in the account object
    And I should see account name field in the account page
    Then I enter "BILALAHMAD" in the account name field
    And I should be able to click save button

  Scenario: Add a "Rating" dropdown field in the account object
    And I should see the following options in the dropdown and select "Warm"
      | --None-- |
      | Hot      |
      | Warm     |
      | Cold     |

  Scenario: Add an "Account Number" in the account object
    And I should see account number field in the account page
    Then I enter "090078601" in the account number field
    And I should be able to click save button

  Scenario: Add a "Phone" field in the account object
    And I should see the phone field in the account page
    Then I enter "090078601" in the phone filed
    And I should be able to click save button

  Scenario: Add an "Account Site" field in the account object
    And I should see the account site field in the account page
    Then I enter "info@example.us" in the account site field
    And I should be able to click save button

  Scenario: Add a "Type" dropdown field in the account object
    And I should see the following options in the dropdown and select "Prospect"
      | --None--                 |
      | Prospect                 |
      | Customer - Direct        |
      | Customer - Channel       |
      | Channel Partner/Reseller |
      | Installation Partner     |
      | Technology Partner       |
      | Other                    |