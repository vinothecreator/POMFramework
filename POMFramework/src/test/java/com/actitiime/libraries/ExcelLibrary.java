package com.actitiime.libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	// helperMethods - Business class - apache POI

	public String getExcelData(String sheetName, int rowNum, int cellNum) {
		String data = null;

		try {
			//File Read from excel
			FileInputStream fis = new FileInputStream("C:\\Users\\vgunasekaran\\Desktop\\POMFramework\\POMFramework\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			data = c.getStringCellValue();
			// System.out.println("Data that is read from excel is" + data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		return data;

	}

	public int getRowCount(String sheetName) {
		
		//Excel RowCount 
		int rowCount = 0;
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\vgunasekaran\\\\Desktop\\\\POMFramework\\\\POMFramework\\\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			rowCount = s.getLastRowNum();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		return rowCount;

	}

	public void setExcelData(String SheetName, int rowNum, int cellNum, String data) {

		try {
			// Write data back to the excel
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\vgunasekaran\\\\Desktop\\\\POMFramework\\\\POMFramework\\\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(SheetName);
			Row r = s.getRow(rowNum);
			Cell c = r.createCell(cellNum);
			c.setCellValue(data);

		
			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\vgunasekaran\\\\Desktop\\\\POMFramework\\\\POMFramework\\\\TestData.xlsx");
			wb.write(fos);

			// System.out.println("Data that is read from excel is" + data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
