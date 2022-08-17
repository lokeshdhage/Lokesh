package pomMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy (xpath = "//input[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@name='remember']")
	private WebElement KeepMeLoginCheckBox;
	
	@FindBy (xpath = "//a[@id='loginButton']")
    private WebElement login;
	
	private WebDriverWait wait;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver,10);  // 10 sec
	}
	
	public void sendUserName(String username) {
	 
		 
		wait.until(ExpectedConditions.visibilityOf(userName)); // Explicity wait
		userName.sendKeys(username);
	}
	
	public void sendpasswordName(String passwor) {
		
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(passwor);
	}
	
	public void clickOnKeepMeLogin() {
		
		wait.until(ExpectedConditions.visibilityOf(KeepMeLoginCheckBox)); // Explicity wait
		if( !(KeepMeLoginCheckBox.isSelected()) ) // ! = not opreator
		{
			KeepMeLoginCheckBox.click();
		}
		else
		{
			System.out.println("Keep Me Login Checkbox Already Selected");
		}
	}
		
	public void clickOnLogin() {
		wait.until(ExpectedConditions.visibilityOf(login)); // Explicity wait
		login.click();
	}

	
	
	
	

}
