package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CompanyFunctionality;
import com.pageobjects.OriginalLogin;

public class CompanyTestCases extends Basetest{
	OriginalLogin ol;
	CompanyFunctionality cmp;
	public CompanyTestCases() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		cmp = new CompanyFunctionality();
	}
	@Test
	public void editCompany() throws Throwable {
		cmp.EditCompanyFunctionality();
		cmp.AssertMessage();
		
	}

}
