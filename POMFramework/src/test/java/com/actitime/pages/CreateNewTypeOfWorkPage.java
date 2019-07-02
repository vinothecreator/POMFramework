package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewTypeOfWorkPage extends BasePage {
	
	public WebDriver driver;
	

	public CreateNewTypeOfWorkPage(WebDriver d)
	{
		super(d);
		driver= d;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="name")
	private WebElement workNameTextbox;
	
	@FindBy(xpath="//input[contains(@value,'Create Type of Work')]")
	private WebElement createTypeOfWorkButton;
	
	@FindBy (xpath="//select[@name='active']")
	private WebElement Status;
	
	@FindBy(xpath=".//*[@id='billingType_setBillable']")
	private WebElement category;
	
	
	
	public void createNewTypeofWork(String wname)
	{
		workNameTextbox.sendKeys(wname);
	//	createTypeOfWorkButton.click();
		
	}
	public void category()
	{
		
	Select status = new Select (Status);
	status.selectByVisibleText("archived");
	
	}
	
	public void radio() throws InterruptedException {
		
	boolean rad_category =category.isSelected();
	if(!rad_category)
	{
		category.click();
	}
	createTypeOfWorkButton.click();

	}
}
