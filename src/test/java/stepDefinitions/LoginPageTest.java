package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.BaseClass;

public class LoginPageTest extends BaseClass {
	LoginPage lp;
	
	@Given("I am on the {string} environment")
	public void i_am_on_the_environment(String string) {
	  openbrowser("chrome", string);
	}
	@Given("I enter {string} username")
	public void i_enter_username(String string) {
		lp = new LoginPage();
		lp.enterUsername(string);
	}
	@Given("I enter {string} password")
	public void i_enter_password(String string) {
		lp = new LoginPage();
		lp.enterPassword(string);
	}
	
	@When("I click the login button")
	public void i_click_the_login_button() {
		lp = new LoginPage();
		lp.clickLoginButton();
	}
	
	@Then("I should see the dashboad")
	public void i_should_see_the_dashboad() {
		lp = new LoginPage();
		boolean present = lp.setUpLinkPresent();
		Assert.assertTrue(present);
	}
	

}
