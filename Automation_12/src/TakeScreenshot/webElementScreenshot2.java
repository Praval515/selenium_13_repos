package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webElementScreenshot2 
{
	public static void main(String[] args) throws IOException {
		String time = LocalDateTime.now().toString().replace(":","-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		File tem = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		File per=new File("./screenshot/elementimage1-"+time+".png");
		FileHandler.copy(tem, per);
		driver.quit();
	}

}
