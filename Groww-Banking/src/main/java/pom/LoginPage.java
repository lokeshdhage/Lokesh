package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy (xpath = "(//span[text() = 'Sign In'])[1]")
	private WebElement signup ;
	
	@FindBy (xpath = "(//input[@type = 'text'])[1]")
	private WebElement userName;
	
	@FindBy (xpath = "(//input[@type = 'password'])[1]")
	private WebElement passWord;
	
	@FindBy (xpath = "//button[text() = 'Log in']")
	private WebElement logIn;
	
	private WebDriverWait wait;
	private WebDriver driver;
	
	   public LoginPage(WebDriver driver) 
	{
	   PageFactory.initElements(driver, this);
	   wait = new WebDriverWait(driver, 10);
	   this.driver = driver;
	   
	}
	
	public void clickSignup()
	{
		wait.until(ExpectedConditions.visibilityOf(signup));  // Explicit wait apply indivisuval apply
		signup.click();
	}
	
	public void sendUserName()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);   // only this method we apply 30sec wait
		wait.until(ExpectedConditions.visibilityOf(userName));  // Explicit wait apply indivisuval apply
		userName.sendKeys("lokeshdk92@gmail.com");
	}
	
	public void sendpassWord()
	{
		wait.until(ExpectedConditions.visibilityOf(passWord));  // Explicit wait apply indivisuval apply
		passWord.sendKeys("Adipo20nov");
	}
	
	public void clickLogin()
	{
		wait.until(ExpectedConditions.visibilityOf(logIn));  // Explicit wait apply indivisuval apply
		logIn.click();
	}
	

	
	
}
