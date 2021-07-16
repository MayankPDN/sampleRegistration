package simpleregistration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import TestUtil.UtilityToGetDataFromExcel;


public class BaseballRegistration {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
			 driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.kitchenerminorbaseball.ca/");
	}
	@DataProvider
	public Iterator<Object[]> getTestData() {
	ArrayList<Object[]> testData= UtilityToGetDataFromExcel.getdataFromExcel();
	return testData.iterator();
	}
		
	
	
		@Test (dataProvider="getTestData")
		public void Testcase_1(String FirstName, String LastName ,String StreetAddress , String City , String State, String Postal,String DOB, String ParentsFirstName 
				) throws IOException {
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.className("fl-button-text")).click();
		
		driver.switchTo().frame(0); 
		
		driver.findElement(By.id("first_3")).sendKeys("FirstName");
		driver.findElement(By.name("q3_playerName[last]")).sendKeys("LastName");
		driver.findElement(By.name("q4_playerAddress[addr_line1]")).sendKeys("StreetAddress");
		driver.findElement(By.name("q4_playerAddress[city]")).sendKeys("City");
		driver.findElement(By.name("q4_playerAddress[state]")).sendKeys("State");
		driver.findElement(By.name("q4_playerAddress[postal]")).sendKeys("Postal");
		driver.findElement(By.xpath("//input[@class='form-textbox validate[required, limitDate, validateLiteDate]']")).sendKeys("DOB");
		driver.findElement(By.id("first_12")).sendKeys("ParentsFirstName");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir+"‪‪/BaseballClick/"+System.currentTimeMillis()+".png"));
		
	}
//		@Test
//		public void Testcase_2() {
//		
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.className("fl-button-text")).click();
//		
//		driver.switchTo().frame(0); 
//		
//		driver.findElement(By.id("first_3")).sendKeys("Neetika");
//		driver.findElement(By.name("q3_playerName[last]")).sendKeys("lastname");
//		driver.findElement(By.name("q4_playerAddress[addr_line1]")).sendKeys("17 highpark ave");
//		driver.findElement(By.name("q4_playerAddress[city]")).sendKeys("kitchener");
//		driver.findElement(By.name("q4_playerAddress[state]")).sendKeys("ON");
//		driver.findElement(By.name("q4_playerAddress[postal]")).sendKeys("N2P2N9");
//		driver.findElement(By.xpath("//input[@class='form-textbox validate[required, limitDate, validateLiteDate]']")).sendKeys("10-12-1980");
//		driver.findElement(By.id("first_12")).sendKeys("parentfirstname");
//		}
//		
//		@Test(invocationCount=2)
//		public void Testcase_3() {
//		
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.className("fl-button-text")).click();
//		
//		driver.switchTo().frame(0); 
//		
//		driver.findElement(By.id("first_3")).sendKeys("Preyal");
//		driver.findElement(By.name("q3_playerName[last]")).sendKeys("lastname");
//		driver.findElement(By.name("q4_playerAddress[addr_line1]")).sendKeys("17 highpark ave");
//		driver.findElement(By.name("q4_playerAddress[city]")).sendKeys("kitchener");
//		driver.findElement(By.name("q4_playerAddress[state]")).sendKeys("ON");
//		driver.findElement(By.name("q4_playerAddress[postal]")).sendKeys("N2P2N9");
//		driver.findElement(By.xpath("//input[@class='form-textbox validate[required, limitDate, validateLiteDate]']")).sendKeys("10-12-1980");
//		driver.findElement(By.id("first_12")).sendKeys("parentfirstname");
//		}
	@AfterMethod
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
		
		
		
		
		
		 
	

}
