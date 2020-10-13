package com.recruitio;


	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.recruitio.elements.Create_account_page;
	import com.recruitio.pages.Base_recruitio;

	public class  Account extends Base_recruitio {
	
	
			@Test(priority =1)
		public void signup() throws Exception
		{
			driver.manage().deleteAllCookies();
			
			driver.get("https://app.recruitcrm.io/createaccount");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			
			String Title = driver.getTitle();
			Assert.assertEquals(Title, "RCRM", "Verify URL of the new page");
			
			driver.findElement(By.xpath("//input[@id='sTest-companyTitleTxt']")).sendKeys("CRM Pvt Ltd");
					
			Robot robot = new Robot();
		
			driver.findElement(By.xpath("//input[@name='timezone']")).sendKeys("ind");
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			
		
			driver.findElement(By.xpath("//input[@name='currency']")).sendKeys("ind");
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			
			WebElement Lable = driver.findElement(By.xpath(("//label[@id='sTest-eeoSwitch']")));
			Lable.click();
			Lable.click();
			System.out.println(Lable.isEnabled());
			
			
			WebElement Lable1 = driver.findElement(By.xpath(("//label[@id='sTest-gdprSwitch']")));
			Lable1.click();
			System.out.println(Lable1.isSelected());
			
			
			driver.findElement(By.xpath("//button[@id='sTest-nextBtn']")).click();
			//driver.findElement(By.xpath("//header/nav[1]/div[2]/div[4]/div[4]/div[1]/a[1]/img[1]")).click();

				
			
					
					
			
			}
	}



