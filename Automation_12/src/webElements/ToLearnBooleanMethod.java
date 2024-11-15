package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethod 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Display Statusd: ="+button.isDisplayed());
		System.out.println("Enable Status: ="+button.isEnabled());
		driver.quit();*/
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();

		try {
			WebElement genderTF = driver.findElement(By.id("custom_gender"));
			System.out.println(genderTF.isDisplayed());
		} catch (Exception e) {
            System.out.println("it is not displayes");
		}
		driver.quit();
		
	}

}
