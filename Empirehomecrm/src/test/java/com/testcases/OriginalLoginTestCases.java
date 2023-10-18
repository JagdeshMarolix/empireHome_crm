package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.OriginalLogin;

public class OriginalLoginTestCases extends Basetest {

	OriginalLogin ol;
	
	public OriginalLoginTestCases() {
		super();
	}
	@BeforeMethod 
	public void loginsetup() {
		initialization();
		ol = new OriginalLogin();
		
	}
	@Test
	public void verifyLogin() {
		ol.OriginalLoginValidation();
		WebElement dashboardtext = driver.findElement(By.xpath("//h1[normalize-space()='CRM Admin Dashboard']"));
		Assert.assertTrue(dashboardtext.isDisplayed(), "Crm admin dashboard text is not visible on the homepage");
//		String url = driver.getCurrentUrl();
//		AssertJUnit.assertEquals(url, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		
	}
	@AfterMethod
	public void teardown() {
		
	}
}
