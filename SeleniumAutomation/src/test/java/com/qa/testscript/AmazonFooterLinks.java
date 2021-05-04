package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonFooterLinks extends Testbasegoogle {

	AmazonFooterPOM amazonfooter;
	@Test
	public void AmazonHome() {
		List<WebElement> countryname = amazonfooter.getCountryNames();
		for (WebElement countrynames : countryname) {
			Reporter.log(countrynames.getText() + "-" + countrynames.getAttribute("href"), true);

		}

	}
}
