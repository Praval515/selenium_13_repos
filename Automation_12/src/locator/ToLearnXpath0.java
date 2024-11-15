package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath0 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dunzo.com/search");
		//driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")).click();
		String collection = driver.findElement(By.xpath("(//p[text()='Apple - Kashmiri'])[1]/../..//p[contains(text(),'₹')]")).getText();
        System.out.println(collection);
		Thread.sleep(5000);
		driver.quit();
	}

}
