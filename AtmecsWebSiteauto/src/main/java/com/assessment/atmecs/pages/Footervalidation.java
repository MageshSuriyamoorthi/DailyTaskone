
package com.assessment.atmecs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.assessment.atmecs.helper.ReadpropertiesFile;
import com.assessment.atmecs.testbase.BrowserInvoke;
import com.assessment.atmecs.utils.UtilityFiles;

public class Footervalidation {
	BrowserInvoke browserobject = new BrowserInvoke();
	UtilityFiles util = new UtilityFiles();
	public ReadpropertiesFile propertyobject = new ReadpropertiesFile();

	String actual, expected, getval, crt_locator;

	public void footercheck() {

		List<WebElement> titlelist = util.getListOfWebElement(propertyobject.getLocatorValue("locator.footer.title"));
		List<WebElement> elementlist = util
				.getListOfWebElement(propertyobject.getLocatorValue("locator.footer.elements"));

		for (int title = 1; title < titlelist.size(); title++) {
			expected = util.locateactualval("sheet3", "Title", title);
			actual = util.replacetext("locator.footer.heading", "****", expected);
			util.assertmatch(actual, actual, "verified Title");
		}
		for (int i = 1; i < elementlist.size(); i++) {
			expected = util.locateactualval("sheet3", "Elements", i);
			actual = util.replacetext("locator.footer.elements", "***", expected);
			util.assertmatch(actual, actual, "verified element");
		}

	}

}
