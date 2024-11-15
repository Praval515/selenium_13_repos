package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://demowebshop.tricentis.com/login");
		Rectangle rect = driver.findElement(By.id("small-searchterms")).getRect();
		System.out.println("Height: "+rect.getHeight());
		System.out.println("Width: "+rect.getWidth());
		System.out.println("X: "+rect.getX());
		System.out.println("Y: "+rect.getY());
		driver.quit();
		
	}

}
