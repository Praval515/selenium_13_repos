package Deno;

import java.util.Set;

import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> alWindowIds = driver.getWindowHandles();
		System.out.println(alWindowIds);
		
		for (String id : alWindowIds) 
		{
			System.out.println(id);
		}
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}

}
