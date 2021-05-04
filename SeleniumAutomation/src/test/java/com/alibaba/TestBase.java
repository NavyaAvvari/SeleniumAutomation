package com.alibaba;

import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;




public class TestBase {
	WebDriver driver;
	Ali_Pages ap;
	Actions action;
	
	
	SoftAssert SAssert;
	

	@Parameters({ "Url"})
	@BeforeClass
	
	public void setUp(String Url) {
	 {
		 System.setProperty("webdriver.edge.driver","F:\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		ap=new Ali_Pages(driver);
		action=new Actions(driver);
		driver.get(Url);
		SAssert = new SoftAssert();
	 }
		
	}



}
