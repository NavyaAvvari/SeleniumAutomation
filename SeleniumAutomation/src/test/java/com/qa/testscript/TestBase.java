package com.qa.testscript;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;



public class TestBase {
	
	WebDriver driver;
	
	
	AmazonFooterPOM amazonfooter;
	GoogleExcelPage GoogleOR;
	SoftAssert SAssert;
	
	@Parameters({"Url"})
	
	@BeforeClass
	public void setup(String Url)
	{
	
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	
	
	

	amazonfooter=new AmazonFooterPOM(driver);
	SAssert = new SoftAssert();
	driver.get(Url);
	
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	

}
