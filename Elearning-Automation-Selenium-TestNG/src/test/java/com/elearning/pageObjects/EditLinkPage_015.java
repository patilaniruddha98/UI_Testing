package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditLinkPage_015 {

	
	WebDriver ldriver;

	public EditLinkPage_015(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="weight_mask")
	WebElement txtInWeightageBox;
	
	@FindBy(id="edit_link_form_submit")
	WebElement clickOnEditLinkButton;
	
	
	public void EnterInWeightBox() {
		txtInWeightageBox.sendKeys("1");
	}
	
	public void clickOnEditLinkButton() {
		clickOnEditLinkButton.click();
	}
}
