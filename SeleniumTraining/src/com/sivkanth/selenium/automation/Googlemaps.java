package com.sivkanth.selenium.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlemaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_64bit.exe");
		
		//Step 1: Launch firefox web browser
		WebDriver firefoxBrowser = new FirefoxDriver();
		
		//Step 2: Navigate to https://www.google.com
		firefoxBrowser.navigate().to("https://www.google.com/maps/");
		
		WebElement searchTextWebElement = firefoxBrowser.findElement(By.id("searchbox-directions"));
		
		searchTextWebElement.click();
		//searchTextWebElement.sendKeys("Parliament Hill, Ottawa");
		
		//Step 5. Press 'Enter'
		
		//searchTextWebElement.submit();
		
	
	}

	
}
