package Deno;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.agoda.com/en-in/");
	    Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		double hight=size.getHeight();
		double width=size.getWidth();
		System.out.println(hight);
		System.out.println(width);
		driver.quit();
	}

}
