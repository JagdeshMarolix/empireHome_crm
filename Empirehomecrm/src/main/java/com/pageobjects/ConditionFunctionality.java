package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class ConditionFunctionality extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement Mastersnavigation;
	
	@FindBy (xpath = "//a[normalize-space()='Condition']")
	WebElement ConditionNavigation;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewConditionButton;
	
	@FindBy (xpath = "//input[@id='ConditionName']")
	WebElement ConditionInputField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//select[@name='mydatatable_length']")
	WebElement TotalConditions;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement ConditionSearchField;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement ConditionEditButton;
	
	@FindBy (xpath = "//button[@class='btn btn-danger btn-sm']")
	WebElement ConditionDeleteButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement ConfirmingYesButton;
	
	public ConditionFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void AddNewCondition() throws Throwable {
		Thread.sleep(2000);
		navigationbutton.click();
		
		Thread.sleep(2000);
		Mastersnavigation.click();
		
		Thread.sleep(2000);
		ConditionNavigation.click();
		
		Thread.sleep(2000);
		AddNewConditionButton.click();
		
		Thread.sleep(2000);
		ConditionInputField.sendKeys(prop.getProperty("NewConditionName"));
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Thread.sleep(2000);
		Utils.dropdowns(TotalConditions, 3);	

		Thread.sleep(2000);
//		ConditionSearchField.sendKeys(prop.getProperty("NewConditionName"));
	}
	public void EditCondition() throws Throwable {
		Thread.sleep(2000);
		ConditionSearchField.sendKeys(prop.getProperty("NewConditionName"));
		
		Thread.sleep(2000);
		ConditionEditButton.click();
		
		Thread.sleep(2000);
		ConditionInputField.clear();
		
		Thread.sleep(2000);
		ConditionInputField.sendKeys(prop.getProperty("EditedConditionName"));
		
		Thread.sleep(2000);
		SaveButton.click();
		
		Utils.dropdowns(TotalConditions, 3);
	}
	public void DeleteCondition() throws Throwable {
		Thread.sleep(2000);
		ConditionSearchField.sendKeys(prop.getProperty("EditedConditionName"));
		
		Thread.sleep(2000);
		ConditionDeleteButton.click();
		
		Thread.sleep(2000);
		ConfirmingYesButton.click();
		
		Thread.sleep(2000);
		Utils.dropdowns(TotalConditions, 3);
	}

}
