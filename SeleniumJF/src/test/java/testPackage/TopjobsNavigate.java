package testPackage;


import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class TopjobsNavigate {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@Test
	public void topjobsNavigateTest() throws Exception {
		driver.get("https://www.topjobs.lk/");
		driver.findElement(By.linkText("IT-Sware/DB/QA/Web/Graphics/GIS")).click();
		driver.findElement(By.xpath("//label[3]/span")).click();
		driver.findElement(By.xpath("//label[3]/span")).click();
		driver.findElement(By.id("txtKeyWord")).click();
		driver.findElement(By.id("txtKeyWord")).clear();
		driver.findElement(By.id("txtKeyWord")).sendKeys("automation");
		driver.findElement(By.id("btnSearch4")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
