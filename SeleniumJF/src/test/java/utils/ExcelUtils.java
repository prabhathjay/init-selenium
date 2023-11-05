package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//		getRowCount();
		//		getCellDataString(0,1);
		//		getCellDataNumber(1, 1);
	}

	public int getRowCount() {
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
//		System.out.println("No of rows in data sheet: "+rowCount);
		return rowCount;
	}

	public int getColCount() {
		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
//		System.out.println("No of columns in data sheet: "+colCount);
		return colCount;
	}

	public String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//		System.out.println(cellData);
		
		return cellData;

	}

	public void getCellDataNumber(int rowNum, int colNum) {
		double cellvalue = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
//		System.out.println(cellvalue);

	}

}
