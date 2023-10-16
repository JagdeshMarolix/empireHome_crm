package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LogoutFunctionality;
import com.pageobjects.OriginalLogin;

public class LogOutTestCases extends Basetest {
	OriginalLogin ol;
	LogoutFunctionality lf;
	public LogOutTestCases() {
		super();
		
	}
@BeforeMethod
public void Setup() {
	initialization();
	ol = new OriginalLogin();
	ol.OriginalLoginValidation();
	lf = new LogoutFunctionality();
}
@Test
public void LogoutValidation() throws Throwable {
	lf.VerifyLogoutFunctionality();
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/", "assertionpassed with the expected string");
	
}
}
