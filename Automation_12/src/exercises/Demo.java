package exercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{	
	@Test(priority = 1,invocationCount = 2)
	public void creatAccount() {
		Reporter.log("Account Creation Done",true);
		
	}
	@Test(priority = 3)
	public void deletAccount() {
		Reporter.log("Account Deleted",true);
	}
	@Test(priority = 2,invocationCount = 3,threadPoolSize = 3)
	public void editAccount() {
		Reporter.log("account Edited",true);
	}
}
