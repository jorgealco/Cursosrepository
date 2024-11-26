package com.parabank.base;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class SeleniumWrapper {
	
	private WebDriver driver;
	
	/*
	 * Constructor Selenium Wrapper
	 */
	public SeleniumWrapper(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hoverOver(By locator) {
		Actions mouseOver = new Actions(driver);
		mouseOver.moveToElement((WebElement) locator);
	}
	
	/*
	 * Chrome driver connection
	 */

	public WebDriver chromeDriverConnection() {
		System.setProperty(GlobalVariables.CHROME_DRIVER, GlobalVariables.PATH_CHROME_DRIVER);
		driver = new ChromeDriver();
		return driver;
	}
	
	/*
	 * Launch Browser
	 *@author Jorge
	 *@date
	 *@description
	 */
	
	public void launchBrowser(String url) {
		reporterLog("Launching..."+url);
		driver.get(url);
		driver.manage().window().maximize();
		implicityWait(5);
	}
	
	/*
	 * Close Browser
	 */
	
	public void closeBrowser() {
		try {
			reporterLog("Close Browser");
			driver.close();
		}catch (NoSuchSessionException e) {
			Assert.fail("Not able to close Browser");
		}
	}
	
	/*
	 * List - Get a list of Links
	 */
	
	public void getHeaderLinks(By locator) {
		ArrayList<String> expValues = new ArrayList<String>();
			expValues.add("Autocomplete");
			expValues.add("Buttons");
			expValues.add("Checkbox");
			expValues.add("Datepicker");
			expValues.add("Drag and Drop");
			expValues.add("Dropdown");
			expValues.add("Enabled and disabled elements");
			expValues.add("File Upload");
			expValues.add("Key and Mouse Press");
			expValues.add("Modal");
			expValues.add("Page Scroll");
			expValues.add("Radio Button");
			expValues.add("Switch Window");
			expValues.add("Complete Web Form");
			
		ArrayList<String> actValues = new ArrayList<String>();
		
		List<WebElement> headerLinks = driver.findElements(locator);
		for(WebElement l1 : headerLinks) {
				System.out.println(l1.getText());
				actValues.add(l1.getText().trim());
	}
		if(expValues.equals(actValues)) {
			System.out.println("Links matches");
			
		}else{
			System.out.println("Links DONT matches");
		}
	}
	
	/*
	 * Reporter Log
	 */

	public void reporterLog(String log) {
		Reporter.log(log);
	}

	/*
	 * Implicit Wait
	 */

	public void implicityWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
	}

	/*
	 * Find Element
	 */

	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}


	/*
	 * Type Method
	 */
	public void type(By locator, String inputText,  String description) {
		System.out.println("Typing text: "+inputText+ " "+description);
		driver.findElement(locator).sendKeys(inputText);
			
	}

	/*
	 * Wait for element
	 */

	public void waitforElementPresent(By locator, int timeout) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
		catch(TimeoutException e){
			
		}
	}
	
	
	
		
	/*
	 * Click Object
	 */
	public void click(By locator, String description) {
		System.out.println("Clicking..."+description);
		driver.findElement(locator).click();
	}
	
	/*
	 * Get Text
	 */

	public String getText(By locator) {
		try {
			return driver.findElement(locator).getText();
			
		}catch(NoSuchElementException e) {
			return null;
			
		}
	}
	
	public String getText1(By locator) {
		try {
			String fullName = getText(locator);
			System.out.println("Valor del New User label: "+fullName);
			int mid = fullName.length()/2;
			
			System.out.println("Cantidad: "+ mid);
			String [] parts = {fullName.substring(0,mid).trim(),fullName.substring(mid).trim()};
			System.out.println("Primer Valor: "+parts[0]);
			System.out.println("Segund Valor: "+parts[1]);
			String actualValue = parts[1];
			return actualValue;
			
		}catch(NoSuchElementException e) {
			return null;
			
		}
	}
	
	public void getText2(By locator) {
		
			String fullName = getText(locator);
			System.out.println("Valor del New User label: "+fullName);
			String [] parts = fullName.split(" ");
			
			for(String partsValue : parts) {
				System.out.println("El Split es: "+partsValue);
			}
			int mid = parts.length;
			System.out.println("Lenght: "+mid);
			
}

	
	
	/*
	 * Assertion
	 */
	
	public void assertEquals(String actualValue, String expectedValue) {
		try {
			Assert.assertEquals(actualValue, expectedValue);
		}
		catch(AssertionError e) {
			Assert.fail("Not able to Assert Actual value: "+actualValue+" Expected Value: "+expectedValue);
		}
		
	}
	
	/*
	 * Get text from data Table
	 */
	
	public String getValuefromTable(String row, String column) {
		try {
			
			return driver.findElement(By.xpath("row+ column")).getText();
			
		}catch(NoSuchElementException e){
			return null;
			
		}
		
	}
	
	/*
	 * Get Data from JSON file (1 node)
	 * @param jsonFile, jsonObjName, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	
	public static String getJSONValue(String jsonFile, String jsonObjName, String jsonKey) throws FileNotFoundException{
		try {
			
			//JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFile + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			
			//GetData
			String jsonValue = (String) jsonObject.getJSONObject(jsonObjName).get(jsonKey);
			return jsonValue;
			
		} catch(FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
	
	
	public static String getJSONValue(String jsonFileObj , String jsonKey) throws FileNotFoundException{
		try {
			
			//JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			
			//GetData
			String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);
			return jsonValue;
			
		} catch(FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
	
	/*
	 *Get Value from Excel
	 *
	 */
	
	public static String getCellData(String excelName, int row, int column) {
		try {
			//Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariables.PATH_EXCEL_DATA+excelName+".xlsx");
			
			//Constructor an XSSFWorkbook object
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(column);
			String value = cell.getStringCellValue();
			return value;
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			return null;
			
		}catch(IOException e1) {
			e1.printStackTrace();
			return null;
	}
 }
	
	public void takeScreenshot(String fileName) {
		try {
			Screenshot screenshot = new AShot().takeScreenshot(driver);
			ImageIO.write(screenshot.getImage(), "PNG", new File(GlobalVariables.PATH_SCREENSHOTS + fileName +".png"));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}