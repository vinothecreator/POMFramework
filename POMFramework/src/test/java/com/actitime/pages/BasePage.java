package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public WebDriver driver;

	public BasePage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this); // PageDecoration
	}

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[contains(@class,'settings_icon')]")
	private WebElement settingsIcon;
	
	@FindBy(linkText="Types of Work")
	private WebElement typesOfWorkLink;
	
	public void navigateToTypesOfWorkPage()
	{
		settingsIcon.click();
		typesOfWorkLink.click();
	}

	public void logout() {
		logoutLink.click();
	}
	
	

}
