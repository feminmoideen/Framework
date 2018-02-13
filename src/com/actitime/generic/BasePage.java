package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//To verify title
	public void verifyTitle(String eTitle)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching:" +eTitle ,true);
		}
		
		catch(Exception e){
			
			Reporter.log("Title is not matching ",true);
			Assert.fail();
		}
	}

	
	//To verify the Element
	public void verifyElement(WebElement element)
	{
		try
	  {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is present",true);
	   }
		catch(Exception e)
		{
			Reporter.log("element not present ");
			Assert.fail();
			
		}
	}
	
}
