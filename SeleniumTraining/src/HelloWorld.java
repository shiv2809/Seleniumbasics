import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelloWorld
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");

		System.out.println("akjsdhfsa");
		
		//loading the web driver into system property
		System.setProperty("webdriver.gecko.driver", "web_drivers/geckodriver_64bit.exe");

		//launches Firefox web browser
		WebDriver webDriver = new FirefoxDriver();
		
		//navigate().to() is loading the web page
		webDriver.navigate().to("http://www.google.com");
		
		
		System.setProperty("webdriver.chrome.driver", "web_drivers/chromedriver.exe");
		WebDriver chromeBrowser = new ChromeDriver();
		chromeBrowser.get("https://news.google.com/");
		
		WebDriver ieBrowser = new InternetExplorerDriver();
	}
}