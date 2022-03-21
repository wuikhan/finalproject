Feature: Account Object
  I want to make sure all the fields and functionalities are working in the Account object

  Scenario: Verify Account Name field is present
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad
    And I click the Accounts tab
    When I click the new button
    Then I should see account name field

  Scenario: Verify Rating drop down field options
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad
    And I click the Accounts tab
    When I click the new button
    Then I should see the following options for the rating field
      | --None-- |
      | Hot      |
      | Warm     |
      | Cold     |
