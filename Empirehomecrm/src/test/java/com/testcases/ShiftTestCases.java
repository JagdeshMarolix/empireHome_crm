package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.OriginalLogin;
import com.pageobjects.ShiftsFunctionality;

public class ShiftTestCases extends Basetest {
	OriginalLogin ol;
	ShiftsFunctionality sf;
	public ShiftTestCases() {
		super();
	}
	@BeforeTest
	public void setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		sf = new ShiftsFunctionality();
	}
	@Test (priority = 1)
	public void addShift() throws Throwable {
		sf.AddShiftFunctionality();
		List<WebElement>rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Inserted row size is: " + rowCount);
		Assert.assertEquals(rowCount, 25);
	}
	@Test (priority = 2)
	public void DeleteShift() throws Throwable {
		sf.DeleteShiftFunctionality();
		List<WebElement>rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Deleted row size is: " + rowCount);
		Assert.assertEquals(rowCount, 24);
		
	}

}
