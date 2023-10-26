package com.testcases;

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
	}
	

}
