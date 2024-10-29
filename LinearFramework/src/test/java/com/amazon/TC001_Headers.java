package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_Headers extends amazon{
		
	
	@BeforeTest
	  public void beforeTest() {
	  }
	


	@Test
	public void TC001_ValidarHeaders() {
		Reporter.log("Open Browser Amazon Prime web page");
		System.setProperty("chromedriver.exe", "/Users/regio/git/repository/LinearFramework/src/test/resources/drivers/chrome");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.com.mx");
		driver.manage().window().maximize();
	}

  @AfterTest
  public void afterTest() {
  }

}
