package com.ui.test;

import static com.Constants.Browser.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest3 {
	HomePage homePage;
	
	@BeforeMethod(description="Open the Browser and load the homepage")
public void browserSetup() {
	 homePage = new HomePage(CHROME);	
}
	
	@Test(description= "Verifies to login with valid login credentials", groups={"e2e","Sanity"})
	public void loginTest(){
		Assert.assertEquals(homePage.goToLoginPage().doLoginWith("pacec60862@bamsrad.com", "Passwordforme").getUserName(null), "Sandeep C");

	}
}
