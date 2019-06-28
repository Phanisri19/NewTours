package com.OrangeHRM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest 
{

	
	WebDriver driver=null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	
	
   @Given("^Open chrome browser and navigate to the OrangeHRM application$")
   public void Open_chrome_browser_and_navigate_to_the_OrangeHRM_application() 
   {
	   System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	   
   }  
	   
	   
   @When("^User enters valid UserName and Password and click on LogIn Button$")
   public void User_enters_valid_UserName_and_Password_and_click_on_LogIn_Button() 
   {
	   
	   //<input name="txtUsername" id="txtUsername" type="text">
	   driver.findElement(By.name("txtUsername")).sendKeys("admin");
	   
	   //<input name="txtPassword" id="txtPassword" type="password">
	   driver.findElement(By.name("txtPassword")).sendKeys("admin");
	   
	   //<input name="Submit" class="button" id="btnLogin" type="submit" value="LOGIN">
       driver.findElement(By.id("btnLogin")).click();
  
   
   }    

   @Then("^User should be able to successfully LogIn and close the application$")
   public void User_should_be_able_to_successfully_LogIn_and_close_the_application() throws IOException 
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




