package com.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class ProductAdd extends Basetest {
@FindBy (xpath = "//span[@class='pe-7s-keypad']")
WebElement navigationbutton;

@FindBy (xpath = "//span[normalize-space()='Inventory']")
WebElement inventorybutton;

@FindBy (xpath = "//a[normalize-space()='Add Inventory']")
WebElement addinventorybutton;

@FindBy (xpath = "//input[@placeholder='Enter Model Number']")
WebElement modelnumber;

@FindBy (xpath = "//textarea[@name='Title']")
WebElement itemtitle;

@FindBy (xpath = "//textarea[@name='ItemDescription']")
WebElement itemdescription;

@FindBy (xpath = "//input[@placeholder='Enter Height']")
WebElement heightField;

@FindBy (xpath = "//input[@placeholder='Enter Width']")
WebElement widthField;

@FindBy(xpath = "//input[@placeholder='Enter Breadth']")
WebElement breadthField;

@FindBy(xpath = "//input[@placeholder='Enter Color Name']")
WebElement itemcolor;

@FindBy(xpath = "//input[@id='actual']")
WebElement actualpriceField;

@FindBy(xpath = "//*[@id=\"lobicard-custom-control1\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span")
WebElement mrpFactorField;

@FindBy (xpath = "//li[contains(text(), '3.00')]")
WebElement mrpFactorInput;

//@FindBy(xpath = "//input[@id='mrp']")
//WebElement mrppriceField;

@FindBy(xpath = "//input[@placeholder='Enter Qty ']") ////span[@id='select2-factor-container']
WebElement QtyField;

@FindBy(xpath = "//input[@name='ProductMainImageUploaded']")
WebElement imageUploadbutton;

@FindBy(xpath = "//button[normalize-space()='Save']")
WebElement savebutton;

public ProductAdd() {
	PageFactory.initElements(driver, this);
}
public void verifyProductAdd(String modelname, String itemtitle2, String itemdescription2, String height, String width, String breadth, String colorname, String actualprice, String Qty) throws Throwable {
	Thread.sleep(2000);
	
	navigationbutton.click();
	Thread.sleep(2000);
	
	inventorybutton.click();
	Thread.sleep(2000);
	
	addinventorybutton.click();
	Thread.sleep(2000);
	
	modelnumber.sendKeys(modelname);
	Thread.sleep(2000);
	
	itemtitle.sendKeys(itemtitle2);
	Thread.sleep(2000);
	
	itemdescription.sendKeys(itemdescription2);
	Thread.sleep(2000);
	
	heightField.sendKeys(height);
	Thread.sleep(2000);
	
	widthField.sendKeys(width);
	Thread.sleep(2000);
	
	breadthField.sendKeys(breadth);
	Thread.sleep(2000);
	
	itemcolor.sendKeys(colorname);
	
	actualpriceField.sendKeys(actualprice);
	Thread.sleep(2000);
	
//	Actions ac = new Actions(driver);
//	ac.moveToElement(mrpFactorField);
	
//	mrpFactorInput.sendKeys("3.00");
//	mrpFactorInput.click();
//	Thread.sleep(2000);
	
	mrpFactorField.click();
	Thread.sleep(2000);
	
	mrpFactorInput.click();
	Thread.sleep(2000);
	
	QtyField.sendKeys(Qty);
	Thread.sleep(2000);
	
//	ac  = new Actions(driver);
//	ac.moveToElement(imageUploadbutton).click().build().perform();
	Utils.actions(driver, imageUploadbutton);
	Thread.sleep(2000);
	
	Robot rb = new Robot();
	StringSelection path = new StringSelection("\"C:\\Users\\Admin\\OneDrive\\Pictures\\Saved Pictures\\halloween_mask2.jpg\"");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
//	Thread.sleep(3000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	savebutton.click();
	
}
}
