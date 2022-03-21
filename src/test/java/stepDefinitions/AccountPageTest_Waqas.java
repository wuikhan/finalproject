package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountPage_Waqas;
import utilities.BaseClass;

public class AccountPageTest_Waqas extends BaseClass {
	AccountPage_Waqas ap;

	@Then("I click the Accounts tab")
	public void i_click_the_accounts_tab() {
		ap = new AccountPage_Waqas();
		ap.clickAccountTab();
	}

	@When("I click the new button")
	public void i_click_the_new_button() {
		ap.clickNewButton();
	}

	@Then("I should see account name field")
	public void i_should_see_account_name_field() {
		ap.verifyAccountNameField();
	}
	
	@Then("I should see the following options for the rating field")
	public void i_should_see_the_following_options_for_the_rating_field(io.cucumber.datatable.DataTable values) {
		List<String> rows = values.asList(String.class);
		List<WebElement> opt = ap.verifyRatingDropOptions();
		
		for (int i = 0; i < rows.size(); i++) {
			Assert.assertEquals(rows.get(i), opt.get(i).getText());
		}
	}
}
