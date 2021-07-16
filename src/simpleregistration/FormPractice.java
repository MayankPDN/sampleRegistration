package simpleregistration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FormPractice {

WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
			 driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	}
	@Test (priority=1)
	public void NC1() {
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1111111111");
		driver.findElement(By.name("address")).sendKeys("15 Bharat Street");
		driver.findElement(By.name("city")).sendKeys("Rajasthan");
		driver.findElement(By.name("state")).click();
		driver.findElement(By.name("zip")).sendKeys("N2c2c9");
		driver.findElement(By.name("website")).sendKeys("xyz.yyz.com");
		driver.findElement(By.cssSelector(".radio:nth-child(2) input")).click();
		driver.findElement(By.name("comment")).sendKeys("practice for selenium");
		driver.findElement(By.cssSelector(".btn")).click();
		WebElement state = driver.findElement(By.name("state"));
		SelectValueFromDropDown(state, ("Arizona"));

	}
		@Test (priority=2)
		public void NC2() {
			driver.findElement(By.name("first_name")).sendKeys("Hawana");
			driver.findElement(By.name("last_name")).sendKeys("Dominos");
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("ppq@gmail.com");
			driver.findElement(By.name("phone")).sendKeys("4512789423");
			driver.findElement(By.name("address")).sendKeys("20 Bharat Street");
			driver.findElement(By.name("city")).sendKeys("Gorila");
			driver.findElement(By.name("state")).click();
			driver.findElement(By.name("zip")).sendKeys("N2c2c9");
			driver.findElement(By.name("website")).sendKeys("xyz.yyz.com");
			driver.findElement(By.cssSelector(".radio:nth-child(2) input")).click();
			driver.findElement(By.name("comment")).sendKeys("practice for selenium");
			driver.findElement(By.cssSelector(".btn")).click();
			WebElement state = driver.findElement(By.name("state"));
			SelectValueFromDropDown(state, ("Georgia"));
		}
		@Test (priority=3)
		public void NC3() {
			driver.findElement(By.name("first_name")).sendKeys("11145646");
			driver.findElement(By.name("last_name")).sendKeys("000000");
			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("ppq@gmail.com");
			driver.findElement(By.name("phone")).sendKeys("4512789423");
			driver.findElement(By.name("address")).sendKeys("20 Bharat Street");
			driver.findElement(By.name("city")).sendKeys("Gorila");
			driver.findElement(By.name("state")).click();
			driver.findElement(By.name("zip")).sendKeys("N2c2c9");
			driver.findElement(By.name("website")).sendKeys("xyz.yyz.com");
			driver.findElement(By.cssSelector(".radio:nth-child(2) input")).click();
			driver.findElement(By.name("comment")).sendKeys("practice for selenium");
			driver.findElement(By.cssSelector(".btn")).click();
			WebElement state = driver.findElement(By.name("state"));
			SelectValueFromDropDown(state, ("Georgia"));
		}
			
			@Test (priority=4)
			public void NC4() {
				driver.findElement(By.name("first_name")).sendKeys("#nj*");
				driver.findElement(By.name("last_name")).sendKeys("@$%ght");
				driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("ppq@gmail.com");
				driver.findElement(By.name("phone")).sendKeys("4512789423");
				driver.findElement(By.name("address")).sendKeys("20 Bharat Street");
				driver.findElement(By.name("city")).sendKeys("Gorila");
				driver.findElement(By.name("state")).click();
				driver.findElement(By.name("zip")).sendKeys("N2c2c9");
				driver.findElement(By.name("website")).sendKeys("xyz.yyz.com");
				driver.findElement(By.cssSelector(".radio:nth-child(2) input")).click();
				driver.findElement(By.name("comment")).sendKeys("practice for selenium");
				driver.findElement(By.cssSelector(".btn")).click();
				WebElement state = driver.findElement(By.name("state"));
				SelectValueFromDropDown(state, ("Georgia"));
			}
				@Test (priority=5)
				public void NC5() {
					driver.findElement(By.name("first_name")).sendKeys("#nj*");
					driver.findElement(By.name("last_name")).sendKeys("@$%ght");
					driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("@123xyz.");
					driver.findElement(By.name("phone")).sendKeys("4512789423");
					driver.findElement(By.name("address")).sendKeys("20 Bharat Street");
					driver.findElement(By.name("city")).sendKeys("Gorila");
					driver.findElement(By.name("state")).click();
					driver.findElement(By.name("zip")).sendKeys("N2c2c9");
					driver.findElement(By.name("website")).sendKeys("xyz.yyz.com");
					driver.findElement(By.cssSelector(".radio:nth-child(2) input")).click();
					driver.findElement(By.name("comment")).sendKeys("practice for selenium");
					driver.findElement(By.cssSelector(".btn")).click();
					WebElement state = driver.findElement(By.name("state"));
					SelectValueFromDropDown(state, ("Georgia"));
				}
				@Test (priority=6)
				public void NC6() {
					driver.findElement(By.name("first_name")).sendKeys("#nj*");
					driver.findElement(By.name("last_name")).sendKeys("@$%ght");
					driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("@123xyz.");
					driver.findElement(By.name("phone")).sendKeys("123XYZ");
					driver.findElement(By.name("address")).sendKeys("20 Bharat Street");
					driver.findElement(By.name("city")).sendKeys("Gorila");
					driver.findElement(By.name("state")).click();
					driver.findElement(By.name("zip")).sendKeys("N2c2c9");
					driver.findElement(By.name("website")).sendKeys("xyz.yyz.com");
					driver.findElement(By.cssSelector(".radio:nth-child(2) input")).click();
					driver.findElement(By.name("comment")).sendKeys("practice for selenium");
					driver.findElement(By.cssSelector(".btn")).click();
					WebElement state = driver.findElement(By.name("state"));
					SelectValueFromDropDown(state, ("Louisiana"));
	}
	public static void SelectValueFromDropDown(WebElement element, String value) {
		Select select = new Select (element);// create new method for select like this out side of main method , split date as above and use string array
		select.selectByVisibleText(value);
		
			
		}
		@AfterMethod
		public void close() {
		driver.close();
	}
	
}
