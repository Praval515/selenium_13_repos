package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.time.Duration;

import javax.imageio.spi.RegisterableService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	@Test
	public void register() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		
		Assert.fail();//explicitly use to throw script fail
		
		Reporter.log("Register is successful",true);
		driver.quit();
	}
	@Test(dependsOnMethods = "register")
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		
		Reporter.log("login is successful",true);
		driver.quit();
	}
	@Test(dependsOnMethods = {"register","login"})
	public void addToCart() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/cart");
		
		Reporter.log("product added to cart successful",true);
		driver.quit();
		
	}

}
