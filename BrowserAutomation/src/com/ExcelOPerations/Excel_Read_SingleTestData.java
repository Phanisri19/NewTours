
package com.ExcelOPerations;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData
{
	public static void main(String args[]) throws IOException
	{
		
		FileInputStream file=new FileInputStream("./src/Excel_TestData/SingleTestData.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		
		XSSFSheet Sheet=workBook.getSheet("Sheet1");
		
		Row r=Sheet.getRow(0);
		
		Cell c=r.getCell(0);
		
		String data=c.getStringCellValue();

		System.out.println(data);
	}
}


