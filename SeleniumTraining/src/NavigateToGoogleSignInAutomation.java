import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToGoogleSignInAutomation {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_64bit.exe");
		
		//Step 1: Launch firefox web browser
		WebDriver firefoxBrowser = new FirefoxDriver();
		
		//Step 2: Navigate tohttps://www.news.google.com
		firefoxBrowser.navigate().to("https://www.google.com");
		
		WebElement link = firefoxBrowser.findElement(By.linkText("Sign in"));
		link.click();
		

	}

}
