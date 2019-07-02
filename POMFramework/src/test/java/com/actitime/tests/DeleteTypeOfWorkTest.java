package com.actitime.tests;

import org.testng.annotations.Test;

import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.TypesOfWorkPage;

public class DeleteTypeOfWorkTest extends BaseClass
{
	@Test
	public void DeleteTypeOfWork() throws InterruptedException {

		String username = xlib.getExcelData("LoginLogoutTest", 1, 0);
		String pwd = xlib.getExcelData("LoginLogoutTest", 1, 1);
		

		int rowCount = xlib.getRowCount("DeleteTypeOfWorkTest");
		System.out.println(rowCount);
		

		LoginPage lp = new LoginPage(driver);
		lp.login(username, pwd);

		Thread.sleep(3000);

		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.navigateToTypesOfWorkPage();
		
		TypesOfWorkPage towp = new TypesOfWorkPage(driver);
		for (int rowNum = 1; rowNum <= rowCount; rowNum++) {
			String wname = xlib.getExcelData("DeleteTypeOfWorkTest", rowNum, 0);
			System.out.println(wname);
			
			towp.deleteWork(wname);

		}
		
		towp.verifyMsg("Type of Work has been successfully deleted.");
		towp.logout();
		
		
	}}
