package com.NewTours;
import java.util.*;
//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");		
		 //ChromeDriver cd=new ChromeDriver();
		 //cd.get("http://wwww.google.com");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="http://NewTours.demoaut.com";
		driver.get(url);
		List<WebElement>links= driver.findElements(By.tagName("a"));
		int link_count=links.size();
	    System.out.println("The total number of links on newtours HomePage are:"+link_count);
	}

}
