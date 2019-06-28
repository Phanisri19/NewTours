import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AllBrowserAutomation
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         //System.setProperty("webDriver.gecho.driver", value)
         //create driver object for chrome
	
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");		
		 ChromeDriver cd=new ChromeDriver();
		 cd.get("http://www.google.com");
		 //System.out.println("first program");
		 
		 System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		 FirefoxDriver driver=new FirefoxDriver();
		 driver.get("http://www.amazon.in");
		 
		 System.setProperty("Webdriver.edge.driver","/Driver/msedgedriver.exe");
		 EdgeDriver md=new EdgeDriver();
		 md.get("http://facebook.com");
		 
		 
		 
		 
		 
	}

}