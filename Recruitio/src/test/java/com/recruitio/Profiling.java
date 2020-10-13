package com.recruitio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.sikuli.api.Screen;
import org.testng.annotations.Test;

import com.recruitio.pages.Base_recruitio;

public class Profiling extends Base_recruitio {
	
	@Test
	public void updateProfile() throws Exception
	{
	driver.get("https://app.recruitcrm.io/user/profile#");
	driver.findElement(By.xpath("//input[@id='sTestEmail']")).sendKeys("chetanj@gmail.com");
	//Chetan11@gmail.com
	
	driver.findElement(By.xpath("//input[@id='sTestPassword']")).sendKeys("Chetan1234");
	//chetan1234
	
	driver.findElement(By.xpath("//button[@id='sTestLoginBtn']")).click();
	Robot robot = new Robot();
	driver.findElement(By.xpath("//body/div[@id='application']/div[1]/div[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
	
	robot.setAutoDelay(2000);
	
	  StringSelection stringSelection = new StringSelection("C:\\Users\\BRAL\\Desktop\\img");
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	   robot.setAutoDelay(2000);
	   
	   robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);
       
       robot.keyRelease(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_CONTROL);
       
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	}
}
