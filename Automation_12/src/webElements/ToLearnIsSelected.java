package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver drivedr=new ChromeDriver();
		drivedr.manage().window().maximize();
		drivedr.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		WebElement goodRadioButton = drivedr.findElement(By.xpath("//input[@id='pollanswers-2']/..//input[@name='pollanswers-1']"));
		System.out.println("<.before click.>");
		System.out.println(goodRadioButton.isSelected());
		goodRadioButton.click();
		System.out.println("<.after click.>");
		System.out.println(goodRadioButton.isSelected());
		drivedr.quit();
	}

}
