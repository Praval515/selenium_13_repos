package Deno;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		if 
		
			(title.equals("online shoping site for Mobile , Electronics"));
		
		else 
		{
			System.out.println("user failled to navigate");
		}
		}
	}


