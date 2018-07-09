package com.testcase.login;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Facebook.page.LoginPageFactory;
import com.utililu.Browser.BrowserFactory;

public class VarifyLogin {
	
	
	
	@Test
	
	public void checkvaliduser() {
		
		
		WebDriver driver=BrowserFactory.Start_Browser("Chrome", "http://www.facebook.com");
		LoginPageFactory loginPage=PageFactory.initElements(driver, LoginPageFactory.class);
		loginPage.Login_facebook("setubabu25@yahoo.com", "14Septber");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
		
		
		
	}

}
