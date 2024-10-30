package com.parabank.index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.parabank.base.SeleniumWrapper;

public class Login extends SeleniumWrapper{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	By userNametxt = By.xpath("//input[@name='username']");
	By passwordtxt = By.xpath("//input[@name='password']");
	By loginbtn = By.xpath("//input[@value='Log In']");
	By logoutLink = By.xpath("//a[@href='logout.htm']");
	By customerLoginlbl = By.xpath(" //h2[text()='Customer Login']");
	By userNamelbl = By.xpath("//*[@class='smallText']");
	
	public void login(String username, String password) {
		reporterLog("Login to ParaBank");
		waitforElementPresent(userNametxt,1);
		waitforElementPresent(passwordtxt,1);
		type(userNametxt, username, "User Name");
		type(passwordtxt, password, "Password");
		click(loginbtn, "Click Login");
	}

	public void logout(){
		reporterLog("Logout");
		click(logoutLink, "Logout button");
		waitforElementPresent(customerLoginlbl,1);
	}
	
	public void validateNewUser(String expectedValue) {
		reporterLog("Validate New User");
		waitforElementPresent(userNamelbl,1);
		//takeScreenshot("newUserPage2");
		getText2(userNamelbl);
	}
	
}
