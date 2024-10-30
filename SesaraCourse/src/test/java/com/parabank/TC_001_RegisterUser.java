package com.parabank;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001_RegisterUser {
  @Test
  public void TC_001_Headers_Validate() {
	  
	  String userName = "G-Dawg6";
	  
	  
	  //Step 1 
	  Reporter.log("Open Browser");
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://parabank.parasoft.com/parabank/index.htm");
	  driver.manage().window().maximize();
	  
	  //Step 2
	  Reporter.log("Click on Register");
	  driver.findElement(By.xpath(" //a[contains(@href,'register')]")).click();
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  
	  //Step 3
	  Reporter.log("Validate Register sections is shown");
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Signing up is easy!']")));
	  
	  //Step4
	  Reporter.log("Fill out Register mandatory fields");
	  driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Nikky");
	  driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Hdz");
	  driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("3808 Texas Dr");
	  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Houston");
	  driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Texas");
	  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("75211");
	  driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("832-123-4567");
	  driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("985-587-6987");
	  driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(userName);
	  driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("Test123");
	  driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("Test123");
	  driver.findElement(By.xpath("//input[@value='Register']")).click();
	  driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	  
	  Reporter.log("Get the user name Label");
	  String registerName = driver.findElement(By.xpath("//h1[@class='title']")).getText();
	  System.out.println("Full registerName is: "+registerName);
	  
	  Reporter.log("Divide the user name Label");
	  int mid = registerName.length()/2;
	  System.out.println("Tamaño de la segunga Palabra: "+mid);
	  String [] parts = {registerName.substring(0,mid),registerName.substring(mid)};
	  System.out.println("Primera: "+parts[0]);
	  System.out.println("Segunda: "+parts[1]);
	  //driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  
	  Reporter.log("Validate the entered Username on the Registration Page matches against the shown User name on the Register Page");
	  Assert.assertEquals(userName, parts[1].trim());
	  
	  Reporter.log("Log out");
	  driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	  
	
	  
	
	
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
