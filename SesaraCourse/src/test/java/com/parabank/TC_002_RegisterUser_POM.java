package com.parabank;

import org.testng.annotations.Test;

import com.parabank.base.GlobalVariables;
import com.parabank.base.SeleniumWrapper;
import com.parabank.index.Login;
import com.parabank.index.Register;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC_002_RegisterUser_POM {
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	Register register;
	String username,password;
	
	@BeforeTest
	  public void beforeTest() throws FileNotFoundException {
	  	  seleniumWrapper = new SeleniumWrapper(driver);
		  driver = seleniumWrapper.chromeDriverConnection();
		  login = new Login(driver);
		  register = new Register(driver);
		  username = "G-Dawg1";
		  password = "Test123";
		  this.username = SeleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username" );
		  this.password = SeleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password" );
	}
	
	@Test
	public void TC_002_RegisterUser_POM_TestScript() {
		//Step 1 Launch Browser
		seleniumWrapper.launchBrowser(GlobalVariables.QA_URL);
		
		//Step 2 Click on Register
		register.clickRegisterLink();
		
		//Step 3 Validate Register is Shown
		register.validateRegisterPage();
		
		//Step 4 Fill out First Name
		register.validateFirstName("Nicky");
		
		//Step 4 Fill out First Name
		register.validateLastName("Bosa");
		
		//Step 5 Fill out Street
		register.validateStreet("114 Houston Ave");
		
		//Step 6 Fill out City
		register.validateCity("Houston");
		
		//Step 7 Fill out State
		register.validateState("Texas");
		
		//Step 8 Fill out Zip Code
		register.validateZipCode("75211");
		
		//Step 9 Fill out Phone Number
		register.validatePhoneNumber("832-676-6270");
		
		//Step 10 Fill out SSN
		register.validateSSN("464-62-1976");
		
		//Step 11 Fill out User Name
		register.validateUserName(username);
		
		//Step 12 Fill out Password
		register.validatePassword(password);
		
		//Step 13 Fill out re enter password
		register.validateRepeatPassword(password);
		
		//Step 14 Press register button
		register.clickRegisterButton();
		
		//Step 15 Validate the created User
		register.validateNewUser(username);
		
		//Step 16 Log Out 
		login.logout();
		
		//Step 17 Close Browser
		login.closeBrowser();
  }
  

  @AfterTest
  public void afterTest() {
  }
}
