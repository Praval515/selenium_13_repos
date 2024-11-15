package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.script.RealmType;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary 
{
	@FindBy(id = "navbar-search-input")
	private WebElement searchTextfield;
	
	public Skillrary(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSearchTextfield() {
		return searchTextfield;
	}
	

}
