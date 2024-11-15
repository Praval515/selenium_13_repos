package exercises;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A02$10 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoframe);
		WebElement img1 = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt=\"The chalet at the Green mountain lake\"]"));
		
		WebElement target = driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(img1, target).perform();
		act.dragAndDrop(img2, target).perform();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		Set<String> window = driver.getWindowHandles();
		for (String i : window) {
			if(i.contains("sql-cheat-sheet")){
				driver.switchTo().window(i);
				break;
			}
			else {
				driver.close();
			}
			WebElement tillsql = driver.findElement(By.xpath("(//img[@class=\"wp-block-jetpack-slideshow_image wp-image-6445 jetpack-lazy-image jetpack-lazy-image--handled\"])[1]"));
			act.scrollToElement(tillsql).perform();
		}
	}

}
