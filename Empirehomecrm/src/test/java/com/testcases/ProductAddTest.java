package com.testcases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.OriginalLogin;
import com.pageobjects.ProductAdd;
import com.utils.Productaddexcel;

public class ProductAddTest extends Basetest {
	private final String sheetname1 = "Sheet1";
	OriginalLogin login;
	ProductAdd itemsaddition;
	
	public ProductAddTest() {
		super();
		
	}
	@DataProvider 
	public Object[][] dataload() throws Throwable{
		return Productaddexcel.Customerdata(sheetname1);
	}
	@BeforeMethod
	public void setup() {
		initialization();
		login = new OriginalLogin();
		itemsaddition = new ProductAdd();
		
	}
	@Test(dataProvider = "dataload")
	public void productValidation(String modelname, String itemtitle, String itemdescription, String height, String width, String breadth, String colorname, String actualprice, String Qty) throws Throwable {
		login.OriginalLoginValidation();
		itemsaddition.verifyProductAdd(modelname, itemtitle, itemdescription, height, width, breadth, colorname, actualprice, Qty);
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");
	}
	@AfterMethod
	public void teardown() {
		
	}

}
