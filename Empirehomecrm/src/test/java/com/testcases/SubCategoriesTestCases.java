package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.OriginalLogin;
import com.pageobjects.SubCategoriesFunctionality;

public class SubCategoriesTestCases extends Basetest {
	OriginalLogin ol;
	SubCategoriesFunctionality scf;
	public SubCategoriesTestCases() {
		super();
	}
	@BeforeMethod
	public void Setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		scf = new SubCategoriesFunctionality();
	}
	@Test
	public void SubCategoriesFunctionalityValidation() throws Throwable {
		scf.VerifySubCategoriesFunctionality();
		List<WebElement> rows =  driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);
		Assert.assertEquals(rowCount, 8);
		
	}
	

}
