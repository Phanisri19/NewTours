package com.Keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest_Keyworddriven
{

	public static void main(String[] args) throws IOException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		
		String url="http://newtours.demoaut.com";
		String uName="tutorial";
		String pwd="tutorial";
		
		
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream file=new FileInputStream("./NewTours.properties");
		Properties pr=new Properties();
		
		pr.load(file);
		
		
		//<input type="text" name="userName" size="10">
		driver.findElement(By.name(pr.getProperty("Username"))).sendKeys(uName);
		
		//<input type="password" name="password" size="10">
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(pwd);
		
		//<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
		driver.findElement(By.name(pr.getProperty("SignIn"))).click();
		
		String expected_Title="Find";
		System.out.println("The expected title is:"+expected_Title);
		
		String actual_Title=driver.getTitle();
		
		if (actual_Title.contains(expected_Title))
		{
			  System.out.println("Login Succesful");
			  
		} 
		else
		{
		   System.out.println("Not Successful");
		
		}
		

	}

}
