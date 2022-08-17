package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver launchChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rocks\\Downloads\\chromedriver.exe" ); 
		WebDriver driver = new ChromeDriver();
		return driver;
		 	
	}
	
    public static WebDriver launchFirefoxBrowser() {
		
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\rocks\\Downloads\\geckodriver.exe" ); 
		WebDriver driver = new FirefoxDriver(); 	
		return driver; 	
	}

}
