package com.DollarDaysTeam3.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(name="username")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(className="btn")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div[2]/div/div[1]/div/div/div[3]/a")
	WebElement lnkForgotPwd;
	
	@FindBy(xpath="//*[@id=\"ctl00_cphContent_txtEmailAddress\"]")
	WebElement txtEmailLookup;
	
	@FindBy(xpath="//*[@id=\"ctl00_cphContent_btnSearch\"]")
	WebElement btnLookUp;
	
	@FindBy (xpath="//*[@id=\"question_parent_24\"]")
	WebElement chkKeepSignedIn;

	
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		signin.click();
	}
	
	public void clickForgotPwd()
	{
		lnkForgotPwd.click();
	}
	
	public void settxtEmailLookup(String uname)
	{
		txtEmailLookup.sendKeys(uname);
	}
	
	public void clickLookUP()
	{
		btnLookUp.click();
	}
	
	public void checkLoggedIn()
	{
		chkKeepSignedIn.click();
	}
	
	
}
