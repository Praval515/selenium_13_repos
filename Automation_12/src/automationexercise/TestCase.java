package automationexercise;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase extends BaseClass 
{
	@Test
	public void login() {
		
		Assert.assertEquals(driver.getTitle(),"Automation Exercise","welcome page is not displayed");
		Reporter.log("welcome page is displayed",true);
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		String loginField = driver.findElement(By.xpath("//div[@class='login-form']")).getText();
		Assert.assertEquals(driver.getTitle(),"Automation Exercise - Signup / Login","login field is not visible");
		Reporter.log("login field is visible",true);
		
		driver.findElement(By.xpath("(//input[@type=\"email\"])[1]")).sendKeys("pravalyadav8@gmail.com");
		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("praval@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String name = driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
		Assert.assertEquals(name,"Logged in as Praval","Logged in not as username");
		Reporter.log("Logged in as username",true);
		
		driver.findElement(By.partialLinkText(" Delete Account")).click();
		String delet = driver.findElement(By.className("title text-center")).getText();
		Assert.assertEquals(delet,"title text-center","account not deleted");
		Reporter.log("account deleted");
	}

}
