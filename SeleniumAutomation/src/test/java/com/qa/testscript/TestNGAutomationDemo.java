package com.qa.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNGAutomationDemo {
	
	
	@Test(priority=2,groups="payment" )
	public void FundTransferBill() {
	//	System.out.println("im fund transfer method");
		Reporter.log("im fund transfer method",true);
	}

	@Test(priority=1,groups="Payment")
	public void UtilityBillPayment() {
//System.out.println("im fund transfer method");
		
		Reporter.log("im utilitybill payment method",true);
	}
	@Test(priority=3,groups="Payment")
	public void CCBillPayment() {
		//System.out.println("im CCBillPayment method");
		Reporter.log("im CcBill payment method",true);
	}

	@Test(priority=4,groups="Insurance")
	public void VehicleInsurance() {
	//	System.out.println("im Vehicle insurance  method");	
		Reporter.log("im Vehicle insurance method",true);
	}
	@Test(priority=5,groups="Insurance")
	public void MedicalInsurance() {
		// System.out.println("im Medicale  method");
		Reporter.log("im Medical method",true);
	}
	@BeforeClass
	public void Login() {
		System.out.println("Iam login method");

	}
	@AfterClass
	public void Logout() {
		System.out.println("Iam logout method");

	}

	@BeforeMethod
	public void CheckBalance() {
		System.out.println(" iam checkbalance method");

	}

	@AfterMethod
	public void Acknowledgment() {
		System.out.println(" iam acknowledgement method ");

	}

	@BeforeTest
	public void InvokeBrowser() {
		System.out.println("Launch the browser ");

	}

	@AfterTest
	public void CloseBrowser() {
		System.out.println("close the browser");
	}

}
