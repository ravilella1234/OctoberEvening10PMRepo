package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	
	public static WebDriver driver;
	
	public static void launch(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drive\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\drive\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(url);
	}
	

}
