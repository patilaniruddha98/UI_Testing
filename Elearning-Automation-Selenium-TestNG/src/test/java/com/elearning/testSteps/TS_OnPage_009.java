package com.elearning.testSteps;

import com.elearning.pageObjects.TestPage_009;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_009 extends BaseClass{
	static TestPage_009 h=new TestPage_009(driver);
	public static void testPage() {
		h.clickOnCreateNewTestIcon();
		logger.info("clicked on create new test icon");
	}
	
	public static void testPage_SecondArrival() {
		h.clickOnSeleniumLink();
		logger.info("clicked on selenium link");
		
	}
	
	
}
