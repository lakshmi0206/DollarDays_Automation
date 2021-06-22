package com.DollarDaysTeam3.TestCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import com.DollarDaysTeam3.PageObjects.LoginPage;

public class TC_LoginTest_007 extends BaseClass{
	
	@Test
	public void ValidateChkBox() throws IOException, Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username was entered");
		
		lp.setPassword(password);
		logger.info("Password was entered");
		
		lp.checkLoggedIn();
		logger.info("Keep me signed in checkbox is checked");
		Thread.sleep(3000);
		captureScreen(driver,"ValidateChkBox");
		
		lp.clicksubmit();
		logger.info("Login successful");
		
		
	}
		
	
		
		
}
		


