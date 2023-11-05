package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportBasics {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentSparkReporter spark = new ExtentSparkReporter("spark.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		ExtentTest test1 = extent.createTest("Test-1", "Test case of google search event");
		
		test1.log(Status.INFO,"Logging the first test event status" );
//		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		test1.pass("Navigated to google.com");
		
		WebElement textBox = driver.findElement(By.id("APjFqb"));
		textBox.sendKeys("extent reports");
		test1.pass("Text entered to search box");
		
		
		List<WebElement> listElements = driver.findElements(By.xpath("//input"));
		int count = listElements.size();
		System.out.println("count :"+count);
		test1.pass("Page input count taken");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test1.pass("3 seconds timout done");
		driver.close();
		test1.log(Status.INFO,"Test completed successfully!" );
		
		//Test-2
		ExtentTest test2 = extent.createTest("Test-2", "Test case of google search event with fail status");
		
		test2.log(Status.INFO,"Logging the first test event status" );
		
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		test2.pass("Navigated to google.com");
		
		WebElement textBox1 = driver.findElement(By.id("APjFqb"));
		textBox1.sendKeys("extent reports");
		test2.pass("Text entered to search box");
		
		
		List<WebElement> listElements1 = driver.findElements(By.xpath("//input"));
		int count1 = listElements1.size();
		System.out.println("count :"+count1);
		test2.fail("Page input counting failed");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test2.pass("3 seconds timout done");
		driver.close();
		test2.log(Status.INFO,"Test completed successfully!" );
		extent.flush();
		
	}

}
