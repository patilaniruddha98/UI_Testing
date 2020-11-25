package com.elearning.testSteps;

import org.testng.Assert;

import com.elearning.pageObjects.SelectedCoursePage_005;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_005 extends BaseClass{
	static SelectedCoursePage_005 d=new SelectedCoursePage_005(driver);
	public static void  selectedCoursePage() throws InterruptedException {
		
		String title2=driver.getTitle();
		if(title2.equals("e Learning - My education - Selenium")) {
			Assert.assertTrue(true);
			logger.info(title2);
		}
		d.clickOnIntroductionTextIcon();
		logger.info("clicked on introduction text icon");
		Thread.sleep(10000);
		d.switchToFrame();
		d.enterIntro();
		logger.info("introduction has been entered");
		d.backToMainFrame();	
		d.clickSaveIntoText();
		logger.info("clicked on 'save intro text'");
		d.clickCourseDiscriptionIcon();
		logger.info("clicked on course description icon");
	}
	
	public static void selectedCoursePage_SecondArrival() {
		d.clickOnTestIcon();
		logger.info("clicked on test icon");
	}
	
	public static void selectedCoursePage_ThirdArrival() {
		d.clickOnAssesmentIcon();
		logger.info("clicked on Assesment icon");
		
	}

}
