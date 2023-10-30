package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class LocationFunctionality extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement Mastersnavigation;
	
	@FindBy (xpath = "//a[normalize-space()='Location']")
	WebElement LocationButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewLocationButton;
	
	@FindBy (xpath = "//input[@id='LocationName']")
	WebElement LocationInputField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement LocationSearchField;
	
	@FindBy (xpath = "//select[@name='mydatatable_length']")
	WebElement NumberOfEntries;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement EditLocationButton;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement DeleteLocationButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement DeleteConfirmingYesButton;
	
	public LocationFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void addNewLocation() throws Throwable {
		Thread.sleep(2000);
		navigationbutton.click();
		Thread.sleep(2000);
		
		Mastersnavigation.click();
		Thread.sleep(2000);
		
		LocationButton.click();
		Thread.sleep(2000);
		
		AddNewLocationButton.click();
		Thread.sleep(2000);
		
		LocationInputField.sendKeys(prop.getProperty("LocationName"));
		Thread.sleep(2000);
		
		SaveButton.click();
		Thread.sleep(2000);
		
		Utils.dropdowns(NumberOfEntries, 3);
	}
	public void editLocation() throws Throwable {
		Thread.sleep(2000);
		LocationSearchField.sendKeys(prop.getProperty("LocationName"));
		Thread.sleep(2000);
		
		 EditLocationButton.click();
		 Thread.sleep(2000);
		 
		 LocationInputField.clear();
		 Thread.sleep(2000);
		 
		 LocationInputField.sendKeys(prop.getProperty("EditedLocation"));
		 Thread.sleep(2000);	
		 
		 SaveButton.click();
		 Thread.sleep(2000);
		 
		 Utils.dropdowns(NumberOfEntries, 3);
		 
	}
	public void deleteLocation() throws Throwable {
		Thread.sleep(2000);
		
		LocationSearchField.sendKeys(prop.getProperty("EditedLocation"));
		Thread.sleep(2000);
		
		 DeleteLocationButton.click();
		 Thread.sleep(2000);
		 
		 DeleteConfirmingYesButton.click();
		 Thread.sleep(2000);
		 
		 Utils.dropdowns(NumberOfEntries, 3);
		 
		 
	}
	

}
