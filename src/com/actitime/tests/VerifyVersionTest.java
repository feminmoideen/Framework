package com.actitime.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

@Listeners(com.actitime.generic.ListenersTest.class)
public class VerifyVersionTest extends BaseTest

{

	@Test
	public void testVerifyVersion()
	{
		String version=ExcelData.getData(file_path, "Login", 1, 3);
		String loginTitle=ExcelData.getData(file_path,"Login", 1, 2);
		LoginPage lp=new LoginPage(driver);
		
		//Verify the Login Page title
		lp.verifyTheTitle(loginTitle);
		
		//To verify the version
		lp.verifyVersion(version);
			
		
		
	}
	
}
