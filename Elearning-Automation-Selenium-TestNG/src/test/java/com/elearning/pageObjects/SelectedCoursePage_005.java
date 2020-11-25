package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedCoursePage_005 {
	
WebDriver ldriver;
	
	public SelectedCoursePage_005(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/a[1]/em[1]")
	WebElement clickOnIntroductionTextIcon;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/iframe[1]")
	WebElement switchFrame;
	
	@FindBy(xpath="/html/body")
	WebElement txtIntro;
	
	@FindBy(id="introduction_text_intro_cmdUpdate")
	WebElement clickSaveIntoText;
	
	@FindBy(id="toolimage_769")
	WebElement clickCourseDiscriptionIcon;
	
	@FindBy(id="toolimage_774")
	WebElement clickTestIcon;
	
	@FindBy(linkText="Assessments")
	WebElement clickOnAssesmentIcon;
	
	public void clickOnIntroductionTextIcon() {
		clickOnIntroductionTextIcon.click();
	}
	
	public void switchToFrame() {
		ldriver.switchTo().frame(switchFrame);
	}
	
	public void enterIntro() {
		txtIntro.sendKeys("this is an selenium course");
	}
	
	public void backToMainFrame() {
		ldriver.switchTo().defaultContent();
	}
	
	public void clickSaveIntoText() {
		clickSaveIntoText.click();
	}
	
	public void clickCourseDiscriptionIcon() {
		clickCourseDiscriptionIcon.click();
	}
	
	public void clickOnTestIcon() {
		clickTestIcon.click();
	}
	
	public void clickOnAssesmentIcon() {
		clickOnAssesmentIcon.click();
	}
	
}
