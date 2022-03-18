package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AccountPage_josue extends BaseClass {

	@FindBy(linkText = "Accounts")
	WebElement accountsTab;
	@FindBy(name = "new")
	WebElement newbtn;
	@FindBy(id = "acc2")
	WebElement accountNameInputField;
	@FindBy(id = "acc9")
	WebElement ratingDropDown;
	@FindBy(id = "acc5")
	WebElement accountNumberInputFIeld;
	@FindBy(id = "acc10")
	WebElement phoneInputField;
	@FindBy(id = "acc23")
	WebElement accountSiteInputFiled;
	@FindBy(id = "acc6")
	WebElement typeDropDown;

	public AccountPage_josue() {
		PageFactory.initElements(driver, this);
	}

	public void clickAccountsTab() {
		accountsTab.click();
	}

	public void clickNewBtn() {
		newbtn.click();
	}

	public boolean accountNamePresent() {
		return accountNameInputField.isDisplayed();
	}

	public void clickRatingDropDown() {
		ratingDropDown.click();

	}

	public boolean accountNumberPresent() {
		return accountNumberInputFIeld.isDisplayed();

	}

	public boolean phoneInputPresent() {
		return phoneInputField.isDisplayed();
	}
	public boolean accountSitePresent() {
		return accountSiteInputFiled.isDisplayed();
	}
	public void clickTypeDropDown() {
		typeDropDown.click();
	}
}
