package com.ExcelOPerations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MutlipleTestData
{

	public static void main(String[] args) throws IOException
	 {
		FileInputStream file=new FileInputStream("./src/com/ExcelTestData/SampleTestData.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workBook.getSheet("Sheet2");
		
		//Row r;
		
	    int rowCount = sheet.getLastRowNum();
			
		//int rowCount;
		for (int i=4;i<=rowCount;i++)
		{
			Row r=sheet.getRow(i);
		System.out.println(" i:"+i);
			int cellCount=r.getLastCellNum();
			
			
			//System.out.println("The active rows in the sheet are:"+cellCount);
			
			for(int k=2;k<cellCount;k++)
			{
				String data=r.getCell(k).getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}        
		
		
		
		

	}

}
