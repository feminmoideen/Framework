package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class ValidLoginLogoutTest extends BaseTest {
	
	@Test
	public void testValidLoginLogout()
	{
		String LoginTitle=ExcelData.getData(file_path, "Login", 1, 2);
		String user=ExcelData.getData(file_path, "Login", 1, 0);
		String pass=ExcelData.getData(file_path, "Login", 1, 1);
		String enterTimeTrackTitle =ExcelData.getData(file_path, "EnterTimeTrack", 1, 0);
		
		
		LoginPage lp=new LoginPage(driver);
		EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
		
		//Verify the title of login page
		lp.verifyTheTitle(LoginTitle);
		
		//Enter valid username
		lp.enterUserName(user);
		
		//Enter valid password
		lp.enterPassword(pass);
		
		//Click on Login
		lp.clickOnLogin();
		
		//Verify Enter Time Track Page
		lp.verifyTheTitle(enterTimeTrackTitle);
		
		//click on Logout
		ep.clickOnLogOut();
		
		//verify Login page title
		lp.verifyTheTitle(LoginTitle);
		
		
		
		
		
		
		
		
	}

}
