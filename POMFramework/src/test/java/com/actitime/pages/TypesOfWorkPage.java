package com.actitime.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class TypesOfWorkPage extends BasePage {

	public WebDriver driver;
	public TypesOfWorkPage(WebDriver d)
	
	{
		super(d);
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="ext-comp-1002")
	private WebElement createTypeOfWorkButton;

	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement msgElement;
	
/*	@FindBy(xpath="//a[text()='webtesting']/../../td[6]/a")
	private WebElement deleteLink;*/
	
	
	public void navigateToCreateNewTypeOfWorkPage()
	{
		createTypeOfWorkButton.click();
	}
	
	
	public void deleteWork(String wname)
	
	{
		WebElement deleteLink=driver.findElement(By.xpath("//a[text()='"+wname+"']/../../td[6]/a"));
		deleteLink.click();
		driver.switchTo().alert().accept();
	}

	
	public void verifyMsg(String expectedMsg)
	{
		String actualMsg=msgElement.getText();
		Assert.assertEquals(expectedMsg, actualMsg);
		
	}


	
	
}
