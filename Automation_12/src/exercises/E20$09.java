package exercises;

import java.lang.*;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import locator.ToLearnSwithchToo;
import net.bytebuddy.build.Plugin.Engine.Source.Empty;

public class E20$09 extends ToLearnSwithchToo
{
	public static void main(String[] args) throws  InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Hyderabad to Bangalore Bus'])[1]")).click();
		//Thread.sleep(5000);
		//switchToWindow(driver, "source=Hyderabad&sourceId=3");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='collapsible-indicator col auto'])[1]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/..//input[@type='checkbox']")).click();
		//driver.quit();
		String str[] = new String[4];
		
	     List<WebElement> loc = driver.findElements(By.xpath("//strong[@class='h5 fare']"));
	     
	     
	     
	    /* Set price = new TreeSet<>();
	     for (WebElement priceElement : loc) {
			String priceText=priceElement.getText();
			if (!priceText.isEmpty()) {
				price.add(priceText);
			}
		}
	     if (price instanceof TreeSet) {
			Thread.sleep(20000);
			System.out.println(((TreeSet)price).last());
		}*/
	     
	     for (int i=1;i<=loc.size();i++) {
	    	 String str1="(//strong[@class='h5 fare'])"+'['+i+']';
	    	 str[i] = driver.findElement(By.xpath(str1)).getText();
			System.out.println(str[i]);
	     }
		
	}
}
