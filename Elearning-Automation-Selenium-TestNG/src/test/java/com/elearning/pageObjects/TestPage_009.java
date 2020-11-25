package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage_009 {
WebDriver ldriver;
	
	public TestPage_009(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[3]/a[1]/img[1]")
	WebElement clickCreateNewTestIcon;

	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickOnSeleniumLink;
	
	
	
	
	
	
	public void clickOnCreateNewTestIcon() {
		clickCreateNewTestIcon.click();
	}
	
	public void clickOnSeleniumLink() {
		clickOnSeleniumLink.click();
	}
}
