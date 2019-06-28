package com.Navigation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToApplication 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("http://www.facebook.com");
		driver.navigate().to("http://facebook.com");
		driver.close();
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://flipkart.com");
		cd.close();
		
		
		
	}

}
