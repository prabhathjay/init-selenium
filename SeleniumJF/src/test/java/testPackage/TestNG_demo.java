package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;
import pages.GoogleSearchPages;

public class TestNG_demo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
//		driver.findElement(By.id("APjFqb")).sendKeys("Prabhath Jayarathne");
//		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
//		GoogleSearchPages.textbox_search(driver).sendKeys("prabhath jayarathne");
//		GoogleSearchPages.textbox_search(driver).sendKeys(Keys.RETURN);
		
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
		obj.sendTextInSearchBox("test123");
		obj.clickSearchButton();
		
		
		
	}

}
