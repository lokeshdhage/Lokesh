package PopUp;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowser_concept {
	
	public static void main(String [] args ) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rocks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement alert = driver.findElement(By.xpath("(//a[text() = 'Try it Yourself »'])[1]"));
		WebElement confirm = driver.findElement(By.xpath("(//a[text() = 'Try it Yourself »'])[2]"));
		WebElement prompt = driver.findElement(By.xpath("(//a[text() = 'Try it Yourself »'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[text() = 'Try it Yourself »'])[4]"));
		
		alert.click();
		confirm.click();
		prompt.click();
		line.click();
		
		String mainPage = driver.getWindowHandle(); // String -- Adress of main browser window
		System.out.println(mainPage);
		
//		String mainPage = driver.getWindowHandle(); // String -- Adress of main browser window
//		Set<String> s = driver.getWindowHandles();// set<String> - Adress of main browser + All child browser of main page
		
		ArrayList<String> ad = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(ad.get(0)); // adress print not url
		System.out.println(ad.get(1)); // adress print not url
		System.out.println(ad.get(2)); // adress print not url
		System.out.println(ad.get(3)); // adress print not url
		System.out.println(ad.get(4)); // adress print not url
		
		driver.switchTo().window( ad.get(0) );  // switch selenim focus on other winow
		System.out.println( driver.getCurrentUrl() ); 
		
		driver.switchTo().window( ad.get(1) );  
		System.out.println( driver.getCurrentUrl() );
		
		driver.switchTo().window( ad.get(2) );  
		System.out.println( driver.getCurrentUrl() );
		
		driver.switchTo().window( ad.get(3) );  
		System.out.println( driver.getCurrentUrl() );
		
		driver.switchTo().window( ad.get(4) );  
		System.out.println( driver.getCurrentUrl() );
		
		
		
	}

}
