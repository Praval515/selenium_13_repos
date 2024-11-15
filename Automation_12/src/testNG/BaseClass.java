package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	public WebDriver driver;
    public Properties prop;
    public Workbook workBook;
    @BeforeTest
    public void beforeTest() throws IOException {
    	//property file
    	FileInputStream fis=new FileInputStream("./TestData/commanData.properties");
    	prop=new Properties();
    	prop.load(fis);
    	
    	//excel file
    	FileInputStream efis=new FileInputStream("./TestData/testData.xlsx");
    	workBook=WorkbookFactory.create(efis);
    }
	@BeforeClass
	public  void beforeClass() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get(prop.getProperty("url"));
		
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText("Log out")).click();
		
	}
	@AfterTest
	public void closeObject() throws IOException {
		workBook.close();
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
