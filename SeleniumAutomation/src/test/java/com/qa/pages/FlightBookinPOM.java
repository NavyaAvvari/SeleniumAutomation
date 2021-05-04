package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightBookinPOM {
	@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
	WebElement UserName;
	public WebElement getUserName()
	{
		return UserName;
	}
	
	@FindBy(xpath="//tbody/tr[3]/td[2]/input[1]")
	WebElement Password;
	public WebElement getPassword()
	{
		return Password;
	}
	
	@FindBy(xpath="//tbody/tr[4]/td[2]/div[1]/input[1]")
	WebElement Submit;
	public WebElement getSubmit()
	{
		return Submit;
	}
	
	@FindBy(xpath="//a[contains(text(),'Flights')]")
	WebElement FlightsPage;
	public WebElement getFlightsPage()
	{
		return FlightsPage;
	}
	
	@FindBy(name="passCount")
	WebElement passengerCount;
	
	public WebElement getpassengerCount(int index)
	{
		Select drop=new Select(passengerCount);
		drop.selectByIndex(3);
		return passengerCount;
		
	}
	
	@FindBy(name="fromPort")
	WebElement DepartureLoc;
	
	public void getDepartureLoc(String Value)
	{
		Select drop=new Select(DepartureLoc);
		drop.selectByValue("London");
	
	}
	
	@FindBy(name="fromMonth")
	WebElement fromMonth;
	
	public void getfromMonth(String Value)
	{
		Select drop=new Select(fromMonth);
		drop.selectByValue("7");
		
	}
	@FindBy(name="fromDay")
	WebElement fromDay;
	
	public void getfromDay(String Value)
	{
		Select drop=new Select(fromDay);
		drop.selectByValue("2");

	}
	
	@FindBy(name="toPort")
	WebElement toPort;
	
	public void gettoPort(String Value)
	{
		Select drop=new Select(toPort);
		drop.selectByVisibleText("Frankfurt");
		
	}
	@FindBy(name="toMonth")
	WebElement toMonth;
	
	public void gettoMonth(String Value)
	{
		Select drop=new Select(toMonth);
		drop.selectByValue("7");
	
	}
	@FindBy(name="toDay")
	WebElement toDay;
	
	public void gettoDay(String Value)
	{
		Select drop=new Select(toDay);
		drop.selectByValue("28");
		
	}
	

	@FindBy(xpath="//tbody/tr[14]/td[1]/input[1]")
	WebElement btnContinue;
	
	public WebElement getbtnContinue()
	{
		return btnContinue;
	}
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public   FlightBookinPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	

	}

}
