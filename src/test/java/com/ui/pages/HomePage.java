package com.ui.pages;

import org.openqa.selenium.By;
import com.Constants.Browser;
import com.Constants.Environment;
import com.ui.Utility.BrowserUtility;
import com.ui.Utility.PropertiesUtility;

public final class HomePage extends BrowserUtility{
	public HomePage(Browser string) {//this is used because if its there in parent class(BrowserUtility
		 //then it should also be there in child class
		super(string);
		goToWebsite(PropertiesUtility.ReadProperty(Environment.QA, "URL"));
		maximizeWindow();

	}



	private static final By SIGN_IN_LOCATOR = By.className("login");
	 //final is  used because the locator value will never change
	 //static is used because when ever final is used we need to use static
	 //the variable is in capital because for final and static all letters should be capital
	
	public  LoginPage goToLoginPage() {//this is page funtion method and its return type will be the next 
		//method or page thats going to come after this function
		elementClick(SIGN_IN_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
		
	}
	 

}
