package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AccountPage_Usama;
import utilities.BaseClass;

public class AccountPageTest_Usama extends BaseClass {
	
	AccountPage_Usama accPage = new AccountPage_Usama();
	
	@Then("I click the Accounts Tab in the menu")
	public void i_click_the_accounts_tab_in_the_menu() {
	   accPage.accountsLink();
	}

	@Then("I click the new button")
	public void i_click_the_new_button() {
	   accPage.newButton();
	}

	@Given("I should see account name field in the account page")
	public void i_should_see_account_name_field_in_the_account_page() {
	   accPage.accountNameField();
	}

	@Then("I enter {string} in the account name field")
	public void i_enter_in_the_account_name_field(String name) {
	   accPage.accountName(name);
	   
	}

	@Given("I should see the following options in the dropdown and select {string}")
	public void i_should_see_the_following_options_in_the_dropdown_and_select(String option, io.cucumber.datatable.DataTable dataTable) {
	   accPage.ratingDropDown(option);
	   
	}

	@Given("I should see account number field in the account page")
	public void i_should_see_account_number_field_in_the_account_page() {
	    accPage.accountNumField();
	}

	@Then("I enter {string} in the account number field")
	public void i_enter_in_the_account_number_field(int number) {
	   accPage.accountNum(number);
	   
	}

	@Given("I should see the phone field in the account page")
	public void i_should_see_the_phone_field_in_the_account_page() {
	    accPage.phoneNumField();
	}

	@Then("I enter {string} in the phone filed")
	public void i_enter_in_the_phone_filed(int phone) {
	   accPage.phoneNumber(phone);
	   
	}

	@Then("I enter {string} in the account site field")
	public void i_enter_in_the_account_site_field(String site) {
	    accPage.accountSite(site);
	    
	}

	@Given("I should see the following options")
	public void i_should_see_the_following_options(String option, io.cucumber.datatable.DataTable dataTable) {
	    accPage.typeDropDown(option);
	    accPage.saveButton();
	}

	@Given("I should be able to click save button")
	public void i_should_be_able_to_click_save_button() {
	}
	
	@Then("I should see the account site field in the account page")
	public void i_should_see_the_account_site_field_in_the_account_page() {
	   accPage.accountSiteField();
	}
}
