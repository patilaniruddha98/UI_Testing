package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestMnagmentPage_010 {
WebDriver ldriver;
	
	public TestMnagmentPage_010(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(id="exercise_title")
	WebElement txtEnterInTestName;
	
	@FindBy(id="advanced_params")
	WebElement clickAdvanceSettingButton;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/form[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/iframe[1]")
	WebElement switchToFrame;
	
	@FindBy(xpath="/html/body")
	WebElement txtEnterInBox;
	
	@FindBy(id="exerciseType_0")
	WebElement clickRadio;
	
	@FindBy(xpath="//*[@name='activate_start_date_check']")
	WebElement checkTheBox;
	
	@FindBy(id="pass_percentage")
	WebElement enterValidMarkes;
	
	@FindBy(id="exercise_admin_submitExercise")
	WebElement clickOnProceesToQuestionButton;
	
	public void enterTestName() {
		txtEnterInTestName.sendKeys("online quize");
	}
	
	public void clickOnAdvanceSettingButton() {
		clickAdvanceSettingButton.click();
		
	}
	public void switchToFrame() {
		ldriver.switchTo().frame(switchToFrame);
	}
	public void EnterTextInContexBox() {
		txtEnterInBox.sendKeys("quize");
	}
	public void backToMainFrame() {
		ldriver.switchTo().defaultContent();
	}
	
	public void clickOnFirstRadioButton() {
		clickRadio.click();
	}
	public void ClickOnCheckBox() {
		checkTheBox.click();
	}
	public void enterValidMarksInTextBox() {
		enterValidMarkes.sendKeys("50");
	}
	
	public void clickOnProceesToQuestionButton() {
		clickOnProceesToQuestionButton.click();
	}

}
