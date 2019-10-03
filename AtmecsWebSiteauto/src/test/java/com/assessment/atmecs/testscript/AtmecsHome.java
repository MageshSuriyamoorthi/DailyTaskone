package com.assessment.atmecs.testscript;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.assessment.atmecs.pages.HomePage;
import com.assessment.atmecs.pages.Innsightpage;
import com.assessment.atmecs.pages.pageone;
import com.assessment.atmecs.testbase.BrowserInvoke;

public class AtmecsHome {
	BrowserInvoke browserobject = new BrowserInvoke();
	HomePage homeobject = new HomePage();
	pageone one = new pageone();
	Innsightpage insightobject = new Innsightpage();

	@BeforeTest
	public void browser_open() {

		browserobject.OpenBrowser();
	}

	@BeforeMethod
	public void atmecs_home() {
		homeobject.atmecshome();
	}

	@Test(priority=1)
	public void moreinfo_validation() {

		List<WebElement> list = one.getlist("locators.find.moreinfo");

		for (int index = 1; index <= list.size(); index++) {

			one.replacingtext("locators.moreinfo","*",index);
			one.titleval("title",index);
			one.breadcrumbvalidation("locator.breadcrumb.list","breadcrums",index);
			insightobject.clickonhometab();
		}
	}
}
