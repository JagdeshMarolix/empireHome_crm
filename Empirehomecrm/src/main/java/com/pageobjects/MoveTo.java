package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;

public class MoveTo extends Basetest {
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement navigationbutton;
	
	@FindBy (xpath = "//span[normalize-space()='Inventory']")
	WebElement inventorybutton;
	
	@FindBy (xpath = "//a[normalize-space()='Move Stock']")
	WebElement movestockbutton;
	
	@FindBy (xpath ="//select[@id='movedFromD']")
	WebElement moveFromField;
	
	@FindBy (xpath = "//select[@id='movedToD']")
	WebElement moveToField;
	
	@FindBy (xpath = "//input[@id='MoStNot']")
	WebElement NotesField;
	
	@FindBy (xpath = "//span[@id='select2-invId-container']")
	WebElement modelNumberField;
	
	@FindBy (xpath = "//input[@role='textbox']")
	WebElement textbox;
	
	@FindBy (xpath = "//input[@id='qtymoving']")
	WebElement qtyField;
	
	@FindBy (xpath = "//input[@id='btnAdd']")
	WebElement addButton;
	
	@FindBy (xpath = "//button[@id='btnSave']")
	WebElement saveButton;
	
	public MoveTo() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyMoveTo() throws Throwable {
		Thread.sleep(2000);
		
		navigationbutton.click();
		Thread.sleep(2000);
		
		inventorybutton.click();
		Thread.sleep(2000);
		
		movestockbutton.click();
		Thread.sleep(2000);
		
		Select s1 = new Select(moveFromField);
		s1.selectByVisibleText("Warehouse");
		Thread.sleep(2000);
		
		Select s2 = new Select(moveToField);
		s2.selectByVisibleText("Showroom");
		Thread.sleep(2000);
		
		NotesField.sendKeys(prop.getProperty("Notes"));
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement( modelNumberField).click().perform();
		
		textbox.sendKeys(prop.getProperty("ModelNumber"));
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
//		modelNumberField.click();
		
		qtyField.sendKeys(prop.getProperty("Quantity"));
		Thread.sleep(2000);
		
		addButton.click();
		Thread.sleep(2000);
		
		saveButton.click();
		
		driver.navigate().to("http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");
		
//		Select s1 = new Select(moveFromField);
		s1.selectByVisibleText("Showroom");
		Thread.sleep(2000);
		
//		Select s2 = new Select(moveToField);
		s2.selectByVisibleText("Warehouse");
		Thread.sleep(2000);
		
		NotesField.sendKeys(prop.getProperty("Notes"));
		Thread.sleep(2000);
		
//		Actions ac = new Actions(driver);
		ac.moveToElement( modelNumberField).click().perform();
		
		textbox.sendKeys(prop.getProperty("ModelNumber"));
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
//		modelNumberField.click();
		
		qtyField.sendKeys(prop.getProperty("Quantity"));
		Thread.sleep(2000);
		
		addButton.click();
		Thread.sleep(2000);
		
		saveButton.click();
		
}
}