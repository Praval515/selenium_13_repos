package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnDragAndDrop 
{
	private static final String PhotoFrame = null;

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		 driver.switchTo().frame(photoframe);
		 
		 WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		 WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		 WebElement img3 = driver.findElement(By.xpath("//img[@alt=\"Planning the ascent\"]"));
		 WebElement img4 = driver.findElement(By.xpath("//img[@alt=\"On top of Kozi kopka\"]"));
		 
		 WebElement target = driver.findElement(By.id("trash"));
		 Actions act=new Actions(driver);
		 act.dragAndDrop(img1, target).perform();
		 //Thread.sleep(2000);
		 act.dragAndDrop(img2, target).perform();
		 //Thread.sleep(2000);
		 act.dragAndDrop(img3, target).perform();
		 //Thread.sleep(2000);
		 act.dragAndDrop(img4, target).perform();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("Recycle image")).click();
		 
		 WebElement targetBack = driver.findElement(By.id("gallery"));
		 act.pause(2000).perform();
		 act.dragAndDrop(img3, targetBack).perform();
		 driver.quit();
	}

}
