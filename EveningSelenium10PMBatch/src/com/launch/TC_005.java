package com.launch;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005 extends  BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_005");
		
		init();
		test.log(LogStatus.INFO, "Initializing the properties files.......");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opening the browser  :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- "+ p.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		test.log(LogStatus.INFO, "Seleceted the option Books by using the locator :- " + or.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtext_id","HarryPotter");
		test.log(LogStatus.INFO, "Entered the text HarryPotter by using the locator :- " + or.getProperty("amazonsearchtext_id"));
		
		elementClick("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on amazon button by usng the locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		
	
		report.endTest(test);
		report.flush();
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();*/

	}

	

}
