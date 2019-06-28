package com.OrangeHRM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogIn_Multiple
{
	
	 WebDriver driver=null;
	 String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/dashboard";
	  
	 
		 
	@Given("^Open the Chrome Browser and navigate to OrangeHRM application$")
	public void Open_the_Chrome_Browser_and_navigate_to_OrangeHRM_application() 
	{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(url);
		
	    
	}

	@When("^User Enters \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	public void User_Enters_and_and_click_on_login_button(String arg1, String arg2) 
	{
         
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("UserName");
		
		
		//<input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		
		//<input name="Submit" class="button" id="btnLogin" type="submit" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		
		
	    
	}

	@Then ("^User should be able to login and close the application$")
	public void User_should_be_able_to_login_and_close_the_application() throws IOException 
	{
	    	
		 try
		    {
		    	String expected_Text="Welcome Admin";
		    	System.out.println("The expected text :"+expected_Text);
		    	
		    	//<a class="panelTrigger activated-welcome" id="welcome" href="#">Welcome Admin</a>
		    	String actual_Text=driver.findElement(By.id("welcome")).getText();
		    	System.out.println("The actual text is:"+actual_Text);
		    	
		    	if(actual_Text.contains(expected_Text))
		    	{
		            System.out.println("login successfully");
		    	}
		    	else
		    	{
		    		System.out.println("login failed");
		    	}
		    }
		    
		    catch(Exception e)
		    {
		    	
		    	//<span id="spanMessage">Invalid credentials</span>
		    	if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"))
		    	{
		    		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    		
		    		FileUtils.copyFile(Screenshot, new File("./Screenshots/LogIn_Error.png"));
		    		
		    		System.out.println("LogIn Failed - Fail");
		    	}
		     }

	}


}
