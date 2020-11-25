package com.elearning.testSteps;

import com.elearning.pageObjects.AddOnlineActivity_014;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_014 extends BaseClass {
	static AddOnlineActivity_014 m=new AddOnlineActivity_014(driver);
	
	public static void AddOnlineActivity() {
		
		m.clickOnDropDownMenu();
		logger.info("Clicked on drop down menu");
		
		m.clickOnTestOption();
		logger.info("Clicked on test");
		
		m.clickOnActivityDropDown();
		logger.info("Clicked on activity dropdown menu	");
		
		m.clickOnOnlineQuize();
		logger.info("Clicked on online quize	");
		
		m.clickOnAddThisLearningActivityToTheAssesment();
		logger.info("clicked On Add This Learning Activity To The Assesment button");
	}
}
