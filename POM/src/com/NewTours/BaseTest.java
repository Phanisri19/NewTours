package com.NewTours;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest
{

		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		
		@Before
		
		public void setup()
		{
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
		//	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		
	/*	@After
		
		public void teardown()
		{
			driver.close();
		}
	*/	
		
}
