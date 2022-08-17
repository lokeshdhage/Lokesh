package PackMOCK;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.ApplicationCache;

import pomMock.ApplicationHeaderPage;
import pomMock.LoginPage;

public class TestMock {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rocks\\Downloads\\chromedriver.exe" ); // (browser key and exe path)
		
		WebDriver driver = new ChromeDriver();  // browser launch  due to upcasting object
		
		driver.get("http://localhost/login.do"); // for website link
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 10sec
	
		
		LoginPage loginpage = new LoginPage(driver);
	//	loginpage.sendUserName();
	//	loginpage.sendpasswordName();
		loginpage.clickOnKeepMeLogin();
		loginpage.clickOnLogin();
		
		ApplicationHeaderPage applicationHeaderPage = new ApplicationHeaderPage(driver);
		applicationHeaderPage.openTimeTrackPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("http://localhost/user/submit_tt.do"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		

		if(title.equals("actiTIME -  Enter Time-Track"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		applicationHeaderPage.openTaskPage();
		String url1 = driver.getCurrentUrl();
		String title1 = driver.getTitle();
		
		if(url.equals("http://localhost/tasks/otasklist.do"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		

		if(title.equals("actiTIME -  Open Tasks"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	 }
}
