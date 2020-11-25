package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineQuizePage_011 {
WebDriver ldriver;
	
	public OnlineQuizePage_011(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[6]/div[1]/ul[1]/li[1]/div[1]/a[1]/img[1]")
	WebElement clickMultipleChoiceIcon;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[4]/a[2]/img[1]")
	WebElement clickOnPreview;
	
	@FindBy(xpath="//a[contains(text(),'Start test')]")
	WebElement clickOnStartTestButton;
	
	@FindBy(xpath="//input[contains(@id,'-1')]")
	WebElement checkTheFirstRadioButton;
	
	@FindBy(xpath="//button[contains(text(),'End test')]")
	WebElement clickOnEndTestButton;
	
	
	public void clickIOnMultipleChoiceIcon() {
		clickMultipleChoiceIcon.click();
	}
	
	public void clickOnPreviewIcon() {
		clickOnPreview.click();
	}
	
	public void clickOnStartTestButton() {
		clickOnStartTestButton.click();
	}
	
	public void checkTheFirstRadioButton() {
		checkTheFirstRadioButton.click();
	}
	
	public void clickOnEndTestButton() {
		clickOnEndTestButton.click();
	}

}
