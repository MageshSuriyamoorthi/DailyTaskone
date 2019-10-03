package com.assessment.atmecs.pages;

import com.assessment.atmecs.helper.ReadpropertiesFile;
import com.assessment.atmecs.utils.UtilityFiles;

public class Innsightpage {
	String replace;
	UtilityFiles utilityobject = new UtilityFiles();
	public ReadpropertiesFile propertyobject = new ReadpropertiesFile();

	public void clickonhometab() {
		UtilityFiles.clickOnElement(propertyobject.getLocatorValue("locator.atmecs.hometab"));
	}

	public void blogsvalidation() {

		utilityobject.mouseHoverTotab(propertyobject.getLocatorValue("locator.insight.path"));

		utilityobject.mouseHoverTotab(propertyobject.getLocatorValue("locator.insight.blog"));

		utilityobject.ClickUsingXpath(propertyobject.getLocatorValue("locator.insight.blog"));

		for (int rowindex = 1; rowindex <= 6; rowindex++) {
			replace = utilityobject.locateactualval("Sheet2", "num", rowindex);

			utilityobject.ClickUsingXpath(
					(propertyobject.getLocatorValue("locator.footer.elements").replace("**", replace)));

			replace = utilityobject.locateactualval("Sheet2", "title", rowindex);

			UtilityFiles.isDisplayed(propertyobject.getLocatorValue("locator.blog.heading").replace("####", replace));
		}
	}
}