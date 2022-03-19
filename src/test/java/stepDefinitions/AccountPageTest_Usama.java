package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountPage_Usama;
import utilities.BaseClass;

public class AccountPageTest_Usama extends BaseClass {
	
	AccountPage_Usama accPage;

	@Then("Accounts link should be present in the menu")
	public void accounts_link_should_be_present_in_the_menu() {
	   accPage.accountsLink();
	}

	@When("I {string} the accounts tab")
	public void i_the_accounts_tab(String string) {
	   accPage.accountsLink();
	}

	@When("I {string} the new button")
	public void i_the_new_button(String string) {
	   accPage.newButton();
	}

	@Then("I enter {string} in the account name field {string}")
	public void i_enter_in_the_account_name_field(String name) {
	    accPage.accountName(name);
	}

	@Then("In field {string} I should be able to see following options in dropdown")
	public void in_field_i_should_be_able_to_see_following_options_in_dropdown() {
	    accPage.ratingDropDown();
	}

	@Then("I should be able to enter account number in field {string}")
	public void i_should_be_able_to_enter_account_number_in_field(int num) {
	    accPage.accountNum(num);
	}

	@Then("I should be able to enter phone number in field {string}")
	public void i_should_be_able_to_enter_phone_number_in_field(int phoneNum) {
	   accPage.phoneNumber(phoneNum);
	}

	@Then("I should be able to enter account site in field {string}")
	public void i_should_be_able_to_enter_account_site_in_field(String accSite) {
	    accPage.accountSite(accSite);
	}

	@Then("I field {string} I should be able to see following options in dropdown")
	public void i_field_i_should_be_able_to_see_following_options_in_dropdown() {
	    accPage.typeDropDown();
	}
	@Then("I should be able to save it")
	public void i_should_be_able_to_save_it() {
	    accPage.saveButton();
	}
}
