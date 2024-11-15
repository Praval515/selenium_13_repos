package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();;
		Set<String> windowid = driver.getWindowHandles();
		for (String i : windowid) {
			driver.switchTo().window(i);
			String url = driver.getCurrentUrl();
			if (url.contains("flipkart")) {
				break;
			}
			
		}
		driver.manage().window().maximize();
		driver.close();
		Thread.sleep(5000);
		driver.quit();
	}

}
