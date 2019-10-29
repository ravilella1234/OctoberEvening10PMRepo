package com.launch;

import org.apache.log4j.Logger;

public class TC_004 extends  BaseTest
{
	
	private static final Logger log=Logger.getLogger(TC_004.class.getName());
	

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Initializing the properties files.......");
		
		launch("chromebrowser");
		log.info("Opening the browser  :- " + p.getProperty("chromebrowser") );
		
		navigateUrl("amazonurl");
		log.info("Navigated to url :- "+ p.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		log.info("Seleceted the option Books by using the locator :- " + or.getProperty("amazondropdown_id") );
		
		typeText("amazonsearchtext_id","HarryPotter");
		log.info("Entered the text HarryPotter by using the locator :- " + or.getProperty("amazonsearchtext_id"));
		
		elementClick("amazonsearchbutton_xpath");
		log.info("Clicked on amazon button by usng the locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		
	
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();*/

	}

	

}
