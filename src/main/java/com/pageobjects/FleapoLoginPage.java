package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.TestBase;
import com.utility.SeleniumUtilities;

public class FleapoLoginPage extends TestBase
{
	public FleapoLoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * @author sambhaji
	 * This method is used for login fleapo
	 */
	//click on Login
	@FindBy (xpath = "//*[normalize-space()='Login']")
	private WebElement login;
	
	
	public void clickOnLogin()
	{
		int isAvailable = driver.findElements(By.xpath("//*[normalize-space()='Login']")).size();
		if(isAvailable != 0)
		{
			login.click();
		}	
	}
	
	//Click on Let's Start
	@FindBy (xpath = "//*[@type='button']")
	private WebElement letsStart;
	
	//mobile number
	@FindBy (xpath = "//*[@class='form-control ']")
	private WebElement mobile;
	
	//Click on Continue
	@FindBy (xpath = "//*[@type='submit']")
	private WebElement clickOnContinue;
	
	//Otp
	@FindBy (xpath = "//*[@aria-label='Please enter verification code. Digit 1']")
	private WebElement otp;
	
	
	public WebElement getLogin(String mobileNumber1, String num) throws InterruptedException
	{
		SeleniumUtilities.click(letsStart, "Click on let's start");
		Thread.sleep(2000);
		mobile.sendKeys(mobileNumber1);
		SeleniumUtilities.click(clickOnContinue, "click on continue");
		Thread.sleep(2000);
		otp.sendKeys(num);
		return mobile;
		
	}
}
