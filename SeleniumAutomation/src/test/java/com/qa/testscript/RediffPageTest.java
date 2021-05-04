package com.qa.testscript;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.RediffPage;

public class RediffPageTest  {
public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

RediffPage obj=new RediffPage(driver);
driver.get("https://www.rediff.com/");
obj.getcreateAccount().click();
obj.getFullNameTextFild().sendKeys("kimsmith");
obj.getEmailIdTextFild().sendKeys("smith1234");
obj.getCheckAvailabilityBtn().click();
System.out.println("success");
     
}

}