package Deno;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.css.model.CSSStyleSheetHeader;

public class ToLearnGetWindowHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 String windowId = driver.getWindowHandle();
		System.out.println(windowId);
	    Thread.sleep(2000);
	    driver.quit();
	}

}
