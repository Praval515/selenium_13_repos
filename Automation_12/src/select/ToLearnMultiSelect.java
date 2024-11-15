package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelect 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/#:~:text=Skillrary%20tips%20for%20learning%20simple.%20You%20will%20be%20mentored%20by");
		Select priceScale=new Select(driver.findElement(By.id("cars")));
//		priceScale.selectByIndex(2);
//		priceScale.selectByValue("199");
		priceScale.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		Thread.sleep(2000);
		driver.quit();
	}

}
