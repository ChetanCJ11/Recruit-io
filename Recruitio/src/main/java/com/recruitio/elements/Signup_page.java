package com.recruitio.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_page {
	
	WebDriver driver;
	
	@FindBy(xpath ="//a[@class='signupLink']") public WebElement signupbtn;
	
	@FindBy(xpath ="//input[@class='input']") public WebElement username;
	
	@FindBy(xpath ="//input[@id='userEmail']") public WebElement email;
	
	@FindBy(xpath ="//input[@id='userPassword']") public WebElement password;
	
	@FindBy(xpath ="//button[@id='submitSignUp']") public WebElement Signupbutton;
	
public Signup_page (WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
}
	
	
	
