package com.utililu.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver Start_Browser(String BroserName,String URL) {
		
		
		
		if( BroserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("weddriver.chrome.driver","C:\\Users\\Md Mamunur Rashid\\Desktop\\chromedriver.exe" );
			driver=new ChromeDriver();
		}else if(BroserName.equalsIgnoreCase("IE")){
			
			System.setProperty("weddriver.chrome.driver","C:\\Users\\Md Mamunur Rashid\\Desktop\\chromedriver.exe" );
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
	

}
 