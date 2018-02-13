package com.actitime.generic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	//To Get the data
	public static String getData(String path,String sheetName,int rn,int cn)
	{
		try
		{
			FileInputStream fis=new FileInputStream(new File (path));
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			String data=sh.getRow(rn).getCell(cn).toString();
			return data;
			
		}
		catch (Exception e)
		{
			return "";
		}
	}
//To get row count 
	public static int getRowCount(String path,String sheetName)
	{
		try
		{
			FileInputStream fis=new FileInputStream(new File(path));
			Workbook wb =WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			int rc=sh.getLastRowNum();
			return rc;
		}
		catch(Exception e )
		{
			return 0;
		}
	}
		public static int getCellCount(String path,String sheetName,int rn)
		{
			try
			{
				FileInputStream fis=new FileInputStream(new File (path));
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(sheetName);
				int cc=sh.getRow(rn).getLastCellNum();
				return cc;
				
		
			}
	
		catch (Exception e)
			{
			return 0;
			}
		
		
		}

}
