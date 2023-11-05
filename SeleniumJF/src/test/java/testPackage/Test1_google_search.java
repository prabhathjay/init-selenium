package testPackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Config.PropertiesFile;

public class Test1_google_search {

	WebDriver driver = null;
	public static String browserName = null;


	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getProperties();
		//		driver = new ChromeDriver();

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else
			if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}

	}

	@org.testng.annotations.Test
	public void googleSearch() {
		driver.get("https://google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Prabhath Jayarathne");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);

	}

	//for testing multiple methods including or excluding in testNG Suite - check testng.xml
	@org.testng.annotations.Test
	public void googleSearch2() {
		driver.get("https://google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("testng xml");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDownTest() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		PropertiesFile.setProperties();
	}

}
