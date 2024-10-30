package com.parabank.index;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.parabank.base.SeleniumWrapper;

public class Register extends SeleniumWrapper{

	/*
	 * 
	 */
	public Register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By registerlink = By.xpath(" //a[contains(@href,'register')]");
	By firstNametxt = By.xpath("//input[@id='customer.firstName']");
	By lastNametxt = By.xpath("//input[@id='customer.lastName']");
	By signUplbl = By.xpath("//h1[text()='Signing up is easy!']");
	By streettxt = By.xpath("//input[@id='customer.address.street']");
	By citytxt = By.xpath("//input[@id='customer.address.city']");
	By statetxt = By.xpath("//input[@id='customer.address.state']");
	By zipCodetxt = By.xpath("//input[@id='customer.address.zipCode']");
	By phoneNumbertxt = By.xpath("//input[@id='customer.phoneNumber']");
	By ssntxt = By.xpath("//input[@id='customer.ssn']");
	By userNametxt = By.xpath("//input[@id='customer.username']");
	By passwordtxt = By.xpath("//input[@id='customer.password']");
	By repeatPasswordtxt = By.xpath("//input[@id='repeatedPassword']");
	By registerbtn = By.xpath("//input[@value='Register']");
	By userNamelbl = By.xpath("//h1[@class='title']");
	
	
	public void clickRegisterLink() {
		reporterLog("Click on Register Link");
		waitforElementPresent(registerlink, 5);
		click(registerlink, "Register Link");
	}
	
	public void validateRegisterPage() {
		reporterLog("Validate Register Page is shown");
		waitforElementPresent(signUplbl, 5);
	}
	
	public void validateFirstName(String firstName) {
		reporterLog("Enter User Name value");
		waitforElementPresent(firstNametxt, 1);
		type(firstNametxt, firstName, "| First Name");
	}
	
	public void validateLastName(String lastName) {
		reporterLog("Enter Last Name value");
		waitforElementPresent(lastNametxt, 1);
		type(lastNametxt,lastName , "| Last Name");
	}
	
	public void validateStreet(String street) {
		reporterLog("Enter Street  Name");
		waitforElementPresent(streettxt, 1);
		type(streettxt, street , "| Street");
	}
	
	public void validateCity(String city) {
		reporterLog("Enter City Name");
		waitforElementPresent(citytxt, 1);
		type(citytxt, city , "| City");
	}
	
	public void validateState(String state) {
		reporterLog("Enter State Name");
		waitforElementPresent(statetxt, 1);
		type(statetxt, state , "| State");
	}
	
	public void validateZipCode(String zipCode) {
		reporterLog("Enter Zip Code");
		waitforElementPresent(zipCodetxt, 1);
		type(zipCodetxt, zipCode, "| Zip Code");
	}
	
	public void validatePhoneNumber(String phoneNumber) {
		reporterLog("Enter Phone Number Code");
		waitforElementPresent(phoneNumbertxt, 1);
		type(phoneNumbertxt, phoneNumber, "| Zip Code");
	}
		
	public void validateSSN(String ssn) {
		reporterLog("Enter SSN");
		waitforElementPresent(ssntxt, 1);
		type(ssntxt, ssn, "| SSN");
	}
	
	public void validateUserName(String userName) {
		reporterLog("Enter User Name");
		waitforElementPresent(userNametxt, 1);
		type(userNametxt, userName, "| User Name");
	}
	
	public void validatePassword(String password) {
		reporterLog("Enter Password");
		waitforElementPresent(passwordtxt, 1);
		type(passwordtxt, password, "| Password");
	}
	
	public void validateRepeatPassword(String repeatPassword) {
		reporterLog("Re Enter Password");
		waitforElementPresent(repeatPasswordtxt, 1);
		type(repeatPasswordtxt, repeatPassword, "| Re Password");
	}
	
	public void clickRegisterButton() {
		reporterLog("Click Register Button");
		waitforElementPresent(registerbtn, 1);
		click(registerbtn, "| Register Button");
	}
	
	public void validateNewUser(String expectedValue) {
		reporterLog("Validate Actual Value vs Expected Value");
		String actualValue = getText(userNamelbl);
		int mid = actualValue.length()/2;
		String [] parts = {actualValue.substring(0,mid),actualValue.substring(mid)};
		assertEquals(parts[1].trim(),expectedValue);
	}
		
}