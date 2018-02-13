package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actitime.generic.BasePage;

public class LoginPage extends BasePage {
	//Declaration
		
	@FindBy(id="username")
	private WebElement userNameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	
	@FindBy(xpath="//nobr[contains(text(),'actiTIME')]")
	private WebElement version;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{	
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
		
	//Utilization
    public void enterUserName(String un)
     {
    	userNameTB.sendKeys(un);

     }
    
    public void enterPassword(String pw)
    {
    	passwordTB.sendKeys(pw);
    }

    public void clickOnLogin()
    {
    	loginBTN.click();
    }

    public void verifyTheTitle(String eTitle)
    {
    	verifyTitle(eTitle);
    }
    
    public void verifyVersion(String eVersion)
    {
    	String aVersion =version.getText();
    	Assert.assertEquals(aVersion, eVersion);
    	
    }
    
    public void verifyErrorMessage()
    {
    	verifyElement(errMsg);
    }
}

