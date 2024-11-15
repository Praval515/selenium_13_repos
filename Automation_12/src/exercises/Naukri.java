package exercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIpq7-3KH1iAMVawZ7Bx2MRj1PEAAYASAAEgJQu_D_BwE&gclsrc=aw.ds");
		driver.findElement(By.className("textWrap")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\3rahu\\OneDrive\\Desktop\\0_Selenium Document .pdf");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
