package com.Facebook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	
	WebDriver driver;
	
	public  LoginPageFactory(WebDriver Idriver) {
		
		
		this.driver=Idriver;
		
		
	}
	

	@FindBy(id="email")
	WebElement uesrname;
	
	
	@FindBy (how=How.ID,using="pass")
	WebElement password;
	
	@FindBy(id="loginbutton") 
	WebElement Login;
	
	
	
	
	
	
	
	
	
	public void Login_facebook(String usernamer,String Password) {
		
		uesrname.sendKeys(usernamer);
		password.sendKeys(Password);
		Login.click();
		
		
		
		
	}
	
	
	
}
