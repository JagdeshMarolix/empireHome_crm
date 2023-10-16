package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class HolidayFunctionality extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement MastersNavigateButton;
	
	@FindBy (xpath = "//a[normalize-space()='Holidays']")
	WebElement HolidaysNavigationButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewHolidayButton;
	
	@FindBy (xpath = "//input[@name='HolidayDate']")
	WebElement HolidayDateField;
	
	@FindBy (xpath = "//input[@id='HolidayName']")
	WebElement HolidayNameField;
	
	@FindBy (xpath = "//input[@id='HolidayDesc']")
	WebElement HolidayDescriptionField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//tbody/tr[26]/td[5]/a[1]/button[1]/i[1]")
	WebElement EditButton;
	
	@FindBy (xpath = "//tbody/tr[1]/td[5]/a[2]/button[1]/i[1]")
	WebElement DeleteButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement YesButton;
	
	
	
	public HolidayFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void VerifyHoliday( ) throws Throwable {
		Thread.sleep(2000);
		
		navigationbutton.click();
		Thread.sleep(2000);
		
		MastersNavigateButton.click();
		Thread.sleep(2000);
		
		HolidaysNavigationButton.click();
		Thread.sleep(2000);
		
		AddNewHolidayButton.click();
		Thread.sleep(2000);
		
		HolidayDateField.sendKeys(prop.getProperty("HolidayDate"));
		HolidayNameField.sendKeys(prop.getProperty("HolidayName"));
		HolidayDescriptionField.sendKeys(prop.getProperty("HolidayDescription"));
		
		SaveButton.click();
		Thread.sleep(2000);
		
		EditButton.click();
		Thread.sleep(2000);
		
		HolidayDateField.clear();
		HolidayNameField.clear();
		HolidayDescriptionField.clear();
		
		
		HolidayDateField.sendKeys(prop.getProperty("EditedHolidayDate"));
		HolidayNameField.sendKeys(prop.getProperty("EditedHolidayName"));
		HolidayDescriptionField.sendKeys(prop.getProperty("EditedHolidayDescription"));
		
		SaveButton.click();
		Thread.sleep(2000);
		
		DeleteButton.click();
		Thread.sleep(2000);
		
		Utils.actions(driver, YesButton);
		Thread.sleep(3000);
		
		
		
		
	}
	
}


//<! String Date = "19";
//String Day = "Novemeber";
//String Year = 2023
//
//@FindBy (xpath = "//input[@name='HolidayDate']")
//WebElement calenderButtonDatePicker; -->
//@FindBy (xpath = "//div[@class='input-group']")
//WebElement monthYear;




