package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage  extends BasePage{

	public WebDriver driver;
	
	public EnterTimeTrackPage(WebDriver d)
	{
		super(d);
		driver=d;
		PageFactory.initElements(d, this);
	}


}
