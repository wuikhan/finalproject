Feature: verify Account Page
  As a user I should be able to click on Account Tab

  Scenario: As a valid user, I should be able to click on Account field
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad
    Then I should click on New button
    Then I should see the acoount name field
    Then I should click the save button
    Then I should be able to click the logout button

  Scenario: As a valid user, I should be able to see Rating Dropdown field
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad
    Then I should see the Rating field
    Then I should be able to select options
    Then I should click the save button
    Then I should be able to click the logout button

  Scenario: As a valid user, I should be able to see Account number field
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad
    Then I should see the Account number field
    Then I should click the save button
    Then I should be able to click the logout button

  Scenario: As a valid user, I should be able to see phone field
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad
    Then I should see the phone field
    Then I should click the save button
    Then I should be able to click the logout button
    
     Scenario: As a valid user, I should be able to see Acccount site field
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad
    Then I should see the account site field
    Then I should click the save button
    Then I should be able to click the logout button
    
    Scenario: As a valid user, I should be able to see Type dropDown field
    Given I am on the "https://login.salesforce.com" environment
    And I enter "batch06@codegator.us.qa" username
    And I enter "Welcome1" password
    When I click the login button
    Then I should see the dashboad
    Then I should be able to see Type Dropdown field
    Then I should click the save button
    Then I should be able to click the logout button
    
