package com.DollarDaysTeam3.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.DollarDaysTeam3.PageObjects.LoginPage;

public class TC_LoginTest_002 extends BaseClass{
	
	@Test
	public void ValidateEmailID() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username was entered");
		
		if (username.isEmpty() || !username.contains("@") || !username.contains(".com"))
		{
			captureScreen(driver,"ValidateEmailID");
			logger.info("Invalid Username, please check");
		}
		
		else
		{
			Assert.assertTrue(true);
			logger.info("This is a valid username");
			
			lp.setPassword(password);
			logger.info("Password was entered");
			
			
			lp.clicksubmit();
			
		}
	}

}
