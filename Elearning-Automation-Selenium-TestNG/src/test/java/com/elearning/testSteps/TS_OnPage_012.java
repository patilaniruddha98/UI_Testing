package com.elearning.testSteps;

import com.elearning.pageObjects.QuestionAnswerManagementPage_012;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_012 extends BaseClass{
	
	 static QuestionAnswerManagementPage_012 k=new  QuestionAnswerManagementPage_012 (driver);
	
	public static void questionAnswerManagementPage() {
		
		k.EnterTextInQuestionBox();
		logger.info("text is entered in text box");
		
		k.switchToFrame_1();
		logger.info("switching to frame");
		
		k.enterFirstOption();
		logger.info("entered first option as selenium");
		
		k.backToMainFrame();
		logger.info("back to main frame");
		
		k.switchToFrame_2();
		logger.info("switching to frame");
		
		k.enterSecondOption();
		logger.info("enter second option as java");
		
		k.backToMainFrame();
		logger.info("back to main frame");
		
		k.switchToFrame_3();
		logger.info("switching to frame");
		
		k.enterThirdOption();
		logger.info("enter third option as C");
		
		k.backToMainFrame();
		logger.info("back to main frame");
		
		k.switchToFrame_4();
		logger.info("switching to frame");
		
		k.enterFourthOption();
		logger.info("enter fourth option as C++");
		
		k.backToMainFrame();
		logger.info("back to main frame");
		
		
		
		k.clickAddThisQuestionToTheTest();
		logger.info("clicked on Add This Question To The Test button ");
		
	}

}
