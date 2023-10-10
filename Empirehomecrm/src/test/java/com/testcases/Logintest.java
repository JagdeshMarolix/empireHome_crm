package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.utils.Utils;

public class Logintest extends Basetest {

	Loginfunctionality lf;
	private final String sheetname="login";
	public Logintest() {
		super();   //invokes the parent class constructor
	}
	@DataProvider
	public String[][] DataLoad() throws Throwable {
		return Utils.Customerdata(sheetname);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new Loginfunctionality();

	}

	@Test(dataProvider="DataLoad", dataProviderClass = Logintest.class)

	public void loginvalidation(String username, String password) {
		lf.verifylogin(username, password);
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		

	}

	@AfterMethod
	public void teardown() {
//		  extentreports.flush();
		//driver.close();

	}
}
