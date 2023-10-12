package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.OriginalLogin;
import com.pageobjects.UserType;


public class UsertypeTestCases extends Basetest {
	OriginalLogin ol;
	UserType ut;
	
	public UsertypeTestCases() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		ut = new UserType();
		
	}
	@Test
	public void UserTypeValidation() throws Throwable {
		ut.verifyUserType();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Usertypes");
		
		
	}
	@AfterMethod
	public void teardown() {
		
	}

}
