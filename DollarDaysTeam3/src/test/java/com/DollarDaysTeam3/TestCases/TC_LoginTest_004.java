package com.DollarDaysTeam3.TestCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.DollarDaysTeam3.PageObjects.LoginPage;

public class TC_LoginTest_004 extends BaseClass{
	
	@Test
	public void Validatelogin() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username was entered");
		
		lp.setPassword(password);
		logger.info("Password was entered");
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Login or Register - DollarDays"))
		{
			captureScreen(driver,"Validatelogin");
			logger.info("Incorrect login and password combination. Alert message has been taken in screenshot ");
			
		}
		else
		{
			logger.info("Login successful !!!");
			
		}
	}

}
