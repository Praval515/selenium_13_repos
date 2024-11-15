package exercises;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A16$sept 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.getCurrentUrl().contains("demowebshop");
		driver.findElement(By.linkText("Facebook")).click();
		switchto(driver, "facebook");
		driver.getCurrentUrl().contains("facebook");
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		switchto(driver, "Register");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("ram");	
	}
	public static void switchto(WebDriver driver,String url) 
	{
		for (String i : driver.getWindowHandles()) 
        {
			driver.switchTo().window(i);
			if (driver.getCurrentUrl().contains(url)) 
			{
				break;
			}
	}
	}
}
