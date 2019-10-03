package com.assessment.atmecs.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.assessment.atmecs.pages.Footervalidation;
import com.assessment.atmecs.pages.HomePage;
import com.assessment.atmecs.reports.ExtentReport;
import com.assessment.atmecs.testbase.BrowserInvoke;

public class Homepagescript {
	BrowserInvoke browserobject = new BrowserInvoke();
	HomePage homeobject = new HomePage();
	Footervalidation footerval = new Footervalidation();

	@BeforeMethod
	public void openBrowser() {
		browserobject.OpenBrowser();
	}

	@BeforeMethod
	public void geturl() {
		homeobject.atmecshome();
	}

	@Test
	public void home() {

		homeobject.homecheck();
		footerval.footercheck();

		homeobject.aboutusTab();
		footerval.footercheck();

		homeobject.careersTab();
		footerval.footercheck();

		homeobject.contactusTab();
		footerval.footercheck();

	}

	@AfterMethod
	public void extendreport() {
		ExtentReport.reportLog("Atmecs website", "validation details");
	}

	@AfterTest
	public void closebrowser() {
		browserobject.BrowserClose();
	}
}
