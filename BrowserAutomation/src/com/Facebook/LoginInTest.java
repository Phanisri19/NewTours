package com.Facebook;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.Logs;

public class LoginInTest
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://facebook.com");
		
		//selector is #email
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		driver.findElement(By.id("email")).sendKeys("mphani11@gmail.com");
		
		//selector is #pass
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">	
		driver.findElement(By.id("pass")).sendKeys("phani_chaitu");
		
		//selector is #u_0_
		//<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2">
	    WebElement	LogInButton=driver.findElement(By.id("loginbutton"));
	    LogInButton.click();
		
		
		
	}

}