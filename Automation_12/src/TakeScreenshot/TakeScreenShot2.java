package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot2 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String time = LocalDateTime.now().toString().replace(":","-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		TakesScreenshot tr=(TakesScreenshot)driver;
		File tem = tr.getScreenshotAs(OutputType.FILE);
		File per=new File("./screenshot/"+time+".png");
		FileHandler.copy(tem, per);
		
		System.out.println(time);
		driver=(WebDriver)tr;
		driver.quit();
	}

}
