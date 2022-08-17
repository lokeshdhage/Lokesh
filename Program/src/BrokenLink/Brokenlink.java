package BrokenLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rocks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> list = driver.findElements(By.xpath("//a")); 
		// WebElement f = list.get(0);
		
		int webelement = list.size(); // total no of WebElement present in collection
		
		for(int i = 0; i < webelement; i++)
		{
			WebElement ele = list.get(i);
			String data = ele.getAttribute("href");
			System.out.println(data);
			if(data.equals(""))
			{ 
			    System.out.println("broken link");
			}
			
		}
		
		
	}

}
