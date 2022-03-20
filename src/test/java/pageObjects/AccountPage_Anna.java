package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import utilities.BaseClass;

public class AccountPage_Anna extends BaseClass {

	@FindBy(id="username") WebElement uname;
	@FindBy(id="password") WebElement pwd;
	@FindBy(id="Login") WebElement loginBtn;
	@FindBy(linkText="Accounts") WebElement accLink;
	@FindBy(name="new") WebElement newButton;
	@FindBy(name="acc2") WebElement aName;
	@FindBy(name="save") WebElement saveButton;
	@FindBy(className="topName") WebElement topName;
	@FindBy(id="acc9") WebElement accountRating;
	@FindBy(id="acc5") WebElement accountNumber;
	@FindBy(id="acc5_ileinner") WebElement savedAccNumber;
	@FindBy(id="acc10") WebElement aPhone;
	@FindBy(id="acc10_ileinner") WebElement verifyPhone;
	
	public AccountPage_Anna() {
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String username) {
		uname.sendKeys(username);
	}
	public void enterPassword(String password) {
		pwd.sendKeys(password);
	}
	public void clickLoginButton() {
		loginBtn.click();
	}
	public void clickAccountsLink (){
		accLink.click();
	}
	public void clickNewButton() {
		newButton.click();
	}
	public void enterAccountName (String accountName) {
		aName.sendKeys(accountName);
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	public boolean accountIsCreated () {
		return topName.isDisplayed();
	}
	public WebElement selectRaiting () {
		return accountRating;
	}
	public void enterAccountNumber(String accNumber) {
		accountNumber.sendKeys(accNumber);
	}
	public String verifyAccountNumberIsCreated (String string) {
		return savedAccNumber.getText();
	}
	public void enterPhone(String phone) {
		aPhone.sendKeys(phone);
	}
	public void phoneNumberIsSaved () {
		Assert.assertTrue(verifyPhone.isDisplayed());
	}
	

	
	
}

