package com.formy.index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.parabank.base.SeleniumWrapper;

public class AutoCompleteFormy extends SeleniumWrapper{

	public AutoCompleteFormy(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	By welcomeHeader = By.xpath("//h1[text()='Welcome to Formy']");
	By welcomeMessage = By.xpath("//p[text()='This is a simple site that has form components that can be used for testing purposes.']");
	By headerLinks = By.xpath("//div[@class='jumbotron-fluid']/li/a");
	By autocompleteLink = By.xpath("//*[@class='btn btn-lg'][@href='/autocomplete']");
	By buttonLink = By.xpath("//*[@class='btn btn-lg'][@href='/buttons']");
	By checkBoxLink = By.xpath("//*[@class='btn btn-lg'][@href='/checkbox']");
	By datePickerLink = By.xpath("//*[@class='btn btn-lg'][@href='/datepicker']");
	By dragDropLink = By.xpath("//*[@class='btn btn-lg'][@href='/dragdrop']");
	By dropDownLink = By.xpath("//*[@class='btn btn-lg'][@href='/dropdown']");
	By enableLink = By.xpath("//*[@class='btn btn-lg'][@href='/enabled']");
	By fileUploadLink = By.xpath("//*[@class='btn btn-lg'][@href='/fileupload']");
	By keyPressLink = By.xpath("//*[@class='btn btn-lg'][@href='/keypress']");
	By modalLink = By.xpath("//*[@class='btn btn-lg'][@href='/modal']");
	By scrollLink = By.xpath("//*[@class='btn btn-lg'][@href='/scroll']");
	By radioButtonLink = By.xpath("//*[@class='btn btn-lg'][@href='/radiobutton']");
	By switchWindowLink = By.xpath("//*[@class='btn btn-lg'][@href='/switch-window']");
	By formLink = By.xpath("//*[@class='btn btn-lg'][@href='/form']");
		
	public void validateHeader() {
		reporterLog("Validate Auto Complete Header");
		waitforElementPresent(welcomeHeader,1);
		
	}
	
	public void getLinkList() {
		reporterLog("Validate Header Links");
		getHeaderLinks(headerLinks);
	}
	
	public void validateParagraph() {
		reporterLog("Validate Paragraph Message");
		waitforElementPresent(welcomeMessage,1);
	}
	
	public void validateAutoCompleteLink() {
		reporterLog("Validate Auto Complete Link");
		waitforElementPresent(autocompleteLink,1);
		
	}
	
	public void validateButtonsLink() {
		reporterLog("Validate Auto Buttons Link");
		waitforElementPresent(buttonLink,1);
	}
	
	public void validateCheckBoxLink() {
		reporterLog("Validate Check Box Link");
		waitforElementPresent(checkBoxLink,1);
	}
	
	public void validateDatePickerLink() {
		reporterLog("Validate Check Box Link");
		waitforElementPresent(datePickerLink,1);
	}
	
	public void validateDragandDropLink() {
		reporterLog("Validate Check Box Link");
		waitforElementPresent(dragDropLink,1);
	}
	
	public void validateDropDownLink() {
		reporterLog("Validate Check Box Link");
		waitforElementPresent(dropDownLink,1);
	}
	
	public void validateEnableandDisableElementsLink() {
		reporterLog("Validate Check Box Link");
		waitforElementPresent(enableLink,1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

	