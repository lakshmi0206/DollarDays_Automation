package com.DollarDaysTeam3.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.DollarDaysTeam3.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass

{
	@Test
     public void loginTest() throws IOException 
     {
	
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username was entered");
		
		lp.setPassword(password);
		logger.info("Password was entered");
		
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Login or Register - DollarDays"))
		{
			Assert.assertTrue(true);
			logger.info("Login test is passed");
			
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
			
		}
		
		
     }
 	


}
