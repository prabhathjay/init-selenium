package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By textbox_search = By.id("APjFqb");
	By button_search = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sendTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	
	
}
