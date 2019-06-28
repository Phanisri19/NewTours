package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_Validation
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=null;
        driver=new ChromeDriver();
        String url="https://opensource-demo.orangehrmlive.com/";
        driver.get(url);
        
        //<input name="txtUsername" id="txtUsername" type="text">
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        
       //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        
        //<input type="button" value="Login" name="openIdLogin" id="openIdLogin" disabled="disabled">
        
        //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
        WebElement LogInButton= driver.findElement(By.id("btnLogin"));
        
        //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
        
        LogInButton.click();
 
        /*System.out.println("The title is:"+driver.getTitle());
        
       // driver.navigate();
        
        System.out.println("Navigated to:"+driver.navigate());
        
        String expected_Url="OrangeHrm";
        String actual_Url="OrangeHrm";
        
        if(actual_Url.contains(expected_Url))
        {
        	System.out.println("Successfully navigated to Welcome admin page");
        }
        else
        {
        	System.out.println("Not Succesful");
        }  */
        
        String expected_Text="Welcome Admin";
        System.out.println("The expected text is:"+expected_Text);
        //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
        
        String actual_Text= driver.findElement(By.id("welcome")).getText();
        System.out.println("the actual text is:"+actual_Text);
        
        if(actual_Text.equalsIgnoreCase(expected_Text))
        {
        	System.out.println("The status  is"+" pass");
        }
        else
        {
        	System.out.println("the status is"+ "false");
        }

        
   
        
        
	}

}
