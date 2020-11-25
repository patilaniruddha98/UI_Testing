package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionAnswerManagementPage_012 {

	WebDriver ldriver;

	public QuestionAnswerManagementPage_012(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "question_admin_form_questionName")
	WebElement txtInQuestionBox;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/div[1]/iframe[1]")
	WebElement switchToFrame1;

	@FindBy(xpath = "/html/body")
	WebElement enterFirstOption;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/div[1]/iframe[1]")
	WebElement switchToFrame2;

	@FindBy(xpath = "/html/body")
	WebElement enterSecondOption;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/div[1]/div[1]/iframe[1]")
	WebElement switchToFrame3;

	@FindBy(xpath = "/html/body")
	WebElement enterThirdOption;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/form[1]/fieldset[1]/table[1]/tbody[1]/tr[4]/td[3]/div[1]/div[1]/div[1]/iframe[1]")
	WebElement switchToFrame4;

	@FindBy(xpath = "/html/body")
	WebElement enterFourthOption;

	
	
	@FindBy(id="submit-question")
	WebElement clickAddThisQuestionToTheTest;
	

	public void EnterTextInQuestionBox() {
		txtInQuestionBox.sendKeys("which course you are learning ?");
	}

	public void switchToFrame_1() {
		ldriver.switchTo().frame(switchToFrame1);
	}

	public void enterFirstOption() {
		enterFirstOption.sendKeys("selenium");
	}

	public void backToMainFrame() {
		ldriver.switchTo().defaultContent();
	}

	public void switchToFrame_2() {
		ldriver.switchTo().frame(switchToFrame2);
	}

	public void enterSecondOption() {
		enterSecondOption.sendKeys("java");
	}

	public void switchToFrame_3() {
		ldriver.switchTo().frame(switchToFrame3);
	}

	public void enterThirdOption() {
		enterThirdOption.sendKeys("C");
	}

	public void switchToFrame_4() {
		ldriver.switchTo().frame(switchToFrame4);
	}

	public void enterFourthOption() {
		enterFourthOption.sendKeys("C++");
	}
	
	
	
	public void clickAddThisQuestionToTheTest() {
		clickAddThisQuestionToTheTest.click();
	}

}
