package com.ui.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Constants.Browser;

public abstract class BrowserUtility {//because this is parent class we need to use abstract keyword
	private WebDriver driver;
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;//this constructor is to initilize the driver
	}
	
	public BrowserUtility(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
		}
		else
		{System.err.print("Invalid Browser name");
		}
	}
	
	public BrowserUtility(Browser browserName) {
		if(browserName==Browser.CHROME) {
			driver= new ChromeDriver();
		}
		else if(browserName==Browser.EDGE) {
			driver= new EdgeDriver();
		}
		
	}
	
	public void goToWebsite(String url) {
		driver.get(url);
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void elementClick(By locator ) {
		WebElement element = driver.findElement(locator);
		element.click();
	}
	
	public void enterText(By locator, String value) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(value);
		
	}
	
public String visibleText(By locator) {
	WebElement element = driver.findElement(locator);
	return element.getText();	
	}
	

}
