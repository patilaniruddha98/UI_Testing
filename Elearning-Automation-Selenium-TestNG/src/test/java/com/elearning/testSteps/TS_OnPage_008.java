package com.elearning.testSteps;

import com.elearning.pageObjects.TopicPage_008;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_008 extends BaseClass{
	public static void topicPage() {
TopicPage_008 g=new TopicPage_008(driver);
		
		g.enterTxtInTitleBox();
		logger.info("text is entered in title box");
		g.switchToFrame();
		g.entertextToContentBox();
		logger.info("text is entered in title box");
		g.backToMainFrame();
		g.clickOnSaveButton();
		logger.info("clicked on save button");
		
	}

}
