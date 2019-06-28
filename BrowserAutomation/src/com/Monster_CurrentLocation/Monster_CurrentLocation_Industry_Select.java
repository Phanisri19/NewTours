package com.Monster_CurrentLocation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		String url="https://my.monsterindia.com/sponsered_popup.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		//<select class="border_grey1"
		//class = "border_grey1"
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
	/*	List<WebElement>cityNames=currentLocation.findElements(By.tagName("options"));
		
	List<WebElement>*/
		
		Select selection=new Select(currentLocation);
		//selection.selectByVisibleText("Ahmedabad");
		selection.selectByValue("6");
		
		
		
	}

}
