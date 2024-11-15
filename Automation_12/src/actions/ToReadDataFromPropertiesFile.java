package actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertiesFile 
{
	public static void main(String[] args) throws IOException {
		//step(1): create object for FileInputStream
		FileInputStream fil=new FileInputStream("./TestData/DemoAppSkillary.properties");
		//step(2): create respective file type object
		Properties prop=new Properties();
		//step(3): call read method
		prop.load(fil);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String username = prop.getProperty("username");
		System.out.println(username);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	}

}
