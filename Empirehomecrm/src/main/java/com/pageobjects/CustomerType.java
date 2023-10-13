package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class CustomerType extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Customers']")
	WebElement CustomersNavigationButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add Customer']")
	WebElement AddCustomerNavigation;
	
	@FindBy (xpath = "//input[@placeholder='Enter Customer Name']")
	WebElement CustomerNameField;
	
	@FindBy (xpath = "//input[@placeholder='Enter Mobile Number']")
	WebElement CustomerMobileNumber;
	
	@FindBy (xpath = "//input[@placeholder='Enter Email Id']")
	WebElement CustomerEmailId;
	
	@FindBy (xpath = "//input[@placeholder='Enter Whatsapp Number']")
	WebElement CustomerWhatsappNumber;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement CustomerSearchField;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement EditCustomerButton;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement DeleteCustomerButton;
	
	@FindBy (xpath = "/html/body/div[5]/div/div[2]/div[1]/button")
	WebElement YesButton; //Are You Sure 
	
	
	public CustomerType() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCustomerType() throws Throwable {
		Thread.sleep(2000);
		
		navigationbutton.click();
		Thread.sleep(2000);
		
		CustomersNavigationButton.click();
		Thread.sleep(2000);
		
		AddCustomerNavigation.click();
		Thread.sleep(2000);
		
		CustomerNameField.sendKeys(prop.getProperty("Addcustomername"));
		CustomerMobileNumber.sendKeys(prop.getProperty("Addmobilenumber"));
		CustomerEmailId.sendKeys(prop.getProperty("Addemailid"));
		CustomerWhatsappNumber.sendKeys(prop.getProperty("Addwhatsappnumber"));
//		Thread.sleep(4000); //comment this line after a check.
		SaveButton.click();
		
		CustomerSearchField.sendKeys(prop.getProperty("Addcustomername"));
		CustomerSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		EditCustomerButton.click();
		Thread.sleep(2000);
		
		CustomerMobileNumber.clear();
		CustomerMobileNumber.sendKeys(prop.getProperty("editedmobilenumber"));
		
		SaveButton.click();
		Thread.sleep(2000);
		
		CustomerSearchField.sendKeys(prop.getProperty("Addcustomername"));
		
		CustomerSearchField.sendKeys(Keys.ENTER);
		
		DeleteCustomerButton.click();
		Thread.sleep(2000);
		
		Utils.actions(driver, YesButton);
		Thread.sleep(3000);
		
		
		
	}
}
