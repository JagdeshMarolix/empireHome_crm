package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CategoriesFunctionality;
import com.pageobjects.OriginalLogin;

public class CategoriesTestCases extends Basetest {
	OriginalLogin ol;
	CategoriesFunctionality ctf;
	public CategoriesTestCases() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		ol = new OriginalLogin();
		ol.OriginalLoginValidation();
		ctf = new CategoriesFunctionality();
		
	}
	@Test
	public void CategoriesFunctionalityValidation () throws Throwable {
		ctf.VerifyCategories();
		
		List<WebElement>rows = driver.findElements(By.xpath("//table//tr"));
		int rowCount = rows.size();
		Assert.assertEquals(rowCount, 24, "the count doesn't match");
		System.out.println(rowCount);
//		for(WebElement cellData : rows) {
//			
////			String Content = cellData.getText();
////			System.out.println(Content);
////			if(Content.contains("MERN FULLSTACK")) {
////				System.out.println("is present");
////				break;
////			}
//			int rowCount = Content.length();
//			Assert.assertEquals(rowCount, 23, "the count doesn't match");
//				
//		}
		
		
		
	}

}
