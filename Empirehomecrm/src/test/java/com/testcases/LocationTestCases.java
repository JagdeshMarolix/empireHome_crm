package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LocationFunctionality;
import com.pageobjects.OriginalLogin;

public class LocationTestCases extends Basetest {
	OriginalLogin ol;
	LocationFunctionality lf;
	public LocationTestCases() {
		super();
		
	}
	@BeforeTest
	public void setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		lf = new LocationFunctionality();
	}
	@Test (priority = 1)
	public void addNewLocationValidation() throws Throwable {
		lf.addNewLocation();
		List<WebElement> addedRowCount = driver.findElements(By.tagName("tr"));
		int rowCount = addedRowCount.size();
		System.out.println(rowCount);
		Assert.assertEquals(rowCount, 91);
		
	}
	@Test (priority = 2)
	public void editLocationValidation() throws Throwable {
		lf.editLocation();
		List<WebElement> EditedRowCount = driver.findElements(By.tagName("tr"));
		int rowCount = EditedRowCount.size();
		System.out.println(rowCount);
		Assert.assertEquals(rowCount, 91);
	}
	@Test (priority = 3)
	public void deleteLocationValidation() throws Throwable {
		lf.deleteLocation();
		List<WebElement> DeletedrowCount = driver.findElements(By.tagName("tr"));
		int rowCount = DeletedrowCount.size();
		System.out.println(rowCount);
		Assert.assertEquals(rowCount, 90);
	}

}
