package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AccountPage_Umair extends BaseClass {
	@FindBy(id="username") WebElement uname;
	@FindBy(id="password") WebElement pwd;
	@FindBy(id="Login") WebElement loginBtn;
	@FindBy(id="setupLink") WebElement setupLink;
	
	public AccountPage_Umair() {
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
	
	public boolean setUpLinkPresent() {
		return setupLink.isDisplayed();
	}
	

}



