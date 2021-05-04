package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.TC_googlepages;

public class TC_searchforautomationtesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open browser
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		@SuppressWarnings("unused")
		TC_googlepages gp = new TC_googlepages(driver);
		//launch google URL
		driver.get("https://www.google.com/");
		
		//search for automation
		WebElement query= driver.findElement(By.name("q"));
		
		//enter text with sendKeys() then apply submit()
		query.sendKeys("Automation testing");
		query.submit();
		String title = driver.getTitle();
		{
			if(title.contains("Automation testing - Google Search"))
				System.out.println("title is same as search item");
				else
					System.out.println("title is not same as search item ");

		}
		driver.close();

	}

}
