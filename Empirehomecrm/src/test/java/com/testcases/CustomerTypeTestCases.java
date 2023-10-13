package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CustomerType;
import com.pageobjects.OriginalLogin;

public class CustomerTypeTestCases extends Basetest {
	OriginalLogin ol;
	CustomerType ct;
	public CustomerTypeTestCases() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		ol= new OriginalLogin();
		ol.OriginalLoginValidation();
		ct=new CustomerType();
		
	}
	@Test
	public void addCustomerValidation() throws Throwable {
		ct.verifyCustomerType();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/User/CustomerList");
		
	}
	@AfterMethod
	public void teardown( ) {
		
	}

	
	

}
