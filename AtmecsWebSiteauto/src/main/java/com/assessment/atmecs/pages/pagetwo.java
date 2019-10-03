package com.assessment.atmecs.pages;

import com.assessment.atmecs.helper.ReadpropertiesFile;
import com.assessment.atmecs.testbase.BrowserInvoke;
import com.assessment.atmecs.utils.UtilityFiles;

public class pagetwo {
	BrowserInvoke browserobject = new BrowserInvoke();
	UtilityFiles commonutils = new UtilityFiles();
	pageone one = new pageone();
	public ReadpropertiesFile propertyobject = new ReadpropertiesFile();

	public void clickexplore(String locator) {
		UtilityFiles.clickOnElement(propertyobject.getLocatorValue(locator));
	}

	public void toservices() {

		commonutils.ClickUsingXpath(propertyobject.getLocatorValue("locator.atmecs.servicetab"));
	}

	public void serviceelements_validate(String locator, String symbol, int index) {

		commonutils.getnewlocator("locator.services.button", symbol, String.valueOf(index));

		one.subtiteval(locator, "services", index);

	}

	public void breadcrumbvalidation(String locator, int index) {

		one.breadcrumbvalidation("locator.breadcrumb.list", "breadcrumfor_services", index);
	}
}
/*
 * String serviceElements = commonutils.getnewlocator(locator, symbol,
 * String.valueOf(index));
 * 
 * String servicesubtitle = commonutils.locategettext(serviceElements);
 * 
 * commonutils.assertequals(serviceElements, servicesubtitle,
 * "validation done");
 */