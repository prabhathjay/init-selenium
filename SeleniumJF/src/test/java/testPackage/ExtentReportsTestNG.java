package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTestNG {
	WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test1;
	
	
	@BeforeSuite
	public void setUp() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("spark.html");
		extent.attachReporter(spark);
		test1 = extent.createTest("Test-3", "Test case of google search event with testNG");
		test1.log(Status.INFO,"Test setUp started!");
		driver = new ChromeDriver();
		test1.pass("before test setUp completed!");
	}
	
	@org.testng.annotations.Test
	public void googleSearch() {
		driver.get("https://google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Prabhath Jayarathne");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		test1.pass("First search entry sent to searchbox");
		
	}
	
	@org.testng.annotations.Test
	public void googleSearch2() {
		
		driver.get("https://google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("testng xml");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		test1.pass("Second search entry sent to searchbox");
		test1.log(Status.INFO, "After test timeout started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		test1.pass("Timeout done and browser closed");
	}
	
	
	@AfterSuite
	public void tearDown() {
		test1.log(Status.INFO, "Test successfully completed and logged!");
		extent.flush();

	}
}
