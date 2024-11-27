package org.utilities;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public ArrayList<String> getExcelSheetData(int sheetNo)
	{
		ArrayList l1 = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheetAt(sheetNo);
			
			for(int j=1;j<=sh.getLastRowNum();j++)
			{
				Row r1 = sh.getRow(j);
				
				for(int i=0;i<r1.getLastCellNum();i++)
				{
					l1.add(r1.getCell(i));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l1;
	}
	public String getCustomerDetailsBySheetIndex(int sheetNum,int rowNum,int cellNum) throws Exception
	{
		
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheetAt(sheetNum);
			Row r1 = s1.getRow(rowNum);
			Cell c1 = r1.getCell(cellNum);
			CellType ct = c1.getCellType();
			switch(ct)
			{
				case STRING:
					return c1.getStringCellValue();
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(c1))
					{
						Date dt = c1.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
						String date = sdf.format(dt);
						return date;
					}
					else
					{
						long i = (long)c1.getNumericCellValue();
						String str = String.valueOf(i);
						return str;
					}
				default:
					return "Invalid details";
			}
		}
		catch (Exception e) {
			new Exception("Invalide Details");
		}
		return "Invalid details";
		
	}
	public String getCustomerDetailsBySheetName(String sheetName,int rowNum,int cellNum) throws Exception
	{
		
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet(sheetName);
			Row r1 = s1.getRow(rowNum);
			Cell c1 = r1.getCell(cellNum);
			CellType ct = c1.getCellType();
			
			switch(ct)
			{
				case STRING:
					return c1.getStringCellValue();
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(c1))
					{
						Date dt = c1.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
						String date = sdf.format(dt);
						return date;
					}
					else
					{
						long i = (long)c1.getNumericCellValue();
						String str = String.valueOf(i);
						return str;
					}
				default:
					return "Invalid details";
			}
		}
		catch (Exception e) {
			new Exception("Invalide Details");
		}
		return "Invalid details";
		
	}
	public String getSheetName(int sheetNum)
	{
		
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheetAt(sheetNum);
			return s1.getSheetName();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "InvalideSheetIndex";
	}
	public int totalSheet()
	{
		Workbook wb = null;
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wb.getNumberOfSheets();
	}
	public int getLastRowNum(int sheetNum)
	{
		Sheet s1 = null;
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			s1 = wb.getSheetAt(sheetNum);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1.getLastRowNum();
	}
	public int getPhysicalNumberOfRows(int sheetNum)
	{
		Sheet s1 = null;
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			s1 = wb.getSheetAt(sheetNum);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s1.getPhysicalNumberOfRows();
	}
	public int getLastCellNum(int sheetNum,int rowNum)
	{
		Row r1 = null;
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheetAt(sheetNum);
			r1 = s1.getRow(rowNum);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r1.getLastCellNum();
	}
	public int getPhysicalCellNum(int sheetNum,int rowNum)
	{
		Row r1 = null;
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheetAt(sheetNum);
			r1 = s1.getRow(rowNum);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r1.getPhysicalNumberOfCells();
	}
}
