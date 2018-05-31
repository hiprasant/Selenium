package internetexplorer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\ASK Computera\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://mail.google.com");
	driver.navigate().to("https://facebook.com");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("hiprasant");
	
	System.out.println(driver.getTitle());
	
	//driver.close();
	
	
	}

}
