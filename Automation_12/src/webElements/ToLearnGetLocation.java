package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetLocation 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(5000);
		Point loc = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		System.out.println(loc);
		driver.quit();
	}

}
