package com.utils;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class Utils {
	
	public static String[][] Customerdata(String sheetname) throws Throwable {
		File file = new File("./src/main/java/com/testdata/EHcredentials2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(1).getLastCellNum();
		
		String[][] data = new String[rows-1][cells];
		
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<cells;j++) {
				DataFormatter df = new DataFormatter();
				
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		return data;
		
	}
public static void actions(WebDriver driver, WebElement element) {
	Actions ac = new Actions(driver);
	ac.moveToElement(element).click().perform();
}
//public static void scroll(driver) {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,250)");
//	
//}
public static void dropdowns(WebElement value, int index) {
	Select sc = new Select(value);
	sc.selectByIndex(index);
}
public static void am() throws Throwable {
	Robot rt = new Robot();
	rt.keyPress(KeyEvent.VK_A);
	rt.keyRelease(KeyEvent.VK_A);
}
public static void pm() throws Throwable {
	Robot rt = new Robot();
	rt.keyPress(KeyEvent.VK_P);
	rt.keyRelease(KeyEvent.VK_P);
}
 
}
