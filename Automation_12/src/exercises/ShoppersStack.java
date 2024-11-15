package exercises;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		Set<String> windows = driver.getWindowHandles();
		for (String i : windows) {
			driver.switchTo().window(i);
			String url = driver.getCurrentUrl();
			
			if (url.contains("amazon")) {
				break;
			}
		}
		Actions act=new Actions(driver);
		act.scrollByAmount(300, 500).perform();
	}

}
