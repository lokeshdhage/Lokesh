package forloop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class launch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rocks\\Downloads\\chromedriver.exe" ); 
//		webdriver.chrome.driver
//		webdriver.gecko.driver
//		webdriver.ie.driver
//		webdriver.opera.driver
		
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to ("https://mvnrepository.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement create = driver.findElement(By.xpath("//a[contains(text() , 'Create New Account')]"));
		
		create.click();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label = 'Day']"));
		
		
		//Actions act = new Actions(driver);
		
		
		Select s = new Select(day);
		
		//s.selectByIndex(9);
		s.selectByValue("19");
		//s.selectByVisibleText("10");
		
	
		
	
	
	}

}
