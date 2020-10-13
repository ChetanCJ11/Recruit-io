package com.recruitio;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.recruitio.pages.Base_recruitio;

import org.testng.annotations.Test;

public class Profile_Login extends Base_recruitio  {
	
	
	@Test
	public void Login() throws Exception
	{
		
		driver.get("https://app.recruitcrm.io/#");
		
		driver.findElement(By.xpath("//input[@id='sTestEmail']")).sendKeys("chetanj@gmail.com");
		//Chetan11@gmail.com
		
		driver.findElement(By.xpath("//input[@id='sTestPassword']")).sendKeys("Chetan1234");
		//chetan1234
		
		driver.findElement(By.xpath("//button[@id='sTestLoginBtn']")).click();
		
		//driver.findElement(By.xpath("//header/nav[1]/div[2]/div[4]/div[4]/div[1]/a[1]/img[1]")).click();
	}
	@Test
	public void profile() throws Exception
	{
		driver.get("https://app.recruitcrm.io/user/profile#");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@id='sTestEmail']")).sendKeys("chetanj@gmail.com");
		//Chetan11@gmail.com
		
		driver.findElement(By.xpath("//input[@id='sTestPassword']")).sendKeys("Chetan1234");
		//chetan1234
		
		driver.findElement(By.xpath("//button[@id='sTestLoginBtn']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By)
	}
	

}
