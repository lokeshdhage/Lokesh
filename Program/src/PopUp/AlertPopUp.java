package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\rocks\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    
	    WebElement submit = driver.findElement(By.xpath("//input[@name = 'submit']")); 
	    
	    submit.click();
	    
	    Alert al = driver.switchTo().alert(); 
//	    String text = al.getText();
//	    System.out.println(text);
	    al.accept(); // to click on OK, YES, Continue, Accept. Submit
	     
	    Alert al1 = driver.switchTo().alert();
	    al1.accept();
	  
//	    al.dismiss(); // to click on No, Cancel, Dismiss
//	    al.getText(); // to get text present on alert popup
//	    al.sendKeys("hi"); // to send data/text on alert popup 
	}

}
