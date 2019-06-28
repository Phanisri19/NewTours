package com.Jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery 
{

	public static void main(String[] args) 
	{

		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver=null;
		driver=new FirefoxDriver();
		
		String url="https://jqueryui.com/droppable/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;"><p>Drag me to my target</p></div>
		
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		
		//<div id="droppable" class="ui-widget-header ui-droppable">	<p>Drop here</p> </div>
		
		WebElement drop_Element=driver.findElement(By.id("droppable"));
		
		//WebElement drag_Element=null;
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag_Element, drop_Element).perform();
		
		driver.switchTo().defaultContent();
	}

}