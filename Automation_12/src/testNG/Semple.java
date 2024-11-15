package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Semple //TestNG class
{
	@Test
	public void add()//Test case
	{
		//Test script
		Reporter.log("add block",true);
	}
	@Test
	public void semple()//Test case
	{
		//Test script
		Reporter.log("semple block",true);
	}
	@Test
	public void raj() //Test case
	{
		//Test script
		Reporter.log("raj block",true);
	}

}
