package com.sivkanth.selenium.automation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TdBankLoginAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_64bit.exe");
		
		//Step 1: Launch firefox web browser
		WebDriver firefoxBrowser = new FirefoxDriver();
		
		//Step 2: Navigate to https://www.google.com
		firefoxBrowser.navigate().to("https://www.td.com/ca/en/personal-banking/");
		
		List<WebElement> loginButtons = firefoxBrowser.findElements(By.className("loginout"));
		System.out.println("Number of Login Buttons found => " + loginButtons.size());
		
		WebElement easyWebLoginButton = null;
		WebElement webBrokerLoginButton = null;
		
		for (int i = 0; i < loginButtons.size(); i++) 
		{
			WebElement loginButton = loginButtons.get(i);
			String onClickAttrValue = loginButton.getAttribute("onclick");
			
			if (onClickAttrValue != null) {
				if (onClickAttrValue.contains("https://easyweb.td.com")) {
					easyWebLoginButton = loginButton;
				} else if (onClickAttrValue.contains("https://webbroker.td.com/")) {
					webBrokerLoginButton = loginButton;
				}
			}
		}
		
		easyWebLoginButton.click();
		firefoxBrowser.navigate().back();
		firefoxBrowser.navigate().back();
		
		easyWebLoginButton = null;
		webBrokerLoginButton = null;
		loginButtons = firefoxBrowser.findElements(By.className("loginout"));
		
		for (int i = 0; i < loginButtons.size(); i++) 
		{
			WebElement loginButton = loginButtons.get(i);
			String onClickAttrValue = loginButton.getAttribute("onclick");
			
			if (onClickAttrValue != null) {
				if (onClickAttrValue.contains("https://easyweb.td.com")) {
					easyWebLoginButton = loginButton;
				} else if (onClickAttrValue.contains("https://webbroker.td.com/")) {
					webBrokerLoginButton = loginButton;
				}
			}
		}
		
		webBrokerLoginButton.click();

	}

}
