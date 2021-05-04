package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TC_googlepages
{	WebDriver driver;


@FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
WebElement SearchBox;

public WebElement getSearchBox()
{
	return SearchBox;
}
@FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")
WebElement SearchButton;

public WebElement getSearchButtonLink()
{
	return SearchButton;
}



public TC_googlepages(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



public WebElement getSearchButtonLink1() {
	// TODO Auto-generated method stub
	return null;
}
}
