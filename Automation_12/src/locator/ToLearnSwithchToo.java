package locator;

import java.util.Set;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Deno.ToLearnGetWindowHandles;

public class ToLearnSwithchToo 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/15");
	Thread.sleep(20000);
	driver.findElement(By.id("compare")).click();
	
	switchToWindow(driver, "flipkart");
	Point flipkartpoti = driver.manage().window().getPosition();
	switchToWindow(driver, "ebay");
	Point ebaypoi = driver.manage().window().getPosition();
	driver.manage().window().setPosition(flipkartpoti);
	switchToWindow(driver, "flipkart");
	driver.manage().window().setPosition(ebaypoi);
	switchToWindow(driver, "ebay");
	driver.manage().window().maximize();
	driver.findElement(By.id("gh-ac")).sendKeys("mobile");
	driver.findElement(By.id("gh-btn")).click();
	
	}
      public static void switchToWindow(WebDriver driver,String url) 
      {
         for (String i : driver.getWindowHandles()) 
         {
			driver.switchTo().window(i);
			
			if (driver.getCurrentUrl().contains(url)) {
				break;
			}
		}
        

	}  
	
}	


