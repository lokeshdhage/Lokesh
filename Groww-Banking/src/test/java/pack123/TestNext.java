package pack123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.DashBoard;
import pom.LoginPage;

public class TestNext {
	
		private WebDriver driver ;
	    private DashBoard dashBoard ;
	    private LoginPage login;
		
		@BeforeTest
		@Parameters("browser")
		public void launchBrowser(String browserName) throws InterruptedException
		{
			System.out.println("launchBrowser");
			if(browserName.equals("Chrome"))
			{
			   System.setProperty("webdriver.chrome.driver","C:\\Users\\rocks\\Downloads\\chromedriver.exe");
			   driver = new ChromeDriver();
			}
			if(browserName.equals("Firefox"))
			{
			   System.setProperty("webdriver.gecko.driver","C:\\Users\\rocks\\Downloads\\geckodriver.exe");
			   driver = new FirefoxDriver();
			}
			
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		}
		
		@BeforeClass
		public void createObjectOfPomClasses()
		{
		    login = new LoginPage(driver);
			dashBoard = new DashBoard(driver);
		}
	    
	    @BeforeMethod
	   	public void loginToApplica() throws InterruptedException
	   	{
	    	System.out.println("loginToApplica");
	    	driver.get("https://www.primeabgb.com/my-account/");
	    	
	    	login.sendUserName();
	    	login.sendpassWord();
	    	login.clickLogin();
	        Thread.sleep(2000);
	    }
	    
	    @Test 
	    public void verifyDownload()
	    {
	    	System.out.println("verifyDownload");
	    	dashBoard.ClickDownload();
	    	String url = driver.getCurrentUrl(); 
			String title = driver.getTitle();
			
			Assert.assertEquals(url, "https://www.primeabgb.com/my-account/downloads/");
			Assert.assertEquals(title, "My Account - PrimeABGB.com");
			
			boolean result = url.equals("https://www.primeabgb.com/my-account/downloads/");
			Assert.assertTrue(result);
		}
	    
	    @Test 
	    public void verifyAddresses()
	    {
	    	System.out.println("verifyAddresses");
	    	dashBoard.clickAddresses();
	    	String url = driver.getCurrentUrl(); 
			String title = driver.getTitle();
			
			Assert.assertEquals(url, "https://www.primeabgb.com/my-account/edit-address/");
			Assert.assertEquals(title, "My Account - PrimeABGB.com");
			
			boolean result = url.equals("https://www.primeabgb.com/my-account/edit-address/");
			Assert.assertTrue(result);
	    	
	    }
	    

	   
	    @AfterMethod
	   	public void Logout()
	   	{
	    	System.out.println("Logout");
	    	dashBoard.clickLogout();
	   	}
	    
	    @AfterClass
	   	public void closeBrowser()
	   	{
	    	login = null;
	    	dashBoard = null;
	   	}
	    
	    @AfterTest
	    public void closedBrowser()
	    {
	    	System.out.println("closedBrowser");
	    	driver.quit();
	    	driver = null;
	    	
	    	System.gc();
	    }


}
