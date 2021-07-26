package launchingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {
	public static void main(String[] args) {
		System.setProperty("WebDriver.gecko.driver", "/LaunchBrowser/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("Title of the page: "+ title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of page: "+ currentUrl );
		
//		String pageSource = driver.getPageSource();
//		System.out.println("PageSource of the page: "+pageSource);
		
		driver.close();
	}

}
