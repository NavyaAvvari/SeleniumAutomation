package com.qa.testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Testbasegoogle {
	public class TestBase {
		WebDriver driver;
	
		
		@BeforeClass
		public void setUp(String Browser, String Url)
		{
			if(Browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			
			}
			else if 
			(Browser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver","F:\\edgedriver_win64 (1)\\msedgedriver.exe");

				driver = new EdgeDriver();
			}
			
			
			driver.get(Url);
		}
		@AfterClass
		public void tearDown()
		{
			driver.close();
		}

}
}
