package com.recruitio;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.recruitio.elements.Signup_page;
import com.recruitio.pages.Base_recruitio;

public class SignupRecruitio extends Base_recruitio  {
	Signup_page signup;	
	
	
	@Test(priority =1)
	public void Login() throws Exception
	{
		driver.manage().deleteAllCookies();
		
		driver.get("https://app.recruitcrm.io/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		String Title = driver.getTitle();
		AssertJUnit.assertEquals(Title, "RCRM", "Verify URL of the new page");
		//signup.signupbtn.click();
		driver.findElement(By.xpath("//a[@class='signupLink']")).click();
		Thread.sleep(3000);
	
	}
	@Test(priority =2)
	public void SignupDetails() throws InterruptedException
	{
		
		driver.get("https://app.recruitcrm.io/signup");
		Thread.sleep(3000);
		//signup.username.sendKeys("Shrikant Kale");
		driver.findElement(By.xpath("//input[@class='input']")).sendKeys("Chetan joshi");
		//signup.email.sendKeys("ShrikantKale@gmail.com");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Chetanjoshi007@gmail.com");
		//signup.password.sendKeys("Shri@1212");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Crj@1102");
		//signup.Signupbutton.click();
		driver.findElement(By.xpath("//button[@id='submitSignUp']")).click();;
		
	}	
	
	

}
