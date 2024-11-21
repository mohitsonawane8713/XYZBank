package org.utilities;

import java.io.FileInputStream;
import java.util.ArrayList;

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
	
}
