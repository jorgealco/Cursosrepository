package com.formy;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parabank.base.SeleniumWrapper;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.formy.index.AutoCompleteFormy;
import com.parabank.base.GlobalVariables;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001_AutoComplete_Formy {
	WebDriver driver;
	SeleniumWrapper seleniumwrapper;
	AutoCompleteFormy autocompleteformy;
	String username,password;
	
	
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		
		seleniumwrapper = new SeleniumWrapper(driver);
		driver = seleniumwrapper.chromeDriverConnection();
		//driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		
		
		
		autocompleteformy = new AutoCompleteFormy(driver);
		this.username = SeleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username" );
		this.password = SeleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password" );
	}
		@Test
		public void TC_001_AutoComplete_Formy_TestScipt() {
			
			// Step 1 Launch Browser
			seleniumwrapper.launchBrowser(GlobalVariables.QA_Formy_URL);
			
			//Step 2 Validate Header is shown
			autocompleteformy.validateHeader();
			
			//Step 4 Validate Autocomplete Link
			autocompleteformy.getLinkList();
			
			
			
			
			
			
		}
	
	

}
