package com.qa.testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


@SuppressWarnings("unused")
public class TC_Flightreservation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement UserName=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		UserName.sendKeys("mercury");
		WebElement Password=driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		Password.sendKeys("mercury");
		WebElement Submit=driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/input[1]"));
		Submit.click();
		System.out.println("Successfully Logged On");
		WebElement FlightsPage=driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
		FlightsPage.click();
		System.out.println("Selected Flights Menu");
		Select passengerCount=new Select(driver.findElement(By.name("passCount")));
		passengerCount.selectByIndex(3);
		System.out.println("Selected passengers count");
		Select DepartureLoc=new Select(driver.findElement(By.name("fromPort")));
		DepartureLoc.selectByValue("London");
		System.out.println("Selected Departure Location");
		Select fromMonth=new Select(driver.findElement(By.name("fromMonth")));
		fromMonth.selectByValue("7");
		Select fromDay=new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByValue("2");
		System.out.println("Selected From Date");
		
		Select toPort=new Select(driver.findElement(By.name("toPort")));
		toPort.selectByVisibleText("Frankfurt");
		System.out.println("Selected Arriving in Location");
		Select toMonth=new Select(driver.findElement(By.name("toMonth")));
		toMonth.selectByValue("7");
		Select toDay=new Select(driver.findElement(By.name("toDay")));
		toDay.selectByValue("23");
		System.out.println("Selected To Date");
		WebElement btnContinue=driver.findElement(By.xpath("//tbody/tr[14]/td[1]/input[1]"));
		btnContinue.click();
		System.out.println("Successfully Booked Flight ticket");
		driver.quit();
		System.out.println("Browser closed");
		
		
		
		
		
	}

}
