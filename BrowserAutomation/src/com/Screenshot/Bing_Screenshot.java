package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_Screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException	
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver=null;
		String url="http://bing.com";
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(10000);
		
		File bing_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(bing_Screenshot,new File("./Screenshots/bing1.png"));
		
		driver.quit();
		
		
	}
}