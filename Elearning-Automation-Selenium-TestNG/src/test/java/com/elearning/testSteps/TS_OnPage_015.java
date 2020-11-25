package com.elearning.testSteps;

import com.elearning.pageObjects.EditLinkPage_015;
import com.elearning.testCases.BaseClass;

public class TS_OnPage_015 extends BaseClass{
	static EditLinkPage_015 n=new EditLinkPage_015(driver);
	
	public static void editLinkPage() {
		n.EnterInWeightBox();
		logger.info("Enter Credential in weight box");
		
		n.clickOnEditLinkButton();
		logger.info("clicked on edit link button");
	}

}
