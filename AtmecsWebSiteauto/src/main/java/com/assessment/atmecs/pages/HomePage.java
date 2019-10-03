package com.assessment.atmecs.pages;

import java.util.concurrent.TimeUnit;

import com.assessment.atmecs.helper.ReadpropertiesFile;
import com.assessment.atmecs.testbase.BrowserInvoke;
import com.assessment.atmecs.utils.UtilityFiles;

public class HomePage extends BrowserInvoke {
	BrowserInvoke browserobject = new BrowserInvoke();
	UtilityFiles util = new UtilityFiles();
	public ReadpropertiesFile propertyobject = new ReadpropertiesFile();

	String actual, expected, getval, crt_locator;

	public void atmecshome() {
		crt_locator = propertyobject.getLocatorValue("locator.locatorname");
		util.geturl(propertyobject.getLocatorValue("locator.homepage.url"));
		util.maximize();
	}

	public void homecheck() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		util.scrolltoview(propertyobject.getLocatorValue("locator.atmecs.footer"));

	}

	public void aboutusTab() {
		util.ClickUsingXpath(propertyobject.getLocatorValue("locator.atmecs.aboutus"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		util.scrolltoview(propertyobject.getLocatorValue("locator.atmecs.footer"));

	}

	public void serviceTab() {
		util.ClickUsingXpath(propertyobject.getLocatorValue("locator.atmecs.servicetab"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		util.scrolltoview(propertyobject.getLocatorValue("locator.atmecs.footer"));

	}

	public void partnerTab() {
		util.ClickUsingXpath(propertyobject.getLocatorValue("locator.atmecs.partnertab"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		util.scrolltoview(propertyobject.getLocatorValue("locator.atmecs.footer"));

	}

	public void careersTab() {
		util.ClickUsingXpath(propertyobject.getLocatorValue("locator.atmecs.careertab"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		util.scrolltoview(propertyobject.getLocatorValue("locator.atmecs.footer"));

	}

	public void contactusTab() {
		util.ClickUsingXpath(propertyobject.getLocatorValue("locator.atmecs.contactustab"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		util.scrolltoview(propertyobject.getLocatorValue("locator.atmecs.footer"));

	}

}
