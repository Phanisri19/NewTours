package com.NewTours_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_getAttribute 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		String  url="http://newtours.demoaut.com/";
		driver.get(url);
		
		//<a href="mercuryregister.php?osCsid=0399dec40a98e2f7eba6e797cbeaa323">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		String register_hrefurl=register.getAttribute("href");
		System.out.println("The text is:"+register_hrefurl);
		register.click();
		
		String actual_hrefurl=driver.getCurrentUrl();
		System.out.println("The current url is:"+actual_hrefurl);
		
		if(actual_hrefurl.equals(register_hrefurl))
		{
			System.out.println("Successfully navigated to registration web page - Pass");
			
		}
		else
		{
			System.out.println("Failed");
		}
		//driver.quit();
		
		
		
		
      
	}

}
