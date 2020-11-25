package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectivePage_007 {

	WebDriver ldriver;
	
	public ObjectivePage_007(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="course_description_title")
	WebElement txtTitleBox;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]")
	WebElement switchToFrame;
	
	@FindBy(xpath="/html/body")
	WebElement txtContentBox;
	
	@FindBy(id="course_description_submit")
	WebElement clickSaveButton1;
	
	@FindBy(id="course_description_submit")
	WebElement clickSaveButton;
	
	public void enterTxtInTitleBox() {
		txtTitleBox.sendKeys("selenium course for beginners");
	}
	
	public void switchToFrame() {
		ldriver.switchTo().frame(switchToFrame);
	}
	
	public void entertextToContentBox() {
		txtContentBox.sendKeys("selenium course for beginners");
	}
	
	public void backToMainFrame() {
		ldriver.switchTo().defaultContent();
	}
	
	public void clickOnSaveButton() {
		clickSaveButton1.click();
	}
}
