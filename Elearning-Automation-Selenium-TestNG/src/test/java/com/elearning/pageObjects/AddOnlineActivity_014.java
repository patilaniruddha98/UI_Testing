package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOnlineActivity_014 {
	
WebDriver ldriver;
	
	public AddOnlineActivity_014(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/button[1]/div[1]")
	WebElement clickOnDropDownMenu;
	
	@FindBy(xpath="//span[contains(text(),'Tests')]")
	WebElement clickOnTestOption;
	
	@FindBy(xpath="//div[contains(text(),'Seleniumbatch22')]")
	WebElement clickOnActivityDropDown;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/form[2]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")
	WebElement clickOnOnlineQuize;
	
	@FindBy(xpath="//button[@id='add_link_submit']")
	WebElement clickOnAddThisLearningActivityToTheAssesment;
	
	public void clickOnDropDownMenu() {
		clickOnDropDownMenu.click();
	}
	
	public void clickOnTestOption() {
		clickOnTestOption.click();
	}
	
	public void clickOnActivityDropDown() {
		clickOnActivityDropDown.click();
	}
	
	public void clickOnOnlineQuize() {
		clickOnOnlineQuize.click();
	}
	
	public void clickOnAddThisLearningActivityToTheAssesment() {
		clickOnAddThisLearningActivityToTheAssesment.click();
	}

}
