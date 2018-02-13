package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	//Declaration
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	
	@FindBy(xpath="//div[@class='popup_menu_icon support_icon']") 
	private WebElement helpICON;
	
	//@FindBy(xpath="//a[@class='About your actiTIME']")
		
	
	//initialization
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void  clickOnLogOut()
	{
		logoutBTN.click();
	}
	
   public void clickOnHelp()
   {
	   helpICON.click();
   }
}
