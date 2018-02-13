package com.actitime.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTest implements ITestListener

{
	public void onTestStart(ITestResult result)
	{
		
	}

	public void onTestSuccess(ITestResult result)
	{
		
					
	}
	

    public void onTestSkipped(ITestResult result)
    {
    	
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
      {
	  
      }
   public void onStart(ITestContext context)
    {
	
     }
   public void onFinish(ITestContext context)
    {
	
     }


public void onTestFailure(ITestResult result) {
	
	try
	{
		String name =result.getMethod().getMethodName();
		EventFiringWebDriver e = new EventFiringWebDriver(BaseTest.driver);
		File src=e.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./screenshot/"+name+".png"));
	}
	catch(Exception e)
	{
		
    }

}
}
