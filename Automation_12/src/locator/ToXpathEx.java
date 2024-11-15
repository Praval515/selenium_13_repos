package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToXpathEx 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).click();
		Thread.sleep(5000);
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();
		Thread.sleep(5000);
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Instagram from Meta')]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
