package com.elearning.testSteps;

import com.elearning.pageObjects.OnlineQuizePage_011;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_011 extends BaseClass {
	
	static OnlineQuizePage_011 j=new OnlineQuizePage_011(driver);
	
	public static void  OnlineQuizePage_FirstArrival() {
		j.clickIOnMultipleChoiceIcon();
		logger.info("clicked on multiple choice icon");
	}
	
	public static void  OnlineQuizePage_SecondArrival() {
		j.clickOnPreviewIcon();
		logger.info("clicked on preview icon");
		
		j.clickOnStartTestButton();
		logger.info("clicked on start test button");
		
		j.checkTheFirstRadioButton();
		logger.info("clicked on first radio button");
		
		j.clickOnEndTestButton();
		logger.info("clicked on end test button");
		
	}

}
