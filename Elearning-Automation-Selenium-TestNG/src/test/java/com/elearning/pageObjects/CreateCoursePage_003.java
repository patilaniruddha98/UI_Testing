package com.elearning.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateCoursePage_003 {
WebDriver ldriver;

	
	public CreateCoursePage_003(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	
	@FindBy(xpath="//input[@id='update_course_title']")
	WebElement txtCourseName;
	
	@FindBy(id="visual_code")
	WebElement txtCode;
	
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/form[1]/fieldset[1]/div[3]/div[1]/div[1]/button[1]/div[1]/div[1]")
	WebElement clickCatogoryListBox;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/form[1]/fieldset[1]/div[7]/div[1]/div[1]/button[1]/span[1]/span[1]")
	WebElement LanguagetBox;
	
	@FindBy(xpath="//span[contains(text(),'English')]")
	WebElement clickEnglish;
	
	@FindBy(id="update_course_submit")
	WebElement clickCreateCourse;
	
	
	@FindBy(xpath="//a[contains(text(),'My courses')]")
	WebElement clickMyCourses;
	
	
	
	
	
	
	public void enterCourseName() {
		txtCourseName.sendKeys("selenium");
	}
	
	
	public void enterCode() {
		txtCode.sendKeys("sel");
	}
	
	
	public void clickCatogoryListBox() {
		clickCatogoryListBox.click();
		Actions act= new Actions(ldriver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickLanguageBox() {
		LanguagetBox.click();
		
	}
	
	public void clickEnglish() {
		clickEnglish.click();
	}
	
	public void scrollDown() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	}
	
	public void clickCreateCourse() {
		clickCreateCourse.click();
	}
	
	public void clickMyCourses() {
		clickMyCourses.click();	
	}
	
}
