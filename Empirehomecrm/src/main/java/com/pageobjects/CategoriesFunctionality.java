package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class CategoriesFunctionality extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement Mastersnavigation;
	
	@FindBy (xpath  = "//a[normalize-space()='Categories']")
	WebElement categoriesNavigation;
	
	@FindBy (xpath = "//a[normalize-space()='Add New Category']")
	WebElement AddNewCategoryButton;
	
	@FindBy (xpath = "//input[@id='CategoryName']")
	WebElement CategoryInputField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement CategorySearchField;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement CategoryEditButton;
	
	@FindBy (xpath = "//select[@name='mydatatable_length']")
	WebElement showEntriesdropdown;
	
	@FindBy (xpath = "//tr[@class='odd']//a[2]//button[1]")
	WebElement CategoriesDeleteButton;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement YesButton;
	
	public CategoriesFunctionality() {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyCategories() throws Throwable {
		Thread.sleep(2000);
		navigationbutton.click();
		Thread.sleep(2000);
		
		Mastersnavigation.click();
		Thread.sleep(2000);
		
		categoriesNavigation.click();
		Thread.sleep(2000);
		
		AddNewCategoryButton.click();
		Thread.sleep(2000);
		
		CategoryInputField.sendKeys(prop.getProperty("NewCategoryName"));
		Thread.sleep(2000);
		
		SaveButton.click();
		
//		Utils.actions(driver, AddNewCategoryButton);
		
		CategorySearchField.sendKeys(prop.getProperty("NewCategoryName"));
		Thread.sleep(2000);
		
		CategoryEditButton.click();
		Thread.sleep(2000);
		
		CategoryInputField.clear();
		
		CategoryInputField.sendKeys(prop.getProperty("EditedCateogoryName"));
		Thread.sleep(2000);
		
		SaveButton.click();
		Thread.sleep(2000);
		
		showEntriesdropdown.click();
		
		Utils.dropdowns(showEntriesdropdown, 3);
		Thread.sleep(2000);
		
		
		CategorySearchField.sendKeys(prop.getProperty("EditedCateogoryName"));
		Thread.sleep(2000);
		
		CategoriesDeleteButton.click();
		
		Thread.sleep(2000);
		Utils.actions(driver, YesButton);

		
		
		
		
		
		
	}

}
