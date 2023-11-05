import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumJF\\drivers\\geckodrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com/");
		
		WebElement textBox = driver.findElement(By.id("APjFqb"));
		textBox.sendKeys("prabhath jayarathne");
		
		List<WebElement> listElements = driver.findElements(By.xpath("//input"));
		int count = listElements.size();
		System.out.println("count :"+count);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}

}
