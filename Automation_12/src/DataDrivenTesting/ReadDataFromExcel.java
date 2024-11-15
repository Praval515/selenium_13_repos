package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//step: create fis object
		FileInputStream fis=new FileInputStream("./TestData/testData.xlsx");
		
		//stedp2: crate respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step3: call read method
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);

		String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);

		String pass = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(pass);
		
		int price = (int) workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		 System.out.println(price);
		
		 
		boolean bool = workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(bool);
		
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println(date);
		Month month = date.getMonth();
		int dateofmonth = date.getDayOfMonth();
		int year = date.getYear();
		
		System.out.println(month);
		System.out.println(dateofmonth);
		System.out.println(year);
		
		
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get(url);
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys(username);
//		driver.findElement(By.id("Password")).sendKeys(pass);
//		
//		
//		Thread.sleep(5000);
//		driver.quit();
	}

}
