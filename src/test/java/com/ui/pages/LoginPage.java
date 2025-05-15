package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.Utility.BrowserUtility;

public class LoginPage extends BrowserUtility {
	private static  final By EMAIL_FIELD = By.id("email");
	private static  final By PASSWORD_FIELD = By.id("passwd");
	private static  final By SUBMIT_BUTTON = By.cssSelector("button[id='SubmitLogin'] span");


	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public MyAccountPage doLoginWith(String emailId , String password) {
		enterText(EMAIL_FIELD,emailId);
		enterText(PASSWORD_FIELD,password);
		elementClick(SUBMIT_BUTTON);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());//because from this function the screen navigates to my account page
		return myAccountPage;
	}

}
