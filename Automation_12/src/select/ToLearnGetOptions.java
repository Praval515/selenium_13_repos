package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/#:~:text=Skillrary%20tips%20for%20learning%20simple.%20You%20will%20be%20mentored%20by");
		WebElement priceListBox = driver.findElement(By.id("cars"));
		
		Select price=new Select(priceListBox);
		List<WebElement> alloption = price.getOptions();
		System.out.println(alloption.size());
		for (WebElement i : alloption) 
		{
		System.out.println(i.getText());	
		}
		Thread.sleep(5000);
		price.deselectAll();
		System.out.println(price.isMultiple());
		driver.quit();
	}

}
