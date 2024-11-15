package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get(" http://127.0.0.1:5500/selenium.html/ex3.html");
		 List<WebElement> following = driver.findElements(By.xpath("//td[text()='kgf']/following-sibling::td"));
		 for (WebElement i : following) 
		 {
			 System.out.println(i);
		 }
		
		Object preceding = driver.findElement(By.xpath("//td[text()='kgf']/preceding-sibling::td")).getText();
		System.out.println(preceding);
		driver.quit();
	}

}
