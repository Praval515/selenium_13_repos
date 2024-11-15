package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ToLearnMoveToElement 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=dms_bing_cpc&utm_campaign=dms_bing_Brand_Exact_Desktop&utm_adgroup=Myntra_Generic&keyword=myntra%2F&matchtype=e&utm_source=bing&msclkid=c558f32c16e014b1491d95d659841f57&utm_term=myntra%2F&utm_content=Myntra_Generic");
		WebElement menLink = driver.findElement(By.partialLinkText("MEN"));
		
		Actions act=new Actions(driver);
		act.moveToElement(menLink).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Jeans")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
