package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_CategoryListBox {
	

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement dropdown =driver.findElement(By.id("searchDropdownBox"));
		Select list =new Select(dropdown);
		List <WebElement> dropdown_list=list.getOptions();
		
		System.out.println("The total number of items in Category List box are :"+dropdown_list.size());
		
		for(int i=0;i<dropdown_list.size();i++)
		{
			String dropdown_value=dropdown_list.get(i).getText();
			System.out.println("droopdown values :  "+(i+1)+"."+dropdown_value);
		}
		
		

	}

}
