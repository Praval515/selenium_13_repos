package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
	    List<WebElement> allLink = driver.findElements(By.tagName("a"));
	    System.out.println(allLink.size());
	    List<WebElement> allImages = driver.findElements(By.tagName("img"));
	    System.out.println(allImages.size());
	    allLink.get(allLink.size()-1).click();
	    
	    for (WebElement i : allLink) {
	    	System.out.println(i.getText());
			
		}
	    Thread.sleep(5000);
	    driver.quit();
	}

}
