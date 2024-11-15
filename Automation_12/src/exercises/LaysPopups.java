package exercises;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaysPopups 
{
	private static final OutputType File = null;

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		String month = "January";
		int date=02;
		int year=2025;
		
		while (true) 
		{
			try {
				driver.findElement(By.xpath("//span[text()='"+month+"']/..//span[text()='"+year+"']/../../..//span[text()='"+date+"']")).click();
				System.out.println("Task completed");
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("(//div[@class=' col auto'])[3]")).click();
			}
			
		}
		TakesScreenshot sr=(TakesScreenshot)driver;
		java.io.File temp = sr.getScreenshotAs(OutputType.FILE);
		File per=new File("./screenshot/image.png");
		FileHandler.copy(temp, per);
	}

}
