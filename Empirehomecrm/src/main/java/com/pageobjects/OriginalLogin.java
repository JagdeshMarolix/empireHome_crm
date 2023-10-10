package com.pageobjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class OriginalLogin extends Basetest{

	@FindBy(xpath = "//input[@placeholder='example@gmail.com']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='pword']")
	WebElement password;
	
	@FindBy(xpath ="//button[@class='btn green_btn']")
	WebElement loginbutton;
	
	public OriginalLogin () {
		PageFactory.initElements(driver, this);
		
	}
	public void OriginalLoginValidation() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbutton.click();
		
	}
}
