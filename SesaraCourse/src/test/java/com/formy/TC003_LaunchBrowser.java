package com.formy;

import org.testng.annotations.Test;

import com.parabank.base.SeleniumWrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TC003_LaunchBrowser {
		WebDriver driver;
		SeleniumWrapper seleniumwrapper;
		
	
		@BeforeMethod
		public void beforeTest() {
			seleniumwrapper = new SeleniumWrapper(driver);
			driver = seleniumwrapper.chromeDriverConnection();
		}
		
		
	@Test
  public void TC003_LaunchBrowserScript() {
		seleniumwrapper.launchBrowser("https://www.godaddy.com/es");
		
		
  }
  
  
	  
  }

