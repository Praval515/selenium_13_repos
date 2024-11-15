package Deno;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshope.tricentis.com");
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
	}

}
