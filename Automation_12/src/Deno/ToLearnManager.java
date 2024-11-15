package Deno;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManager
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.agoda.com/en-in/");
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		driver.quit();
		
	}

}
