package ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rocks\\Downloads\\chromedriver.exe" ); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=Cj0KCQjwgYSTBhDKARIsAB8KuktsGwvCWRNPVuvRYLMURFxFInmKTm5hOHdVw4DZhyLWSg2mYmRb0WAaAoT0EALw_wcB&gclsrc=aw.ds");
	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement upload = driver.findElement(By.xpath("//button[@class= 'uploadResume resman-btn-primary resman-btn-small']"));
		upload.click();
		upload.sendKeys("C:\\Users\\rocks\\oracal.txt");
	
		
				
		
		System.out.println("file upload");
		
		
	}

	
}
