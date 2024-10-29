package com.udemyautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver methods + class methods
		
		//Chrome Driver
		//System.setProperty("chromedriver.exe", "/Users/regio/git/repository/LinearFramework/src/test/resources/drivers/chrome");
		//WebDriver driver = new ChromeDriver();
		
		//Fire fox driver
		//System.setProperty("geckodriver.exe", "/Users/regio/git/repository/LinearFramework/src/test/resources/drivers/firefox");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge driver
		System.setProperty("webdriver.msedgedriver.exe", "/Users/regio/git/repository/LinearFramework/src/test/resources/drivers/edge");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
	}

}
