package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.PropertiesFile;

public class ExcelDataProvider {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();

	}



	@Test(dataProvider = "test1data")
	public void test1(String username, String password) throws Exception {
//		System.out.println(username+" | "+password);
		
		driver.get("https://falcon.citypak.lk/login");
		driver.findElement(By.name("login")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		
	}


	@DataProvider(name="test1data")
	public Object[][] getData() {
		Object data[][] = testData("C:/Users/Dell/eclipse-workspace/SeleniumJF/excel/data.xlsx", "Sheet1");
		return data;
	}

	public Object[][] testData(String excelPath,String sheetName){

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for (int i=1; i<rowCount; i++) {
			for (int j=0; j<colCount; j++ ) {
				String cellData = excel.getCellDataString(i, j);
				//				System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			//			System.out.println();
		}
		return data;
	}



}
