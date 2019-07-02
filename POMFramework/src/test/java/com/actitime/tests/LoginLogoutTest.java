package com.actitime.tests;




import org.testng.annotations.Test;

import com.actitiime.libraries.ExcelLibrary;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;
@Test
public class LoginLogoutTest extends BaseClass{
	
	@Test
	public  void LoginLogout() throws InterruptedException 
	
	{
		
		String username=xlib.getExcelData("LoginLogoutTest", 1, 0);
		
		String pwd=xlib.getExcelData("LoginLogoutTest", 1, 1);
		System.out.println(username);
		System.out.println(pwd);
		
	    LoginPage lp = new LoginPage(driver);
		//lp.driver = driver;
		lp.login(username,pwd);
		Thread.sleep(3000);    
		
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		//ettp.driver= driver;
		ettp.logout();
		
		
	}

}
