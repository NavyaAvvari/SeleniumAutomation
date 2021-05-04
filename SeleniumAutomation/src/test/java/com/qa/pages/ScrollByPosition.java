package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollByPosition {

	WebDriver driver;
	Actions act;
	JavascriptExecutor js;

	@BeforeClass
	public void Setup() {
		{
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			act = new Actions(driver);
			js=((JavascriptExecutor)driver);
			driver.get("https://www.amazon.in/");

		}

	}

	@AfterClass
	public void TearDown() {
		driver.close();
	}

	@Test
	public void scrollBy() throws InterruptedException {

		for (int i = 0; i <= 5; i++) {
			js.executeScript("window.scrollBy(0,500)");
		}
Thread.sleep(3000);
		for (int i = 0; i <= 5; i++) {
			js.executeScript("window.scrollBy(0,-500)");
		}
	}
}
