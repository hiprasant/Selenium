package Proj1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNg {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASK Computera\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
	}
		
	@Test
	public void TitleTest() {
		String title = driver.getTitle();
		System.out.println("the page title is:"+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		}
		
	@AfterMethod
	
	public void close() {
		driver.quit();
	}
	
	}

	