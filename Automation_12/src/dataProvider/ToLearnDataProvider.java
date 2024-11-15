package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider 
{
	
	@Test(dataProviderClass = DataStorage.class,dataProvider = "dataProvider")
	public void login(String[] data) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.findElement(By.id("email")).sendKeys(data[0]);
		driver.findElement(By.id("password")).sendKeys(data[1]);
		Assert.assertEquals(driver.getTitle(), "")
		Thread.sleep(5000);
		driver.quit();
	}

}
