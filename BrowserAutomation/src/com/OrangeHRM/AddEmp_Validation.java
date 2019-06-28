package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddEmp_Validation
{

	public static void main(String[] args) throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		driver.get(url);
		
		//driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		FileInputStream file = new FileInputStream("./src/com/ExcelTestData/AddEmp.xlsx");
		
		XSSFWorkbook workBook =new XSSFWorkbook(file);
		
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		//Row r=sheet.getRow(0);
		
		//Cell c=r.getCell(0);
		
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
		         
			//String data=c.getStringCellValue();
			Row r=sheet.getRow(i);
			
			int cellCount=r.getLastCellNum();
			
			for (int j=0;j<cellCount;j++)
			{
				String text=r.getCell(j).getStringCellValue();
				System.out.print(text);
				
			}
			
			System.out.println();
		}
		
		
			
	}
}