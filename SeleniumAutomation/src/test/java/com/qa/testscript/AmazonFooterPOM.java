package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonFooterPOM {
	WebDriver driver;

	public AmazonFooterPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll(@FindBy(xpath="//body[1]/div[1]/div[5]/div[4]/ul/li/a"))
	List<WebElement> countryNames;

	public List<WebElement> getCountryNames() {
		return countryNames;
	}
	
	
	

}
