package testPackage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class TopjobsNavigate {
	private WebDriver driver;
//	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
//		System.setProperty("webdriver.chrome.driver", "");
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

//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
//
//	private boolean isAlertPresent() {
//		try {
//			driver.switchTo().alert();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}
//	}
//
//	private String closeAlertAndGetItsText() {
//		try {
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText();
//			if (acceptNextAlert) {
//				alert.accept();
//			} else {
//				alert.dismiss();
//			}
//			return alertText;
//		} finally {
//			acceptNextAlert = true;
//		}
//	}
}
