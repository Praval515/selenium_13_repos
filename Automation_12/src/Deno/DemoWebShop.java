package Deno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DemoWebShop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Twitter")).click();
		 Set<String> winId = driver.getWindowHandles();
		System.out.println(winId);
		
		for(String i:winId)
		{
			System.out.println(i);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
