package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

import bsh.util.Util;

public class ShiftsFunctionality extends Basetest{
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement Mastersnavigation;
	
	@FindBy (xpath = "//a[normalize-space()='Shifts']")
	WebElement ShiftsNavigationButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewShiftButton;
	
	@FindBy (xpath = "//input[@id='ShiftName']")
	WebElement ShiftInputField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@name='StartTime']")
	WebElement StartTimeInput;
	
	@FindBy (xpath = "//input[@name='EndTime']")
	WebElement EndTimeInput;
	
	@FindBy (xpath = "//select[@name='mydatatable_length']")
	WebElement TotalShifts;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement ShiftsSearchField;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement ShiftsDeleteButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement YesConfirmingButton;
	
	public ShiftsFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void AddShiftFunctionality() throws Throwable {
		Thread.sleep(2000);
		navigationbutton.click();
		
		Thread.sleep(2000);
		Mastersnavigation.click();
		
		Thread.sleep(2000);
		ShiftsNavigationButton.click();
		
		Thread.sleep(2000);
		AddNewShiftButton.click();
		
		Thread.sleep(2000);
		ShiftInputField.sendKeys(prop.getProperty("NewShiftName"));
		
		Thread.sleep(2000);
		StartTimeInput.sendKeys(prop.getProperty("StartTime"));
		Utils.am();
		
		Thread.sleep(2000);
		EndTimeInput.sendKeys(prop.getProperty("EndTime"));
		Utils.pm();
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Utils.dropdowns(TotalShifts, 3);
	}
	public void DeleteShiftFunctionality() throws Throwable {
		Thread.sleep(2000);
		ShiftsSearchField.sendKeys(prop.getProperty("NewShiftName"));
		
		Thread.sleep(2000);
		ShiftsDeleteButton.click();
		
		Thread.sleep(2000);
		YesConfirmingButton.click();
		
		Thread.sleep(2000);
		Utils.dropdowns(TotalShifts, 3);
		
		
	}

}
