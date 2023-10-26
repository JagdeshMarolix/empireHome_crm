package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class SubCategoriesFunctionality extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationButton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement mastersButton;
	
	@FindBy (xpath = "//a[normalize-space()='Sub Categories']")
	WebElement SubCategoriesButton;
	
	@FindBy (xpath = "//a[normalize-space()='Add New Sub Category']")
	WebElement AddNewSubCategoryButton;
	
	@FindBy (xpath = "//select[@id='subcatDD']")
	WebElement CategoryName;
	
	@FindBy (xpath = "//input[@id='SubCategoryName']")
	WebElement SubCategoryInputField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement SearchInputField;
	
	@FindBy (xpath = "//tr[@class='odd']//i[@class='fa fa-pencil']")
	WebElement EditButton;
	
	@FindBy (xpath = "//i[@class='fa fa-trash-o']")
	WebElement DeleteButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--no']")
	WebElement ConfirmingNoButton;
	
	public SubCategoriesFunctionality () {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifySubCategoriesFunctionality() throws Throwable {
		Thread.sleep(2000);
		navigationButton.click();
		Thread.sleep(2000);
		
		mastersButton.click();
		Thread.sleep(2000);
		
		SubCategoriesButton.click();
		Thread.sleep(2000);
		
		AddNewSubCategoryButton.click();
		Thread.sleep(2000);
		
		Utils.dropdowns(CategoryName, 0);
		Thread.sleep(2000);
		
		SubCategoryInputField.sendKeys(prop.getProperty("NewSubCategoryName"));
		Thread.sleep(2000);
		
		SaveButton.click();
		Thread.sleep(2000);
		
		SearchInputField.sendKeys(prop.getProperty("NewSubCategoryName"));
		Thread.sleep(2000);
		
		EditButton.click();
		Thread.sleep(2000);
		
		SubCategoryInputField.clear();
		Thread.sleep(2000);
		
		SubCategoryInputField.sendKeys(prop.getProperty("EditedSubCategoryName"));
		SaveButton.click();
		
		DeleteButton.click();
		Thread.sleep(2000);
		
		ConfirmingNoButton.click();
		Thread.sleep(2000);
		
		
		
		
	}

}
