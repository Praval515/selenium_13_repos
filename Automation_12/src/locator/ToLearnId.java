package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("testing@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("jxfbgkjdfi");
		driver.findElement(By.id("Log in")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
