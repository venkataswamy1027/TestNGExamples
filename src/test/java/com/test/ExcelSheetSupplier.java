package com.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelSheetSupplier {

	@DataProvider
	public String[][] getData() throws Exception {
		File file = new File("./src/test/resources/TestBook1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfCells = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[numberOfRows - 1][numberOfCells];

		for (int i = 0; i < numberOfRows - 1; i++) {
			for (int j = 0; j < numberOfCells; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
			}
		}
		workbook.close();
		fis.close();
		return data;
	}

}
