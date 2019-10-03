package com.assessment.atmecs.testscript;

import org.testng.annotations.Test;
import com.assessment.atmecs.pages.Innsightpage;

public class InsightScript extends Homepagescript{
	Innsightpage insightobject = new Innsightpage();

	@Test(priority = 1)
	void Insightsvalidation() {
		insightobject.clickonhometab();
		
		insightobject.blogsvalidation();
	}
}
