package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/reg/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement genderTextField = driver.findElement(By.id("custom_gender"));
		js.executeScript("arguments[0].value='Suraj'", genderTextField);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		js.executeScript("arguments[0].value='RamaRao'",firstName );
		Thread.sleep(7000);
		driver.quit();
	}

}
