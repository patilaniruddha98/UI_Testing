package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministartionPage_002 {
WebDriver ldriver;
	
	public AdministartionPage_002(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	WebElement createCourse;
	
	
	
	
	
	public void clickcreateCourse() {
		createCourse.click();
	}
	

}
