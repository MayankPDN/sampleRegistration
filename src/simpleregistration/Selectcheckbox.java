package simpleregistration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selectcheckbox {

WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
			 driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	}
	@Test
	public void checkbox() {
		driver.findElement(By.cssSelector(".checkbox:nth-child(5) .cb1-element")).click();
	}
	@AfterMethod
	public void close() {
	driver.manage().deleteAllCookies();
	}
}
