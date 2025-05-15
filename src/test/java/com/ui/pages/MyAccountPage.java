package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ui.Utility.BrowserUtility;

public class MyAccountPage extends BrowserUtility{
	private static final By CUSTOMER_ACCOUNT_NAME = By.cssSelector("a[title='View my customer account']");

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public String getUserName (By locator) {
		return  visibleText(CUSTOMER_ACCOUNT_NAME);
		}

}
