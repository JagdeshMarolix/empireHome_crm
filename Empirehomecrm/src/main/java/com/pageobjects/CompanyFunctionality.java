package com.pageobjects;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.Basetest;
import com.utils.Utils;

public class CompanyFunctionality extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement Mastersnavigation;
	
	@FindBy (xpath = "//a[normalize-space()='Company']")
	WebElement CompanyNavigationButton;
	
	@FindBy (xpath = "//button[@title='Edit']")
	WebElement CompanyEditButton;
	
	@FindBy (xpath = "//input[@name='Code']")
	WebElement CompanyCodeInputField;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement SaveButton;
	
	@FindBy (xpath = "//i[@class='fa fa-pencil']")
	WebElement CompanyInfoEditButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter CEO Name']")
	WebElement EnterCEOName;
	
	@FindBy (xpath = "//input[@placeholder='Enter Company Name']")
	WebElement CompanyNameInputField;
	
	public CompanyFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void EditCompanyFunctionality() throws Throwable {
		Thread.sleep(2000);
		navigationbutton.click();
		
		Thread.sleep(2000);
		Mastersnavigation.click();
		
		Thread.sleep(2000);
		CompanyNavigationButton.click();
		
		Thread.sleep(2000);
		CompanyInfoEditButton.click();
		
		Thread.sleep(2000);
		CompanyNameInputField.clear();
		CompanyNameInputField.sendKeys("AlpahabetINC");
		
		Thread.sleep(2000);
		EnterCEOName.clear();
		EnterCEOName.sendKeys("Tim Mathew");
		
//		CompanyCodeInputField.clear();
		
		Thread.sleep(2000);
		CompanyCodeInputField.clear();
		CompanyCodeInputField.sendKeys(prop.getProperty("CompanyCode"));
		
		
		Thread.sleep(2000);
		SaveButton.click();
	}
	public void AssertMessage() {
		
			java.util.List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='Tim Mathew']"));

			if (rows.isEmpty()) {
				Assert.fail("No rows found in the table.");
			} else {
				String expectedText = "Tim Mathew";

				for (WebElement row : rows) {
					String actualText = row.getText();
					System.out.println(actualText);

				}
			
	}
	}
}
