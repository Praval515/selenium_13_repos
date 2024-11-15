package exercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A$22$05 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.freshersworld.com/");
		
		driver.findElement(By.className("reg-btn")).click();
		WebElement locrDop = driver.findElement(By.xpath("//select[@name=\"currentCity\"]"));
		//locrDop.clear();
		Select city=new Select(locrDop);
		city.selectByValue("65");
		Select Qualification=new Select(driver.findElement(By.id("course")));
		Qualification.selectByValue("16");
		Thread.sleep(9000);
		driver.quit();
	}

}
