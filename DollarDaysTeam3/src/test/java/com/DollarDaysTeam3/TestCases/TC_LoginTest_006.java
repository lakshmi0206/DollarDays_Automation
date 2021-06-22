package com.DollarDaysTeam3.TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.DollarDaysTeam3.PageObjects.LoginPage;

public class TC_LoginTest_006 extends BaseClass{
	
	@Test
	public void ValidateUsernameForgotPwdlnk() throws IOException, Exception
	{
		LoginPage lp=new LoginPage(driver);
		
		
		lp.clickForgotPwd();
		logger.info("Landed on forgot password screen");

		lp.settxtEmailLookup(username);
		logger.info("Username was entered for lookup");
		
		lp.clickLookUP();
		Thread.sleep(3000);
		captureScreen(driver,"ValidateUsernameForgotPwdlnk");
		
		if(username.isEmpty() || !username.contains("@") || !username.contains(".com"))
		{
			logger.info("This is a invalid username, please check your username, screenshot taken");
		
		}
		
		else
		{
			
			logger.info("This is a valid username lookup successful, screenshot taken");
			
		}
		
	}
		
		
	

}
