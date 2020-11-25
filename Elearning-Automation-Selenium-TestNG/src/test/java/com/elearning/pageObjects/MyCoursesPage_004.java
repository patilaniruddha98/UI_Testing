package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCoursesPage_004 {
	
WebDriver ldriver;
	
	public MyCoursesPage_004(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h4[1]/a[1]")
	WebElement clickSeleniumLink;
	
	
	
	public void clickOnSeleniumLink() {
		clickSeleniumLink.click();
		
	}

}
