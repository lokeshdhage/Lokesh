package forloop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenum {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rocks\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		//driver1.navigate().to("https://web.whatsapp.com/");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@aria-label = 'Phone number, username, or email' ]"));
		WebElement pass = driver.findElement(By.xpath("//input[@aria-label = 'Password' ]"));
        WebElement login = driver.findElement(By.xpath("(//div[contains(@ class , 'qF0y9 ')])[3]"));
		
        email.sendKeys("lokeshdk");
        pass.sendKeys("1234456");
        login.click();
        
		
		
	
		
		
	}
	

}
