package com.qa.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBy {

	WebDriver driver;
	JavascriptExecutor js;
	@Test
    public void amazonScroll() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
    	WebDriver  driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("https://www.amazon.in/");      	
        js.executeScript("window.scrollBy(0,1000)");
        
        driver.findElement(By.linkText("Careers")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        
        if(driver.getTitle().contains("jobs"));
        {
        System.out.println("title matched"); 
        
        }
    }
}