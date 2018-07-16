package com.sivkanth.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sivkanth.selenium.constant.Browser;
import com.sivkanth.selenium.constant.OperatingSystem;

/**
 * 
 * Utility class for launching web browsers. This class also 
 * takes care of setting the driver system property as per the browser and operating system.
 * 
 * @author SivKanth
 * @version 1
 * @since 1.0.0
 *
 */
public class WebDriverUtil {
	
	public static WebDriver getWebDriver(Browser browser) {
		WebDriver webDriver = null;
		if (browser != null) {
			boolean is64Bit = is64BitOs();
			OperatingSystem os = getOperatingSystem();
			
			if (os == null) {
				throw new RuntimeException("Unsupported operating system for this project. [OS = " + os + "].");
			}
			
			switch(browser) {
				case FIREFOX:
					if (os == OperatingSystem.MAC_OS) {
						System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_mac");
					} else if (os == OperatingSystem.WINDOWS) {
						if (is64Bit) {
							System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_64bit.exe");
						} else {
							System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_32bit.exe");
						}						
					} else if (os == OperatingSystem.LINUX) {
						throw new RuntimeException("Linux system property is not set.");
					}
					
					webDriver = new FirefoxDriver();
					
					break;
					
				case CHROME:
					System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_64bit.exe");
					break;
					
				default:
					throw new RuntimeException("Browser = " + browser + " is not handled for this selenium automation project.");
			}
		}
		
		return webDriver;
	}
	
	public static OperatingSystem getOperatingSystem() {
		String osName = System.getProperty("os.name").toLowerCase();
		
		if (osName.contains("mac")) {
			return OperatingSystem.MAC_OS;
		} else if (osName.contains("win")) {
			return OperatingSystem.WINDOWS;
		} else if (osName.contains("linux") || osName.contains("unix")) {
			return OperatingSystem.LINUX;
		}
		
		return null;
	}
	
	public static boolean is64BitOs() {
		String osArchitecture = System.getProperty("os.arch");
		
		return osArchitecture != null && (osArchitecture.contains("64"));
	}
	
}
