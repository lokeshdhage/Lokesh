package pack123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.DashBoard;
import pom.LoginPage;

public class testClass {
	
     public static void main(String[] args) throws InterruptedException   {
	
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\rocks\\Downloads\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.primeabgb.com/my-account/");
	   Thread.sleep(5000);
	   
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit Wait 20 sec
	   
	   LoginPage loginPage = new LoginPage(driver);
	   loginPage.clickSignup();
	   loginPage.sendUserName();
	   loginPage.sendpassWord();
	   loginPage.clickLogin();
	   
	   DashBoard D = new DashBoard(driver);
	   D.clickDashBoard();
	   String url = driver.getCurrentUrl();
	   String title = driver.getTitle();
	   
	   if(url.equals("https://www.primeabgb.com/my-account/"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		

		if(title.equals("My Account - PrimeABGB.com"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		   D.ClickOrder();
		   String url1 = driver.getCurrentUrl();
		   String title1 = driver.getTitle();
		   
		   if(url1.equals("https://www.primeabgb.com/my-account/orders/"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
			

			if(title1.equals("My Account - PrimeABGB.com"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
			 D.clickLogout();
	  
  }
}
