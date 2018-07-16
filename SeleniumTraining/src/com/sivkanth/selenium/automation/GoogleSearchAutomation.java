package com.sivkanth.selenium.automation;

/**
 * 
 * To automate google search
 * 
 * 1. Launch firefox web browser
 * 2. Navigate to https://www.google.com
 * 3. Locate the search input web element.
 * 4. Enter keyword/search text
 * 5. Press 'Enter' 
 * 
 * @author abhinav
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchAutomation {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_64bit.exe");
		
		//Step 1: Launch firefox web browser
		WebDriver firefoxBrowser = new FirefoxDriver();
		
		//Step 2: Navigate to https://www.google.com
		firefoxBrowser.navigate().to("https://www.google.com");
		
		//Step 3. Locate the search input web element.
		WebElement searchTextWebElement = firefoxBrowser.findElement(By.id("lst-ib"));
		
		//Step 4. Enter keyword/search text
		searchTextWebElement.sendKeys("Microsoft News");
		
		//Step 5. Press 'Enter'
		searchTextWebElement.submit();
		
		

	}

}
