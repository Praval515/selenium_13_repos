package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopups 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(20000);
		 driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		 
		 driver.findElement(By.xpath("//p[@data-cy=\"departureDate\"]")).click();
		 String month="June";
		 int year=2025;
		 int date = 25;
		 
		 while (true) 
		 {
			 try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
				System.out.println("Task completed");
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
		}
		 driver.quit(); 
	}

}
