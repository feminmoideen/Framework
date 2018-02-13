package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class InvalidLoginTest extends BaseTest {

	@Test
	public void testInvalidLogin()
	{
		String LoginTitle=ExcelData.getData(file_path, "Login", 1, 2);
		String user=ExcelData.getData(file_path, "Login", 2, 0);
		String pass=ExcelData.getData(file_path, "Login", 2, 1);
		String enterTimeTrackTitle =ExcelData.getData(file_path, "EnterTimeTrack", 1, 0);
		
		
		LoginPage lp= new LoginPage(driver);
				
		//Verify Login page title
		lp.verifyTheTitle(LoginTitle);
		
		//Enter UserName
		lp.enterUserName(user);
		
		//Enter Password
		lp.enterPassword(pass);
		
		//Click on Login
		lp.clickOnLogin();
		
		//Verify Error Message
		lp.verifyErrorMessage();
		
		
	}
	
	
	
} 
