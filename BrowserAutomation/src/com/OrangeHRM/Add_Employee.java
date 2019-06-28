package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Add_Employee 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=null;
        driver=new ChromeDriver();
        String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
        driver.get(url);
        System.out.println("The url navigated to:"+driver.navigate());
        
        //<input name="txtUsername" id="txtUsername" type="text">
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        
       //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        
        //<input type="button" value="Login" name="openIdLogin" id="openIdLogin" disabled="disabled">
        
        //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
        WebElement LogInButton= driver.findElement(By.id("btnLogin"));
        
        //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
      
        LogInButton.click();
 
        
       //<a class="firstLevelMenu" id="menu_pim_viewPimModule" href="/orangehrm-4.0/symfony/web/index.php/pim/viewPimModule"><b>PIM</b></a>
   
       driver.findElement(By.id("menu_pim_viewPimModule")).click();
       
       //<a id="menu_pim_addEmployee" href="/orangehrm-4.0/symfony/web/index.php/pim/addEmployee">Add Employee</a>
       driver.findElement(By.id("menu_pim_addEmployee")).click();
       
      
       
       //<input name="firstName" class="formInputText validation-error" id="firstName" type="text" maxlength="30">
       driver.findElement(By.name("firstName")).sendKeys("Callepalli");
       
       
       //<input name="middleName" class="formInputText" id="middleName" type="text" maxlength="30">
       driver.findElement(By.name("middleName")).sendKeys("Phani");
       
       
       //<input name="lastName" class="formInputText" id="lastName" type="text" maxlength="30">na
       driver.findElement(By.name("lastName")).sendKeys("sri");
       
       
       //<input name="employeeId" class="formInputText valid" id="employeeId" type="text" maxlength="10" value="0002">
       WebElement empID=driver.findElement(By.name("employeeId"));
       String actual_empID=empID.getAttribute("value");
       System.out.println("The employee id is:"+actual_empID);
       
       //<input id="btnSave" type="button" value="Save">
       driver.findElement(By.id("btnSave")).click();
       
       
      // <input name="personal[txtEmployeeId]" disabled="disabled" class="editable" id="personal_txtEmployeeId" type="text" maxlength="10" value="0006">
       String expected_empID=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
       System.out.println("the expected id is:"+expected_empID);
       if(actual_empID.equals(expected_empID))
       
    	
    	   System.out.println("the login functinality is working successfully");
       
       else
       
    	   System.out.println("the login functionality is not working properly");
    	   
	
	driver.quit();
	
	}

}