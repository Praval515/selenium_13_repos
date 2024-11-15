package select;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelectOneByOne
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/reg/");
		WebElement month = driver.findElement(By.id("month"));
		Select linkmonth=new Select(month);
		
		System.out.println(linkmonth.getOptions().size());
		
		for(int i=0;i<=linkmonth.getOptions().size();i++) 
		{
			linkmonth.selectByIndex(i);
			//Thread.sleep(3000);
			System.out.println();
		}
//		Thread.sleep(5000);
		driver.quit();
	}

}
