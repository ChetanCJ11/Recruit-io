package com.recruitio.elements;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_account_page {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='sTest-companyTitleTxt']") public WebElement CompanyName;
		
	@FindBy(xpath="//input[@name='timezone']") public WebElement TimeZone;
	
	@FindBy(xpath="//input[@name='currency']") public WebElement Currency;
	
	@FindBy(xpath="//label[@id='sTest-eeoSwitch']") public WebElement Lable1;
	
	@FindBy(xpath="//label[@id='sTest-gdprSwitch']") public WebElement Lable2;
	
	@FindBy(xpath="//button[@id='sTest-nextBtn']") public WebElement NextButton;
	
	public Create_account_page(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}

}
