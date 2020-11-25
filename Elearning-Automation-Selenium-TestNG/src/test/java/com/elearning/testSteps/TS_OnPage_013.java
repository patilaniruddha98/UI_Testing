package com.elearning.testSteps;

import com.elearning.pageObjects.AssesmentPage_13;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_013 extends BaseClass {
	
	static AssesmentPage_13 l=new AssesmentPage_13(driver);
	
	public static void assesmentPage() {
		
		l.clickOnAddOnlineActivity();
		logger.info("Clicked on add online activity	");
		
	}
	
	public static void assesmentPage_SecondArrival() {
		l.clickOnEditIcon();
		logger.info("Clicked on edit icon");
	}
	
	public static void assesmentPage_ThirdArrival() {
		l.clickOnAttachCertificateIcon();
		logger.info("Clicked on Attach Certificate Icon");
	}
	

}
