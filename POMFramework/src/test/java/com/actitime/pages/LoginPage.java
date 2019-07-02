package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver d)
	{
		super(d);
		driver=d;
		PageFactory.initElements(d, this); // Page Decoration
	}
	
	
	@FindBy(id="username")
	private WebElement usernameTextbox;
	
	@FindBy(name="pwd")
	private WebElement pwdBox;
	
	@FindBy(id="loginButton")	
	private WebElement loginBtn;
	
	
	public void login(String username, String pwd)
	{
	usernameTextbox.sendKeys(username);
	pwdBox.sendKeys(pwd);
	loginBtn.click();
	}
	
	
	

}
