package com.elearning.testSteps;


import com.elearning.pageObjects.AdministartionPage_002;
import com.elearning.testCases.BaseClass;


public class TS_OnPage_002 extends BaseClass {
	
	public static void administrationPage() {
		AdministartionPage_002 a = new AdministartionPage_002(driver);
		a.clickcreateCourse();
		logger.info("clicked on create a course link");
	}

}
