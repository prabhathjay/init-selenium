package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.GoogleSearchPageObjects;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.com/");
		System.out.println("Navigating to :"+driver.getTitle());
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
		obj.sendTextInSearchBox("test123");
		System.out.println("Search text entered");
//		obj.clickSearchButton();
		
		driver.close();
		driver.quit();
		
	}
	
}
