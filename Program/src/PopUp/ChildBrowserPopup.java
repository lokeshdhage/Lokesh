package PopUp;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	
	public static void main(String[] args) throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rocks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement alert = driver.findElement(By.xpath("(//a[text() = 'Try it Yourself »'])[1]"));
		
		alert.click();
		
		// how to handle child browser popup
		ArrayList<String> ad = new ArrayList<String>( driver.getWindowHandles() );
		driver.switchTo().window( ad.get(1) ); // selenim focus switch to child browser/tab
		//System.out.println( driver.getCurrentUrl() );
		
		WebElement create = driver.findElement(By.xpath("(//a[contains(@class , 'w3-button w3-bar')])[6]"));
		create.click();
		Thread.sleep(3000);
		
		// how to handle child to child
		ArrayList<String> al1 = new ArrayList<String>( driver.getWindowHandles() );
		driver.switchTo().window( al1.get(2));
		driver.close();
		
		//driver.switchTo().window( ad.get(1) );
		driver.switchTo().window( ad.get(0) ); // selenim focus switch to main browser/tab
	}

}
