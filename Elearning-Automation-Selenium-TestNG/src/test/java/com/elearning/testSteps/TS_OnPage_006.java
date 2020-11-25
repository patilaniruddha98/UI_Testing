package com.elearning.testSteps;

import com.elearning.pageObjects.DescriptionPage_006;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_006 extends BaseClass{
	static DescriptionPage_006 e=new DescriptionPage_006(driver);
	public static void DescriptionPage_FirstArrival() {
		
		e.clickDescriptionIcon();
		logger.info("clicked on Description Icon");
		e.enterTextInTitleBox();
		logger.info("text is entered in title box");
		e.switchToFrame();
		e.entertextToContentBox();
		logger.info("text entered in content box");
		e.backToMainFrame();
		e.clickOnSaveButton();
		logger.info("clicked on save button");
		e.clickOnObjectiveIcon();
		logger.info("clicked on objective icon");
	}
	
	public static void DescriptionPage_SecondArrival() {
		e.clickOnTopicIcon();
		logger.info("clicked on TopicIcon");
	}
	
	public static void DescriptionPage_ThirdArrival() {
		e.clickOnProjectNameLink();
		logger.info("clicked on project name and present on course page");
		
	}

}
