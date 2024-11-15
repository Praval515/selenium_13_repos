package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClassName 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/electronics");
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("Email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.quit();
	}

}
