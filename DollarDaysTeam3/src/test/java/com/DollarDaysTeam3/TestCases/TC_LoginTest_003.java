package com.DollarDaysTeam3.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.DollarDaysTeam3.PageObjects.LoginPage;

public class TC_LoginTest_003 extends BaseClass{
	
	@Test
	public void ValidatePassword() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username was entered");
		
		lp.setPassword(password);
		logger.info("Password was entered");
		
		if (password.isEmpty())
		{
			captureScreen(driver,"ValidatePassword");
			logger.info("password field is blank. Please enter the password.");
		}
		
		else
		{
			
			lp.clicksubmit();
			logger.info("Login successful");
			
		}
	}

}
