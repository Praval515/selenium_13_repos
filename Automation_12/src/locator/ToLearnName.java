package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnName 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("498569");
	Thread.sleep(2000);
	driver.findElement(By.name("password ")).sendKeys("sjhdgfj");
	Thread.sleep(5000);
	driver.quit();
	}
}
