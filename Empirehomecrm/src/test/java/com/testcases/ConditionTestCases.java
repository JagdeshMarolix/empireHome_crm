package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.ConditionFunctionality;
import com.pageobjects.OriginalLogin;

public class ConditionTestCases extends Basetest{
	OriginalLogin ol;
	ConditionFunctionality cdf;
	public ConditionTestCases() {
		super();
	}
	@BeforeTest
	public void setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		cdf = new ConditionFunctionality();
	}
	@Test (priority = 1)
	public void addNewCondition() throws Throwable  {
		cdf.AddNewCondition();
		List<WebElement> totalrows = driver.findElements(By.tagName("tr"));
		int rowCount = totalrows.size();
		System.out.println("Newly inserted rowcount is: " + rowCount);
		Assert.assertEquals(rowCount, 45);	
	}
	@Test (priority = 2)
	public void EditCondition() throws Throwable {
		cdf.EditCondition();
		List<WebElement> totalrows = driver.findElements(By.tagName("tr"));
		int rowCount = totalrows.size();
		System.out.println("After edting the rowcount is: " + rowCount);
		Assert.assertEquals(rowCount, 45);	
	}
	@Test (priority = 3)
	public void DeleteCondition() throws Throwable {
		cdf.DeleteCondition();
		List<WebElement> totalrows = driver.findElements(By.tagName("tr"));
		int rowCount = totalrows.size();
		System.out.println("Deleted rowCount is: " + rowCount);
		Assert.assertEquals(rowCount, 44);
	}
	
	
}
