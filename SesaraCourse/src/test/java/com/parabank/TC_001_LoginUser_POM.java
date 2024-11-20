package com.parabank;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.parabank.base.GlobalVariables;
import com.parabank.base.SeleniumWrapper;
import com.parabank.index.Login;
import com.parabank.index.Register;

public class TC_001_LoginUser_POM {
	
	WebDriver driver;
	SeleniumWrapper seleniumWraper;
	Login login;
	Register register;
	String username,password,newUser;
	
	@BeforeTest
	  public void beforeTest() throws FileNotFoundException {
		  seleniumWraper = new SeleniumWrapper(driver);
		  driver = seleniumWraper.chromeDriverConnection();
		  login = new Login(driver);
		  register = new Register(driver);
//		  this.username = SeleniumWrapper.getCellData(GlobalVariables.LOGIN_CREDENTIALS_EXCEL,1,0);
//		  this.password = SeleniumWrapper.getCellData(GlobalVariables.LOGIN_CREDENTIALS_EXCEL,1,1);
//		  this.newUser = SeleniumWrapper.getCellData(GlobalVariables.LOGIN_CREDENTIALS_EXCEL,1,2);
		  this.username = SeleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username" );
		  this.password = SeleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password" );
		  this.newUser = SeleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "newUser" );
	 }
	
  @Test
  public void TC_001_LoginUser_POM_TestScript() {
	  
	  //Step 1 Launch Browser
	  seleniumWraper.launchBrowser(GlobalVariables.QA_Parabank_URL);
	  
	  //Step 2 Enter User Name
	  login.login(username, password);
	  
	  //Step 3 Validate 
	  login.validateNewUser(newUser);
	  
	  //Step 4 Validate 
	    
}
  
  @AfterTest
  public void afterTest() {
 
  }
}