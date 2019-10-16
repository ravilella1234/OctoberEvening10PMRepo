package com.launch;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	
	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	public static Properties p;
	
	
	public static void init() throws Exception
	{
		FileInputStream fis=new FileInputStream(projectpath+"//data.properties");
		p=new Properties();
		p.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drive\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",projectpath+"//drivers//chromedriver.exe" );
			driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox")) 
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\drive\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", projectpath+"//drivers//geckodriver.exe" );
			driver=new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(p.getProperty(url));
		
		driver.navigate().to(p.getProperty(url));
		
	}
	

}
