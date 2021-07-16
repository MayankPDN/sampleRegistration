package simpleregistration;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumeasyDragandDrop {

WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
			 driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
	}
		@Test
		public void drag() throws IOException {
			Actions action= new Actions(driver);
			
			action.clickAndHold(driver.findElement(By.cssSelector("#todrag > span:nth-child(2)"))).moveToElement(driver.findElement(By.id("mydropzone"))).build().perform();
			//action.clickAndHold(driver.findElement(By.cssSelector("#todrag > span:nth-child(3)"))).moveToElement(driver.findElement(By.id("mydropzone"))).build().perform();
			//action.clickAndHold(driver.findElement(By.cssSelector("#todrag > span:nth-child(4)"))).moveToElement(driver.findElement(By.id("mydropzone"))).build().perform();
			//action.clickAndHold(driver.findElement(By.cssSelector("#todrag > span:nth-child(5)"))).moveToElement(driver.findElement(By.id("mydropzone"))).build().perform();
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // This line is for WebDriver
			FileUtils.copyFile(scrFile, new File("‪E:\\screenshot.png"));
		}
		 
		
	
		
		@AfterMethod
		public void close() {
		driver.manage().deleteAllCookies();
		}
		
		
}
