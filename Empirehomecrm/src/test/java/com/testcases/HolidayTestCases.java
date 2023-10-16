package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.HolidayFunctionality;
import com.pageobjects.OriginalLogin;

public class HolidayTestCases extends Basetest {
	OriginalLogin ol;
	HolidayFunctionality hf;
	public HolidayTestCases() {
		super();
		
	}
@BeforeMethod
public void setUp() {
	initialization();
	ol = new OriginalLogin();
	ol.OriginalLoginValidation();
	hf = new HolidayFunctionality();
	
}
@Test
public void HolidayFunctionalityValidation() throws Throwable {
	hf.VerifyHoliday();
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Master/Holidays");
	
	}
}