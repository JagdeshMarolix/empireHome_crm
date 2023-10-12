package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class UserType extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement mastersButton;
	
	@FindBy (xpath = "//a[normalize-space()='User Types']")
	WebElement userTypesButton;
	
	@FindBy (xpath = "//i[@class='fa fa-plus']")
	WebElement addNewButton;
	
	@FindBy (xpath = "//input[@id='TypeName']")
	WebElement addUserNameField;
	
	@FindBy (xpath = "//input[@id='TypeCode']")
	WebElement addUserTypeField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement searchField;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement editUserButton;
	
	
	public  UserType() {
		PageFactory.initElements(driver, this);
	}
	public void verifyUserType() throws Throwable {
		Thread.sleep(2000);
		
		navigationbutton.click();
		Thread.sleep(2000);
		
		mastersButton.click();
		Thread.sleep(2000);
		
		userTypesButton.click();
		Thread.sleep(2000);
		
		addNewButton.click();
		Thread.sleep(2000);
		
		addUserNameField.sendKeys(prop.getProperty("AddnewUser"));
		addUserTypeField.sendKeys(prop.getProperty("AddUserType"));
		
		saveButton.click();
		
//		driver.navigate().to("http://empirehome.myprojectsonline.co.in/Master/UserTypes");
		
	
		searchField.sendKeys(prop.getProperty("AddnewUser"));
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		editUserButton.click();
		Thread.sleep(3000);	
				
		Utils.actions(driver, addUserNameField);
		addUserNameField.clear();
		
		addUserNameField.sendKeys(prop.getProperty("editUser"));
		
		Utils.actions(driver, addUserTypeField);
		addUserTypeField.clear();
		addUserTypeField.sendKeys(prop.getProperty("editUserType"));
		
		Thread.sleep(3000);
		saveButton.click();
		
		
		
		
	}

}
