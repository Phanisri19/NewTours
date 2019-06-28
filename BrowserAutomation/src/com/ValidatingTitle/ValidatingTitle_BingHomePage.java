package com.ValidatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage
{

	public static void main(String[] args)
	{
		
       System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe/");
       WebDriver driver=null;
       driver=new ChromeDriver();
       String url="http://bing.com";
       driver.get(url);
       
       String expected_Title="bing";
       System.out.println("The expected title is:"+expected_Title);
       
       String actual_Title="bing";
       System.out.println("The actual title is"+actual_Title);
       
       if(actual_Title.equals(expected_Title))
       {
    	   System.out.println("Title Matched -Test passed");
    	   
       }
       else
       {
    	   System.out.println("Title not matched-Test failed");
       }
	}

}
