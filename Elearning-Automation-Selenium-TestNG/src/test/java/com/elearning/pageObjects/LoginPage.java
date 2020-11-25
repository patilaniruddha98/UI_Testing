package com.elearning.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="login")
	WebElement txtUserName;
	
	@FindBy(id="password")
	WebElement txtPassWord;
	
	@FindBy(id="form-login_submitAuth")
	WebElement btnLogin;
	
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pass) {
		txtPassWord.sendKeys(pass);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	

	
	
	
	
	
}
