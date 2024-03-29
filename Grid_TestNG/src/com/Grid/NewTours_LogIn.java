package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTours_LogIn
{
 
  @Parameters("Browser")
  @Test
	public void login(String browser) throws MalformedURLException 
	{
		
		System.out.println("The Browser name is:"+browser);
		
		DesiredCapabilities cap=null;
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		else
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		}
		
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://172.20.10.10:4444/wd/hub"),cap);
		String url="http://newtours.demoaut.com";
		driver.get(url);
		
		//name="userName"
		//<input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		//<input type="password" name="password" size="10">
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		//<input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=cda771ba53ee853566f3f76add5de5a3" width="58" height="17" alt="Sign-In" border="0">
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		
		
		
		
	}
	
}
