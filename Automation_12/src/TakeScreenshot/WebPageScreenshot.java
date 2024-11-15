package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot 
{
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot tc = (TakesScreenshot)driver;
		File shot = tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/image.png");
		FileHandler.copy(shot, dest);
		driver=(WebDriver)tc;
		driver.quit();
	}

}
