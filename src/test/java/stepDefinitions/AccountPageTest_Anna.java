package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountPage_Anna;
import pageObjects.LoginPage;
import utilities.BaseClass;

public class AccountPageTest_Anna extends BaseClass {
	AccountPage_Anna ap;
	LoginPage lp;

	@When("I click on the Accounts link")
	public void i_click_on_the_Accounts_link() {
		ap= new AccountPage_Anna();
	    ap.clickAccountsLink();
	}
	
	@Given("I click the New button")
	public void i_click_the_New_button() {
	    ap.clickNewButton();
	}
	
	@When("I enter {string} in the Account Name field")
	public void i_enter_in_the_Account_Name_field(String string) {
	    ap.enterAccountName(string);
	}
	
	@Given("I click the Save button")
	public void i_click_the_Save_button() {
	    ap.clickSaveButton();
	}
	
	@Then("I should see {string} on the current page")
	public void i_should_see_on_the_current_page(String string) {
	    ap.accountIsCreated();
	}
	
	@Then("I quit the browser")
	public void i_quit_the_browser() {
	   teardown();
	}
	
	@Then("I should see the following options in the Rating field")
	public void i_should_see_the_following_options_in_the_Rating_field(io.cucumber.datatable.DataTable dataTable) {
		 List<String> rows = dataTable.asList(String.class); 
		  WebElement val = ap.selectRaiting();
		  Select selRating = new Select(val);
		  List<WebElement> opt = selRating.getOptions();
		  
		  for(int i=0; i<rows.size(); i++) {
		
			  Assert.assertEquals(rows.get(i), opt.get(i).getText());
			  System.out.printf(rows.get(i), opt.get(i).getText());
		  }
		  } 
	@When("I enter {string} in the Account Number field")
	public void i_enter_in_the_account_number_field(String string) {
	   ap.enterAccountNumber(string);
	}
	
	@Then("I should see {string} in Account Number field")
	public void i_should_see_in_account_number_field(String required) {
		String actual = ap.verifyAccountNumberIsCreated(toString());
	  Assert.assertEquals(required, actual);
	  System.out.println("Required: "+required);
	  System.out.println("Actual: "+actual);
	}
	
	@When("I enter {string} in Phone field")
	public void i_enter_in_phone_field(String string) {
		ap.enterPhone(string);
	}
	
	@Then("I should see {string} in Phone field")
	public void i_should_see_in_phone_field(String string) {
	   ap.phoneNumberIsSaved();
	}
	
	@When("I enter {string} in the Account Site field")
	public void i_enter_in_the_account_site_field(String string) {
	    ap.enterAccountSite(string);
	}
	
	@Then("I should see {string} in the Account Site field")
	public void i_should_see_in_the_account_site_field(String string) {
		ap.verifyAccountSiteIsSaved();
	}
	@When("I should see the following options in the Type field")
	public void i_should_see_the_following_options_in_the_type_field(io.cucumber.datatable.DataTable dataTable) {
		List<String> rows = dataTable.asList(String.class); 
		  WebElement val = ap.verifyTypeDropDownFields();
		  Select selRating = new Select(val);
		  List<WebElement> opt = selRating.getOptions();
		  
		  for(int i=0; i<rows.size(); i++) {
		
			  Assert.assertEquals(rows.get(i), opt.get(i).getText());
		  }
	}

	
	
	}


