package exercises;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	FileInputStream fil=new FileInputStream("./TestData/demowebshop.xlsx");
	Workbook workbook = WorkbookFactory.create(fil);
	String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String firstName = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String lastName = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	String email = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	String pass = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(firstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(5000);
	driver.quit();
	
	}

}
