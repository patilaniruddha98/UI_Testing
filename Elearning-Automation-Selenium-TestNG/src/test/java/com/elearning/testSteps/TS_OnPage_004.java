package com.elearning.testSteps;

import com.elearning.pageObjects.MyCoursesPage_004;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_004 extends BaseClass {
	public static void myCoursesPage() {
		MyCoursesPage_004 c=new MyCoursesPage_004(driver);
		c.clickOnSeleniumLink();
		logger.info("clicked on selenium course link ");
	}
}
