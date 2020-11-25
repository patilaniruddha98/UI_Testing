package com.elearning.testSteps;

import com.elearning.pageObjects.CreateCoursePage_003;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_003 extends BaseClass {	
		public static void 	createCoursePage() throws InterruptedException {
			CreateCoursePage_003 b=new CreateCoursePage_003(driver);
			b.enterCourseName();
			logger.info("Course name is entered");
			b.enterCode();
			logger.info("code is entered");
			b.clickCatogoryListBox();
			logger.info("select project from dropdown menu");
			b.clickLanguageBox();
			b.clickEnglish();
			logger.info("select English from dropdown menu");
			b.scrollDown();
			b.clickCreateCourse();
			logger.info("clicked on create course");
			b.clickMyCourses();
			logger.info("clicked on my courses");
		}
}
