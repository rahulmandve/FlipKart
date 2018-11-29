package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.base.TestBase;

public class RegistrationPage extends TestBase
{
	
	@FindBy(xpath="//a[contains(text(),'Login & Signup')]")
	WebElement LoginSignupbtn;
	
	@FindBy(xpath="//span[contains(text(),'Sign up')]")
	WebElement signup;
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	WebElement mobileno;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement continuebtn;
		

	
}
