package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DescriptionPage_006 {
WebDriver ldriver;
	
	public DescriptionPage_006(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement clickDescriptionIcon;
	
	@FindBy(xpath="//input[@id='course_description_title']")
	WebElement txtTitleBox;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]")
	WebElement switchToFrame;
	
	@FindBy(xpath="/html/body")
	WebElement txtContentBox;
	
	@FindBy(id="course_description_submit")
	WebElement clickSaveButton;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[2]/img[1]")
	WebElement clickObjectiveIcon;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[3]/img[1]")
	WebElement clickTopicIcon;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/ul[1]/li[1]/a[1]")
	WebElement clickProjectNameLink;
	
	
	public void clickDescriptionIcon() {
		clickDescriptionIcon.click();
	}
	
	public void enterTextInTitleBox() {
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
		clickSaveButton.click();
	}
	
	public void clickOnObjectiveIcon() {
		clickObjectiveIcon.click();
	}
	
	public void clickOnTopicIcon() {
		clickTopicIcon.click();
	}
	
	public void clickOnProjectNameLink() {
		clickProjectNameLink.click();
	}
	
}
