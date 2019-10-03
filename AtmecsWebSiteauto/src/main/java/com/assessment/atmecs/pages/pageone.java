package com.assessment.atmecs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.assessment.atmecs.helper.ReadpropertiesFile;
import com.assessment.atmecs.testbase.BrowserInvoke;
import com.assessment.atmecs.utils.UtilityFiles;

public class pageone {
	BrowserInvoke browserobject = new BrowserInvoke();
	UtilityFiles commonutils = new UtilityFiles();
	public ReadpropertiesFile propertyobject = new ReadpropertiesFile();

	String newlocator, actualtitle, expectedtitle, actualtexttovalidate, expectedtexttovalidate;

	public List<WebElement> getlist(String locator) {
		List<WebElement> moreinfopages = commonutils
				.getListOfWebElement(propertyobject.getLocatorValue(locator));
		
		return moreinfopages;

	}

	public String replacingtext(String locator,String symbol,int index) {

		newlocator = commonutils.getnewlocator(locator, symbol, String.valueOf(index));

		commonutils.scrolltoview(newlocator);

		commonutils.ClickUsingXpath(newlocator);

		return newlocator;

	}

	public void titleval(String sheetname,int index) {

		actualtitle = commonutils.gettitle();

		expectedtitle = commonutils.locateactualval("Sheet2",sheetname, index);

		commonutils.assertequals(actualtitle, expectedtitle, "Title validated");

	}

	public void breadcrumbvalidation(String locator,String sheetname,int index) {
		expectedtexttovalidate = commonutils.locategettext(propertyobject.getLocatorValue(locator));

		actualtexttovalidate = commonutils.locateactualval("Sheet2", sheetname, index);

		commonutils.assertequals(actualtexttovalidate, expectedtexttovalidate, "Breadcrum validated");

	}
	public void subtiteval(String locator,String sheetname,int index) {
		actualtitle = commonutils.locategettext(propertyobject.getLocatorValue(locator));

		expectedtitle = commonutils.locateactualval("Sheet2",sheetname, index);

		commonutils.assertequals(actualtitle, expectedtitle, "Sub-Title validated");

	}
}
