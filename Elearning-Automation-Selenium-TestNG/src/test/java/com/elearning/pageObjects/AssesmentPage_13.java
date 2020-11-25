package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssesmentPage_13 {
	
	WebDriver ldriver;

	public AssesmentPage_13(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/a[2]/img[1]")
	WebElement clickOnAddOnlineActivity;
	
	@FindBy(xpath="//tbody/tr[6]/td[6]/a[1]/img[1]")
	WebElement clickOnEditIcon;
	
	@FindBy(xpath="//body/main[@id='main']/section[@id='cm-content']/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/a[2]/img[1]")
	WebElement clickOnAttachCertificateIcon;
	
	
	public void clickOnAddOnlineActivity() {
		clickOnAddOnlineActivity.click();
	}
	
	public void clickOnEditIcon() {
		clickOnEditIcon.click();
	}
	
	public void clickOnAttachCertificateIcon() {
		clickOnAttachCertificateIcon.click();
	}
	
	

}
