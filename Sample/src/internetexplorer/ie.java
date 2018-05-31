package internetexplorer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.ie.driver", "C:\\Users\\ASK Computera\\Downloads\\IEDriverServer_x64_3.11.1\\IEDriverServer.exe");	
	
	WebDriver driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	
	driver.get("https://google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElement(By.name("q")).sendKeys("amazon");
	driver.findElement(By.className("\"lsb")).click();
	
	
	System.out.println(driver.getTitle());
	
	//driver.close();
	

	}

}
