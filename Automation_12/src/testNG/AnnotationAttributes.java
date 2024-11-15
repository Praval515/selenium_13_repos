package testNG;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes 
{
	@Test(priority = 2,enabled = false)
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	    Reporter.log("login execute",true);
		driver.quit();
	}
	@Test(priority = 1,invocationCount = 4,threadPoolSize = 4 )
	public void register()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("register excute",true);
		driver.quit();
	}

}
