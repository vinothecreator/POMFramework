package com.actitime.tests;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.actitiime.libraries.ExcelLibrary;


public class BaseClass {

	WebDriver driver;
	ExcelLibrary xlib;
	@Parameters("browser")
	
	@BeforeClass
	//void launch(String browser) {
	//<parameter name="browser" value="firefox" /> 
	void launch() {
		xlib = new ExcelLibrary();
		String browser = xlib.getExcelData("Config", 1, 0);
		String url = xlib.getExcelData("Config", 1, 1);

		if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\\\Users\\vgunasekaran\\eclipse-workspace\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vgunasekaran\\eclipse-workspace\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		// driver.get("http://localhost:8080/login.do");

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// PostCondition
	@AfterClass
	void close() {
		driver.close();
	}

}
