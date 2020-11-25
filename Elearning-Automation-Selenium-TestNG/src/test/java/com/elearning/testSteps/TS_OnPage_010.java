package com.elearning.testSteps;

import com.elearning.pageObjects.TestMnagmentPage_010;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_010 extends BaseClass {
	static TestMnagmentPage_010 i=new TestMnagmentPage_010(driver);
	public static void testManagmentPage() {
		i.enterTestName();
		logger.info("test name is entered");
		
		i.clickOnAdvanceSettingButton();
		logger.info("clicked on advance setting button");
		
		i.switchToFrame();
		logger.info("switch to frame");
		
		i.EnterTextInContexBox();
		logger.info("texed is entered intp content box");
		
		i.backToMainFrame();
		logger.info("switch to main frame");
		
		i.clickOnFirstRadioButton();
		logger.info("clicked on radio button");
		
		i.ClickOnCheckBox();
		logger.info("clicked on check box");
		
		i.enterValidMarksInTextBox();
		logger.info("valid marks is enter in the text box");
		
		i.clickOnProceesToQuestionButton();
		logger.info("clicked on Procees To Question Button");
		
	}
	

}
