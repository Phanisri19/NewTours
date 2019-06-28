package com.IdentifyingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_IdentifyingTitle 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String url="http://bing.com";
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.get(url);
		
	    System.out.println("The title is:" +driver.getTitle());

	}

}
