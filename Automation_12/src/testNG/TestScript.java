package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass 
{
	@Test
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		String actuilTitle = driver.getTitle();
		String expetedTitle=workBook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		if (actuilTitle.equals(expetedTitle)) {
			Reporter.log("Book page is displayed",true);
		}else {
			Reporter.log("Book page is not displayed",true);
		}
	}

}
