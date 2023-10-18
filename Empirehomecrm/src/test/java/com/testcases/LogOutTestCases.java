package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Basetest;
import com.pageobjects.LogoutFunctionality;
import com.pageobjects.OriginalLogin;

public class LogOutTestCases extends Basetest {
	OriginalLogin ol;
	LogoutFunctionality lf;
//	SoftAssert sa;
	public LogOutTestCases() {
		super();
		
	}
@BeforeMethod
public void Setup() {
	initialization();
	ol = new OriginalLogin();
	ol.OriginalLoginValidation();
	lf = new LogoutFunctionality();
//	sa = new SoftAssert();
	
}
@Test
public void LogoutValidation() throws Throwable {
	lf.VerifyLogoutFunctionality();

	
//	String url = driver.getCurrentUrl();
//	Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/", "assertionpassed with the expected string");
//	Assert.assertEquals(UsernameField.isdisplayed);
	WebElement LoginText = driver.findElement(By.xpath("//h4[@class='text-center font-weight-bold mb-3']"));
//	Assert.assertListContainsObject(username, "webpage contains username after a logout");
	Assert.assertTrue(LoginText.isDisplayed(),"unsuccesful logout for the application");
	
}
}
