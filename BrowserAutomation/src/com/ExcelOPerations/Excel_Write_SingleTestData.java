package com.ExcelOPerations;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class Excel_Write_SingleTestData
{

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file=new FileInputStream("./src/Excel_TestData/SingleTestData.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		Row r=sheet.createRow(3);
		
		Cell c=r.createCell(6);
		
		c.setCellValue("Chaitu");
		
		FileOutputStream file1=new FileOutputStream("./src/Excel_TestData/SingleTestData.xlsx");
		
		workBook.write(file1);
		
		
		
		
		
		
		

	}

}
