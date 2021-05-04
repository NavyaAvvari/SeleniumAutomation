package com.qa.testscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class firstwebdriveprogram {

	
	   public static void main(String[] args) {
		   
		   //invoke the browser
		   
		   System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		    
		   driver.get("https://www.javatpoint.com/corejava-interview-questions");
		   
		   
		   System.setProperty("webdriver.edge.driver","F:\\edgedriver_win64 (1)\\msedgedriver.exe");
		     EdgeDriver eDriver = new EdgeDriver();
		     eDriver.get("https://www.javatpoint.com/corejava-interview-questions");
		    		 eDriver.close();
	   }
}
