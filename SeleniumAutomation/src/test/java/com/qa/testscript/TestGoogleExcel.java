package com.qa.testscript;

import java.io.IOException;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TestGoogleExcel extends TestBase {

	private String Sheet1;

	@Test(dataProvider = "getData")
	public void SearchItem(String Input) throws InterruptedException {
		
	
		GoogleOR.getSearchBox().clear();
		GoogleOR.getSearchBox().sendKeys(Input);
		Thread.sleep(2000);
		
		GoogleOR.getSearchBox().submit();

		boolean Title = driver.getTitle().contains(Input);
		SAssert.assertTrue(Title);
	}

	@DataProvider
	public String[][] getData() throws IOException {
		String xlPath =" D:\\eclipse workspace\\SeleniumAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
		String xlSheet = Sheet1;

		int rowCount = ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++)

			{
				data[i - 1][j] = ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}
		return data;
	}

}
