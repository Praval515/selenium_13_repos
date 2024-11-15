package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopups 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.freshersworld.com/user/register?src=fwjobsearch");
		 driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\3rahu\\OneDrive\\Desktop\\0_Selenium Document .pdf");
		 System.out.println("Task completed");
		 driver.quit();
	}

}
