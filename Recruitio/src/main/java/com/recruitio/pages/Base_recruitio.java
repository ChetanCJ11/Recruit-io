package com.recruitio.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.recruitio.elements.Create_account_page;
import com.recruitio.elements.Signup_page;

import io.undertow.util.FileUtils;

public class Base_recruitio {

		
		public WebDriver driver;
		Signup_page signup;	
		Create_account_page createAccount;
		
		
		@BeforeTest
		public void InvokeBrowser()
		{
			System.setProperty("webdriver.chrome.driver","D:\\Eclipse_Workplace\\Recruit-CRM\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			signup =new Signup_page(driver);
			createAccount = new Create_account_page(driver);
					
		}
		/*@AfterTest
		//public void teardown()
		{		
			driver.close();
		}*/
		

		@AfterMethod
		public void captureScreen(ITestResult result) throws IOException
		{if(result.getStatus()==ITestResult.FAILURE)
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			File Target = new File(System.getProperty("user.dir") + "/Screenshots/" + result.getName() + ".png");
			org.apache.commons.io.FileUtils.copyFile(Source, Target);
			
			System.out.println("screenshot catured");
		}
		

		}
}

