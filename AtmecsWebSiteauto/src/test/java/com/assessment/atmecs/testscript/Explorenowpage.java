package com.assessment.atmecs.testscript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.assessment.atmecs.pages.HomePage;
import com.assessment.atmecs.pages.Innsightpage;
import com.assessment.atmecs.pages.pageone;
import com.assessment.atmecs.pages.pagetwo;
//import com.assessment.atmecs.reports.ExtentReport;
import com.assessment.atmecs.testbase.BrowserInvoke;

public class Explorenowpage {
	BrowserInvoke browserobject = new BrowserInvoke();
	HomePage homeobject = new HomePage();
	int index = 1;
	pagetwo two = new pagetwo();
	pageone one=new pageone();
	Innsightpage insightobject = new Innsightpage();

	@Test
	public void explorenow_validation() {
		two.clickexplore("locator.explorenow.button");

		one.breadcrumbvalidation("locator.breadcrumb.list", "bread", index);

		insightobject.clickonhometab();
	}

	@AfterMethod
	public void extend_report() {
		//ExtentReport.reportLog("Atmecs website", "validation Report");
	}

	@AfterTest
	public void close_Browser() {
		browserobject.BrowserClose();
	}

}
































/*
 * List<WebElement> list = one.getlist("locator.services.getelement");
 * 
 * for (int index = 1; index <= list.size(); index++) {
 * 
 * two.serviceelements_validate("locator.services.heading", "@@@", index);
 * 
 * two.breadcrumbvalidation("locator.breadcrumb.list", index); }
 */
