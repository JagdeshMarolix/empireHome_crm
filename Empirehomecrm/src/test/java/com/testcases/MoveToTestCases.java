package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.MoveTo;
import com.pageobjects.OriginalLogin;

public class MoveToTestCases extends Basetest {
	OriginalLogin ol;
	MoveTo mt; 
	public MoveToTestCases() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		mt = new MoveTo();
		
		
	}
	
	@Test
	public void MoveStockValidation() throws Throwable {
		mt.verifyMoveTo();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");
		
	}
	@AfterMethod
	public void teardown() {
		
	}

}
