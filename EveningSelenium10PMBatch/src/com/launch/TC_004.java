package com.launch;

public class TC_004 extends  BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropdown_id","Books");
		
		typeText("amazonsearchtext_id","HarryPotter");
		
		elementClick("amazonsearchbutton_xpath");
		
	
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();*/

	}

	

}
