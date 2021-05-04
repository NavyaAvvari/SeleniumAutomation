package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_navigatetorediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*open browser*/
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*launch the browser*/
		driver.get("https://www.rediff.com/");
		
	    /*get and print the title of the home page*/
		String title = driver.getTitle();
		System.out.println(title);
		
		/*click on sign in*/
		driver.findElement(By.className("signin")).click();
		
		/*get & print the title of the login page*/
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		/*go back to the previous page using navigate method*/
		driver.navigate().back();
		
		/*get the title & check if it same as home page*/
		String etitle=driver.getTitle();
		if(title.equals(etitle)) 
			System.out.println("the title is same as homepage");
		
		else
			 System.out.println("title is not as homepage");
		

	driver.navigate().forward();
	String p= driver.getTitle();
	if(p.equals(title1))
		System.out.println("working");
	else
		System.out.println("not working");
		driver.close();
	}


}