package simpleregistration;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalendarJavaascreeprtExecutor {

WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
			 driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.airindia.in/");
		
		
	}
	@Test
	public void airindia() {
		
		WebElement DPdate= driver.findElement(By.id("_depdateeu1"));
		String dateVal = "21/03/2022";
		WebElement RNdate= driver.findElement(By.id("_retdateeu1"));
		String RNdateVal = "29/03/2022";
		
		selectDPDateByJS(driver, DPdate , dateVal);
		selectRNDateByJS(driver, RNdate , RNdateVal);
		
		
		
		
	}
	
	
	
		public static void selectDPDateByJS(WebDriver driver, WebElement element, String dateVal) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
			
		}
		public static void selectRNDateByJS(WebDriver driver, WebElement element, String RNdateVal) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','"+RNdateVal+"');",element);
		}
		
	
		
		@AfterMethod
		public void close() {
		driver.manage().deleteAllCookies();
		}
		
		
}
