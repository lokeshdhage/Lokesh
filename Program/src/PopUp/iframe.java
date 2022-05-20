package PopUp;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rocks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
        WebElement alert = driver.findElement(By.xpath("(//a[text() = 'Try it Yourself »'])[1]"));
		
		alert.click();
		
		ArrayList<String> al = new ArrayList<String>( driver.getWindowHandles() );
		driver.switchTo().window( al.get(1) ); // switch to child browser
		Thread.sleep(3000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id = 'iframeResult']"));
		
		driver.switchTo().frame(iframe); // by element
		
//		driver.switchTo().frame("iframeResult"); // by value (id, tagname)
		WebElement tryit = driver.findElement(By.xpath("//button[@onclick = 'myFunction()']"));
		tryit.click(); 
		
//		driver.switchTo().defaultContent(); // agian switch to mainpage or mainframe
//		driver.switchTo().parentFrame();    // again switch to mainpage or mainframe
		
		
		

	}
	
	

}
