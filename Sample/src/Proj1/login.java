package Proj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class login {

	// comment //
	

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASK Computera\\Downloads\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("disable-infobars");
		
		//WebDriver driver  = new ChromeDriver(options);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	File file1 = new File("C:\\Selenium\\Projects\\Sample\\src\\excel\\Test Data.xlsx");
	FileInputStream fis = new FileInputStream(file1);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet Details = wb.getSheetAt(0);
	int rowcount = Details.getLastRowNum();
	rowcount = rowcount+1;
	System.out.println(rowcount);
	
	for(int rn=1;rn<rowcount;rn++) {
	
	System.out.println("=========");
	
	String Firstname = Details.getRow(rn).getCell(0).getStringCellValue();
	System.out.println(Firstname);
	String Surname = Details.getRow(rn).getCell(1).getStringCellValue();
	System.out.println(Surname);
	String Pass = Details.getRow(rn).getCell(2).getStringCellValue();
	System.out.println(Pass);
	int Birthday = (int) Details.getRow(rn).getCell(3).getNumericCellValue();
	System.out.println(Birthday);
	String Birthmonth = Details.getRow(rn).getCell(4).getStringCellValue();
	System.out.println(Birthmonth);
	//int Birthyear = (int) Details.getRow(rn).getCell(5).getNumericCellValue();
	//System.out.println(Birthyear);
	
	//String Birthyear = Details.getRow(rn).getCell(5).getRawValue();
	//System.out.println(Birthyear);
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASK Computera\\Downloads\\chromedriver.exe");
	
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("disable-infobars");
	
	//WebDriver driver  = new ChromeDriver(options);
	
	//WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	
	//driver.get("https://www.google.com");
	
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//driver.navigate().to("https://www.facebook.com");
	
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@id=\"u_0_k\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"u_0_k\"]")).sendKeys(Firstname);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	driver.findElement(By.name("lastname")).clear();
	driver.findElement(By.name("lastname")).sendKeys(Surname);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	driver.findElement(By.id("u_0_w")).clear();
	driver.findElement(By.id("u_0_w")).sendKeys(Pass);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	driver.findElement(By.id("u_0_b")).click();
	
    Select bday = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
    bday.selectByIndex(Birthday);
	
    Select month = new Select(driver.findElement(By.cssSelector("#month")));
    month.selectByVisibleText(Birthmonth);
    
    //driver.findElement(By.xpath("//*[@id=\"year\"]")).clear();
    //driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys(Birthyear);
    
    //Select year = new Select(driver.findElement(By.id("year")));
    //year.selectByIndex(Birthyear);

    driver.findElement(By.cssSelector("#u_0_12")).click();
    
    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("C:\\Selenium\\screenshots\\facebook.png"));
    
    //driver.navigate().to("https://mail.yahoo.com");
    
    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    //File file2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //FileUtils.copyFile(file2, new File("C:\\Selenium\\screenshots\\yahoo.png"));
    
	
	
	wb.close();
	
	}
	
	driver.close();
	System.out.println("script runs fine");
}
	
	
}
