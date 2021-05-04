package com.qa.testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.TC_googlepages;


public class TC_Googlesearch {
	public static void main(String[] args)
	{
		String SearchString="Automation Testing";
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();		
		TC_googlepages googlesearch=new TC_googlepages(driver);
		
		driver.get("https://www.google.com/");
		
		googlesearch.getSearchBox().sendKeys(SearchString);
		googlesearch.getSearchButtonLink().click();
		
		String ActualTitle=driver.getTitle();		
		System.out.println("Search string is: "+SearchString);	
		System.out.println("ActualTitle  string is: "+ActualTitle);	
		
		
		
		if(SearchString.equals(ActualTitle))
		{
			System.out.println("Search string and Actual Titles are same");	
		}
		else
		{
			System.out.println("Search string and Actual Titles are Not same");
		}
		
		driver.quit();
	}

}
