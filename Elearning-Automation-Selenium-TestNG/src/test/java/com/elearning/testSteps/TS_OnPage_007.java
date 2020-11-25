package com.elearning.testSteps;

import com.elearning.pageObjects.ObjectivePage_007;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_007 extends BaseClass {
	public static void ObjectivePage() {
		ObjectivePage_007 f = new ObjectivePage_007(driver);
		f.enterTxtInTitleBox();
		logger.info("text is entered in title box");
		f.switchToFrame();
		f.entertextToContentBox();
		logger.info("text is entered in title box");
		f.backToMainFrame();
		f.clickOnSaveButton();
		logger.info("clicked on save button");

	}
}
