package utils;

public class ExcelUtilsDemo {
	
	public static void main(String[] args) {
		ExcelUtils excel = new ExcelUtils("C:\\Users\\Dell\\eclipse-workspace\\SeleniumJF\\excel\\data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 1);
		excel.getCellDataNumber(1, 1);
		
	}

}
