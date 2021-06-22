package com.DollarDaysTeam3.TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.DollarDaysTeam3.PageObjects.LoginPage;

public class TC_LoginTest_005 extends BaseClass{
	
	@Test
	public void ValidateForgotPwdlnk() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		
		
		lp.clickForgotPwd();

		
		if(driver.getTitle().equals("Forgotten Password Recovery - DollarDays"))
		{
			captureScreen(driver,"ValidateForgotPwdlnk");
			logger.info("Forgot password link is working, the user is now in new screen !");
			
		}
		else
		{
			logger.info("Forgot password link is not working");
			
		}
	}

}
