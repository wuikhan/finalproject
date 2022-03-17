package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class LoginPageTest extends BaseClass {
	
	
	@Given("I am on the {string} environment")
	public void i_am_on_the_environment(String string) {
	  openbrowser("chrome", string);
	}
	@Given("I enter {string} username")
	public void i_enter_username(String string) {
		 System.out.println("Hello");
	}
	@Given("I enter {string} password")
	public void i_enter_password(String string) {
		 System.out.println("Hello");
	}
	@When("I click the {string} button")
	public void i_click_the_button(String string) {
		 System.out.println("Hello");
	}
	@Then("I should see the dashboad")
	public void i_should_see_the_dashboad() {
		 System.out.println("Hello");
	}
	

}
