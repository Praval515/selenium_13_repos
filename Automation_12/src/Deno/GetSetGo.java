package Deno;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetGo 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		Point position = driver.manage().window().getPosition();
		System.out.println("x = "+position.getX());
		System.out.println("y = "+position.getY());
		driver.quit();
		
	}
	

}
