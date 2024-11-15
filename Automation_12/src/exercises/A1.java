package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Thread.sleep(2000);
		if(driver.getCurrentUrl().contains("vtiger")) {
			System.out.println("currect");
		}
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("Testing");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(5000);
		System.out.println("complet");
		driver.quit();
	}

}
