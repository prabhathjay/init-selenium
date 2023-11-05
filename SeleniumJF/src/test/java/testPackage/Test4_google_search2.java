package testPackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test4_google_search2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
	}
	
	@org.testng.annotations.Test
	public void googleSearch() {
		driver.get("https://google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Prabhath Jayarathne");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
	}
	
	@org.testng.annotations.Test
	public void googleSearch2() {
		driver.get("https://google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("testng xml");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
	}
	//for testing multiple methods including or excluding in testNG Suite - check testng.xml
	
	@AfterTest
	public void tearDownTest() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
