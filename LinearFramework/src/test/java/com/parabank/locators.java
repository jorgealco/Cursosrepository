package com.parabank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("chromedriver.exe", "/Users/regio/git/repository/LinearFramework/src/test/resources/drivers/chrome");
		WebDriver driver = new ChromeDriver();
		//Open Browser
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//Maximize the Page
		driver.manage().window().maximize();
		//Click on Register
		driver.findElement(By.xpath("//*[contains(text(),'Register')]")).click();
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Press on Submit button
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Press on Submit button
		System.out.println(driver.findElement(By.className("error")).getText());
		//Press Forgot your Password
		driver.findElement(By.linkText("Forgot login info?")).click();
		//
		driver.findElement(By.xpath("//h1[contains(text(),'Customer Lookup')]"));
		//
		
		
		
	}

}
