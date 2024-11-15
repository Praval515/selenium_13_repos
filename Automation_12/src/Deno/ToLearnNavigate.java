package Deno;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.redbus.com/");
		//driver.navigate().to("https://www.redbus.com/");
		driver.navigate().to(new URL("https://www.redbus.com/"));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
