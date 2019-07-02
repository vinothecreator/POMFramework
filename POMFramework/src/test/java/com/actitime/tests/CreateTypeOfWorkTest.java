package com.actitime.tests;


import org.junit.Test;

import com.actitime.pages.CreateNewTypeOfWorkPage;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.TypesOfWorkPage;

public class CreateTypeOfWorkTest extends BaseClass {

	@Test
	public void createTypeOfWork() throws InterruptedException {

		String username = xlib.getExcelData("LoginLogoutTest", 1, 0);
		String pwd = xlib.getExcelData("LoginLogoutTest", 1, 1);
		
		

		int rowCount = xlib.getRowCount("CreateTypeOfWorkTest");
		System.out.println(rowCount);

		LoginPage lp = new LoginPage(driver);
		lp.login(username, pwd);

		Thread.sleep(4000);

		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.navigateToTypesOfWorkPage();
		
		TypesOfWorkPage towp = new TypesOfWorkPage(driver);
		for (int rowNum = 1; rowNum <= rowCount; rowNum++) {
			String wname = xlib.getExcelData("CreateTypeOfWorkTest", rowNum, 0);
			System.out.println(wname);

			towp.navigateToCreateNewTypeOfWorkPage();

			CreateNewTypeOfWorkPage cntowp = new CreateNewTypeOfWorkPage(driver);
			cntowp.createNewTypeofWork(wname);
			cntowp.category();
			cntowp.radio();

		}
		towp.verifyMsg("Type of Work has been successfully created.");
		towp.logout();
	}
	
	

}
