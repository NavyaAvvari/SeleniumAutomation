package com.qa.testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.FlightBookinPOM;

public class TC_Flightreservation2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		FlightBookinPOM FlightRes= new FlightBookinPOM(driver);
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		FlightRes.getUserName().sendKeys("mercury");
		FlightRes.getPassword().sendKeys("mercury");
		FlightRes.getSubmit().click();
		FlightRes.getFlightsPage().click();
		FlightRes.getpassengerCount(3);
		FlightRes.getDepartureLoc("London");
		FlightRes.getfromMonth("7");
		FlightRes.getfromDay("2");
		FlightRes.gettoPort("Frankfurt");
		FlightRes.gettoMonth("7");
		FlightRes.gettoDay("28");
		FlightRes.getbtnContinue().click();
		
	}

}
