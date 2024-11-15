package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertiesFile 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		//step(1): create object for FileInputStream
		FileInputStream fil=new FileInputStream("./TestData/DemoAppSkillary.properties");
		//step(2): create respective file type object
		Properties prop=new Properties();
		//step(3): call read method
		prop.load(fil);
		String url = prop.getProperty("url");		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");		
		
		
		//System.out.println(prop.getProperty("url"));
		//System.out.println(prop.getProperty("username"));
		//System.out.println(prop.getProperty("password"));
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
