package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

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

public ProductAdd() {
	PageFactory.initElements(driver, this);
}
public void verifyProductAdd(String modelname, String itemtitle2, String itemdescription2) throws Throwable {
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
}
}
