package exercises;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationexerciseTeseCase1 
{
	static int r=0;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://automationexercise.com");
		
		if(display(driver, "automationexercise"))
			System.out.println("verrified page");
		
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		if(display(driver, "login"))
			System.out.println("verrified login");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Praval");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("pravalyadav8@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		String name = driver.findElement(By.xpath("//input[@id='name']")).getAttribute("value");
		System.out.println(name);
		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("praval@123");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement day = driver.findElement(By.id("days"));
		WebElement month = driver.findElement(By.id("months"));
		WebElement year = driver.findElement(By.id("years"));
		js.executeScript("arguments[0].value='30'",day );
		js.executeScript("arguments[0].value='11'", month);
		js.executeScript("arguments[0].value='2000'", year);
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
		driver.findElement(By.id("first_name")).sendKeys("praval");
		driver.findElement(By.id("last_name")).sendKeys("yadav");
		driver.findElement(By.id("company")).sendKeys("Qspider");
		driver.findElement(By.id("address1")).sendKeys("BTM");
		driver.findElement(By.id("address2")).sendKeys("Banglore");
		js.executeScript("arguments[0].value='India'", driver.findElement(By.id("country")));
		driver.findElement(By.id("state")).sendKeys("karnataka");
		driver.findElement(By.id("city")).sendKeys("Banglore");
		driver.findElement(By.id("zipcode")).sendKeys("560010");
		driver.findElement(By.id("mobile_number")).sendKeys("7983547015");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		if(display(driver, "account_created"))
			System.out.println("verrified account_created");
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getAttribute("<b>");
		//driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
		if(display(driver, "delete_account"))
			System.out.println("Account deleted");
		
		Thread.sleep(9000);
		driver.quit();
	}
public static boolean display(WebDriver driver,String page) 
{
	Set<String> wind = driver.getWindowHandles();
	for (String i : wind) 
	{
		String url = driver.getCurrentUrl();
		if (url.contains(page)) 
		{			
			return true;
		}
		
	}
	return true;
}
}
