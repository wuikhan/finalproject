package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountPage_josue;
import utilities.BaseClass;

public class AccountPageTest_josue extends BaseClass {
	AccountPage_josue ap = new AccountPage_josue();

	@When("I click on Accounts Tab")
	public void i_click_on_accounts_tab() {
		ap.clickAccountsTab();
	}

	@When("I click on new button")
	public void i_click_on_new_button() {
		ap.clickNewBtn();
	}

	@Then("I should see the Account Name input field")
	public void i_should_see_the_account_name_input_field() {
		ap.accountNamePresent();
		boolean present = ap.accountNamePresent();
		Assert.assertTrue(present);
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
		tearDown();
	}

	@When("I click on the Rating")
	public void i_click_on_the_rating() throws InterruptedException {
		ap.clickRatingDropDown();
		Thread.sleep(3);
	}

	@Then("I should see the following options for Rating")
	public void i_should_see_the_following_options_for_rating(DataTable value) {
		List<String> rating = value.asList(String.class);
		WebElement ratingValues = driver.findElement(By.id("acc9"));
		Select selType = new Select(ratingValues);
		List<WebElement> ratingOption = selType.getOptions();
		for (int i = 0; i < rating.size(); i++) {
			Assert.assertEquals(rating.get(i), ratingOption.get(i).getText());
			System.out.println(ratingOption.get(i).getText());
		}

	}

	@Then("I should be able to see the Account number input field")
	public void i_should_be_able_to_see_the_account_number_input_field() {
		ap.accountNumberPresent();
		boolean present = ap.accountNumberPresent();
		Assert.assertTrue(present);
	}

	@When("I should click Type")
	public void i_should_click_type() {
		ap.clickTypeDropDown();
	}

	@Then("I should see the following options for Type")
	public void i_should_see_the_following_options_for_type(DataTable values) {
		List<String> types = values.asList(String.class);
		WebElement typeValues = driver.findElement(By.id("acc6"));
		Select selType = new Select(typeValues);
		List<WebElement> typeOption = selType.getOptions();
		for (int i = 0; i < types.size(); i++) {
			Assert.assertEquals(types.get(i), typeOption.get(i).getText());
			System.out.println(typeOption.get(i).getText());
		}

	}

	@Then("I should be able to see the Account site field")
	public void i_should_be_able_to_see_the_account_site_field() {
		ap.accountSitePresent();
		boolean present = ap.accountSitePresent();
		Assert.assertTrue(present);
	}

	@Then("I should be able to see the Phone input field")
	public void i_should_be_able_to_see_the_phone_input_field() {
		ap.phoneInputPresent();
		boolean present = ap.phoneInputPresent();
		Assert.assertTrue(present);
	}

}
