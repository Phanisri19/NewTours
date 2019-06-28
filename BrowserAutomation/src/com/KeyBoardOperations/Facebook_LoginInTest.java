package com.KeyBoardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LoginInTest 
{

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");		
		 WebDriver driver=null;
		 driver=new ChromeDriver();
		 String url="http://wwww.facebook.com";
		 driver.get(url);
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		//driver.findElement(By.id("email")).sendKeys("mphani11@gmail.com");
		
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		//driver.findElement(By.id("pass")).sendKeys("phani_chaitu");
		
		
		
		//driver.quit();
		

	}

}
