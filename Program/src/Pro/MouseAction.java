package Pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rocks\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		WebElement as = driver.findElement(By.xpath("//a[contains(@id , 'nav-link-accountList')]"));
		
		WebElement order = driver.findElement(By.xpath("//span[text() = 'Your Orders']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1800)"); // scroll down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1800)"); // scroll up
		// js.executeScript("window.scrollBy(1800,0)");  // scroll right
		// js.executeScript("window.scrollBy(-1800,0)");  // scroll left
		
		//Actions a = new Actions(driver);
		
	//	a.moveToElement(as).perform();
	//	a.moveToElement(order).click().build().perform();
		
		//a.moveToElement(as).moveToElement(order).click().build().perform();
		
		//a.click(); // Left click
		//a.doubleClick(); // Left double click
		//a.contextClick(); // Right click
		//a.moveToElement(Traget); // Move to target element
		//a.dragAndDrop(source, target); // drag and drop
		
		//a.build(); // To combine the 2 or more action in same line
		//a.perform(); // To perform the mouse action on browser
		
		
	}
	

}
