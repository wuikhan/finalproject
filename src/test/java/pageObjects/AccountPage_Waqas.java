package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class AccountPage_Waqas extends BaseClass {

	@FindBy(xpath = "//a[@title='Accounts Tab']")
	WebElement accountsTab;
	@FindBy(xpath = "//td[@class='pbButton']//input[@name='new']")
	WebElement newButton;
	@FindBy(id = "acc2")
	WebElement accountNameField;
	
	@FindBy(id="acc9") WebElement ratingDropDown;

	public AccountPage_Waqas() {
		PageFactory.initElements(driver, this);
	}

	public void clickAccountTab() {
		accountsTab.click();
	}

	public void clickNewButton() {
		newButton.click();
	}

	public void verifyAccountNameField() {
		Assert.assertTrue(accountNameField.isDisplayed());

	}
	
	public List<WebElement> verifyRatingDropOptions() {
		
		Select selRating = new Select(ratingDropDown);
		List<WebElement> opt = selRating.getOptions(); // 5
		
		return opt;
		
	}
	
	

}
