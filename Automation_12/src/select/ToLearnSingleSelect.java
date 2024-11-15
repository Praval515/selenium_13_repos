package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/reg/");
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select date=new Select(driver.findElement(By.id("day")));
		Select year=new Select(driver.findElement(By.id("year")));
		Select month=new Select(monthDropdown);
		month.selectByIndex(3);
		year.selectByIndex(3);
		date.selectByIndex(2);
		Thread.sleep(2000);
		month.selectByValue("6");
		year.selectByValue("2018");
		date.selectByValue("14");
		Thread.sleep(2000);
		month.selectByVisibleText("Oct");
		year.selectByVisibleText("2000");
		date.selectByVisibleText("22");	
		Thread.sleep(2000);
		driver.quit();
	}

}
