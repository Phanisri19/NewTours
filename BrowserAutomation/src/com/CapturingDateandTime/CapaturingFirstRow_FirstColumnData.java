package com.CapturingDateandTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapaturingFirstRow_FirstColumnData {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		String url="https://www.timeanddate.com/worldclock/";
		WebDriver driver=null;
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//<a href="/worldclock/ghana/accra">Accra</a>
	//	xpath= /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		
		WebElement cityName=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a"));
		
        String text_cityName=cityName.getText();
        
        System.out.println("The city name is:"+text_cityName);
        
        driver.quit();
	}

}
