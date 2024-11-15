package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSeledOctption 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/#:~:text=Skillrary%20tips%20for%20learning%20simple.%20You%20will%20be%20mentored%20by");
		WebElement priceSelected = driver.findElement(By.id("cars"));
		Select price=new Select(priceSelected);
		price.selectByIndex(4);
		price.selectByIndex(2);
		price.selectByIndex(0);
		price.selectByIndex(3);
		
		WebElement selectOption = price.getFirstSelectedOption();
		System.out.println(selectOption.getText());
		
		List<WebElement> selectAll = price.getAllSelectedOptions();
		System.out.println(selectAll.size());
		
		for (WebElement i : selectAll) 
		{
			System.out.println(i.getText());
		}
		
	
		Thread.sleep(5000);
		driver.quit();
	}

}
