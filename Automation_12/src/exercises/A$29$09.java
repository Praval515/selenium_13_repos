package exercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A$29$09 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
		WebElement buttonLink = driver.findElement(By.id("btn30"));
		Actions act=new Actions(driver);
		act.contextClick(buttonLink).perform();
		
		WebElement yesLink = driver.findElement(By.xpath("//div[text()='Yes']"));
		act.click(yesLink).perform();
		System.out.println(driver.findElement(By.cssSelector("text-green-600 p-1 px-2 ms-2 rounded-md")));
//		String message = driver.findElement(By.className("text-green-600 p-1 px-2 ms-2 rounded-md")).getText();
//		System.out.println(message); 
//		System.out.println(message);
		
//		Thread.sleep(5000);
//		driver.quit();
	}
	public static void click(WebDriver driver,WebElement link) 
	{
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
	}

}
