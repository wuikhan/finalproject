package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseClass;

import org.junit.Assert;

public class AccountPage_bilal extends BaseClass {

	@FindBy(linkText = "Accounts") WebElement accLink;
	@FindBy(xpath = "//input[@name='new']") WebElement newBtn;
	@FindBy(id = "acc2" ) WebElement accName;
	@FindBy(id = "acc9") WebElement ratingDD;
	@FindBy(id = "acc5") WebElement accNum;
	@FindBy(id = "acc10") WebElement phoneNum;
	@FindBy(id = "acc23") WebElement accSite;
	@FindBy(id = "acc6") WebElement typeDD;
	@FindBy(xpath = "//input[@tabindex='34']") WebElement saveBtn;
	
	public AccountPage_bilal() {
		PageFactory.initElements(driver, this);
	}
	
	public void accountName(String name) { 
		accName.sendKeys(name);
	  } 
	
	public void accountNameField() {
		Boolean isPresent = accName.isDisplayed();
		Assert.assertTrue(isPresent);
	}
	
	public void accountNumField() {
		Boolean isPresent = accNum.isDisplayed();
		Assert.assertTrue(isPresent);
	}
	public void accountNum(int number) { 
		String num = Integer.toString(number);
	  accNum.sendKeys(num); 
	  }
	  
	public void phoneNumField() {
		Boolean isPresent = phoneNum.isDisplayed();
		Assert.assertTrue(isPresent);
	}
	  public void phoneNumber(int phNumber) { 
		  String ph_Num =
	  Integer.toString(phNumber); phoneNum.sendKeys(ph_Num); 
	  }
	  
	  public void accountSiteField() {
		  Boolean isPresent = accSite.isDisplayed();
			Assert.assertTrue(isPresent);
	  }

	  public void accountSite(String site) { 
		  accSite.sendKeys(site); 
		  }
	  
	  public void accountsLink() { 
		  accLink.click(); 
		  }
	  
	  public void newButton() { 
		  newBtn.click(); 
		  }
	  
	  public void ratingDropDown(String option) { 
		  Select obj = new Select(ratingDD);
	  List<WebElement> menu = obj.getOptions();
	  
	  String[] expectedMenu = {"--None--", "Hot", "Warm", "Cold" }; 
	  for (int i=0;i<menu.size(); i++) { 
		  Assert.assertEquals(menu.get(i).getText(),
	  expectedMenu[i]);
	   }
	  obj.selectByVisibleText(option);
	  }
	  
	  public void typeDropDown(String option) { 
		  Select obj = new Select(typeDD);
	  List<WebElement> menu = obj.getOptions();
	  
	  String[] expectedMenu = {"--None--", "Prospect", "Customer - Direct",
	  "Customer - Channel", "Channel Partner/Reseller", "Installation Partner",
	  "Technology Partner", "Other"}; 
	  for (int i=0; i<menu.size(); i++) {
	  Assert.assertEquals(menu.get(i).getText(), expectedMenu[i]); 
	  } 
	  obj.selectByVisibleText(option);
	  }
	  
	  public void saveButton() { 
		  saveBtn.click(); 
	  }
	
}