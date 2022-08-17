package PackMOCK;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.Browser;
import Utili.Utility;
import pomMock.ApplicationHeaderPage;
import pomMock.LoginPage;

public class TestNGPOM extends Browser {

		private WebDriver driver;
		private LoginPage loginpage;
		private ApplicationHeaderPage applicationHeaderPage;
		SoftAssert soft;
		String testID;
		String name;
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
	    
		@BeforeTest
		@Parameters("Browser")
		public void launchBrowser(String browserName) {
			reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
			ExtentReports extend = new ExtentReports();
			extend.attachReporter(reporter);
			System.out.println("launchBrowser");
		
			if(browserName.equals("Chrome")) 
			{
				 driver = launchChromeBrowser();		
			}
			
			if(browserName.equals("Firefox")) 
			{
				driver = launchFirefoxBrowser();	
			}
			
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Implicity wait
		}
		
		@BeforeClass
		public void creatObjectPomClass() {
		    loginpage = new LoginPage(driver);
			applicationHeaderPage = new ApplicationHeaderPage(driver);
		}
		
		@BeforeMethod
		public void loginToApplication() throws InterruptedException, EncryptedDocumentException, IOException {
			String username = Utility.getExcelSheetData("Lokesh", 1, 0);
			String passwor = Utility.getExcelSheetData("Lokesh", 2, 0);
			System.out.println("loginToApplication");
			driver.get("http://localhost/login.do"); 
			
		    
			loginpage.sendUserName(username);
			loginpage.sendpasswordName(passwor);
			loginpage.clickOnKeepMeLogin();
			loginpage.clickOnLogin();
		    Thread.sleep(2000);
		}
		
		@Test
		public void verifyReport() {
			testID = "L103";
			System.out.println("verifyReport");
			applicationHeaderPage.openReportPage();
			String url = driver.getCurrentUrl(); 
			String title = driver.getTitle();
			
			// Actual equal to Expected ==> Test Case PASS
			// Actual Notequal to Expected ==> Test Case FAIL
			Assert.assertEquals(url, "http://localhost/reports/reports.do"); //99% this method is use
			
			// Actual equal to Expected ==> Test Case FAIL
			// Actual Notequal to Expected ==> Test Case PASS
			Assert.assertNotEquals(url , "http://localhost/reports/reports.d");
			
			
		}
		
		@Test
		public void verifyUser() {
			testID = "L104";
		    System.out.println("verifyUser");
			applicationHeaderPage.openUserPage();
			String url = driver.getCurrentUrl();
			String title = driver.getTitle();
			
			if(url.equals("http://localhost/administration/userlist.do"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
			

			if(title.equals("actiTIME -  User List "))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
			
		}
		
		@AfterMethod
		public void Logout() throws IOException {
			Utility.takeScreenshot(driver,testID);
			System.out.println("Logout");
			applicationHeaderPage.logoutPage();
		}
		@AfterClass
		public void clearPomObject() {
			
			loginpage = null;
			applicationHeaderPage = null;
		}
		@AfterTest
		public void closeBrowser() {
			System.out.println("closeBrowser");
			driver.quit();
			driver = null;
			System.gc(); // Delete all object 
		}
	}



