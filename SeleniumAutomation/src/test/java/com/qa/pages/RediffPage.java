package com.qa.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPage {

	// create Account
	@FindBy(linkText = "Create Account")
	WebElement CreateAccountlink;
	public WebDriver driver;

	public RediffPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getcreateAccount() {
		return CreateAccountlink;
	}

	@FindBy(xpath = "/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")
	WebElement FullNameTextFild;

	public WebElement getFullNameTextFild() {
		return FullNameTextFild;
	}

	@FindBy(xpath = "/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")
	WebElement EmailIdTextFild;

	public WebElement getEmailIdTextFild() {
		return EmailIdTextFild;
	}

	@FindBy(className = "btn_checkavail")
	WebElement CheckAvailabilityBtn;

	public WebElement getCheckAvailabilityBtn() {
		return CheckAvailabilityBtn;
	}

}
