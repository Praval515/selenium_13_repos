package exercises;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A22$04 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		String time = LocalDateTime.now().toString().replace(":","-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		if(driver.getWindowHandle().contains("flipkart"))
		System.out.println(true);
		driver.findElement(By.className("Pke_EE")).sendKeys("mobile");
		driver.findElement(By.className("_2iLD__")).click();
		TakesScreenshot tc = (TakesScreenshot)driver;
		File temp = tc.getScreenshotAs(OutputType.FILE);
		File per=new File("./screenshot/webpageimage"+time+".png");
		FileHandler.copy(temp, per);
		driver=(WebDriver)tc;
		driver.quit();
	}

}
