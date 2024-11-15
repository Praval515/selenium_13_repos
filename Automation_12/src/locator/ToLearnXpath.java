package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("mobiles");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
