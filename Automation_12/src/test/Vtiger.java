package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();

		Set<String> win = driver.getWindowHandles();
		for (String i : win) {
			driver.switchTo().window(i);
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.vtiger.com/")) {
			    break;
			}
		}
		WebElement company = driver.findElement(By.partialLinkText("Company"));
		Actions act=new Actions(driver);
		act.moveToElement(company).perform();
		
		driver.findElement(By.partialLinkText("Contact Us")).click();
		
		
		
		Object text = driver.findElement(By.xpath("(//p[@class='mb-1'])[2]/..//p[@class='font-size-sm mb-0']")).getText();
		System.out.println(text);
		driver.quit();
	}

}
