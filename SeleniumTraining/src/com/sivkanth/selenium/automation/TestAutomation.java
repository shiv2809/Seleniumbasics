package com.sivkanth.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sivkanth.selenium.constant.Browser;
import com.sivkanth.selenium.util.WebDriverUtil;

public class TestAutomation {

	public static void main(String[] args) {
		
		WebDriver webDriver = WebDriverUtil.getWebDriver(Browser.FIREFOX);
		
		webDriver.navigate().to("https://maps.google.com/");
		
		WebElement searchTextWebElement = webDriver.findElement(By.id("searchboxinput"));
		searchTextWebElement.sendKeys("Ottawa");
		searchTextWebElement.sendKeys("\n");

	}

}
