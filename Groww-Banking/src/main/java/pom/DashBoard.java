package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoard {

	@FindBy (xpath = "//a[text() = 'Dashboard']")
	private WebElement dashBoard;
	
	@FindBy (xpath = "//a[text() = 'Orders']")
	private WebElement order;
	
	@FindBy (xpath = "//a[text() = 'Downloads']")
	private WebElement download;
	
	@FindBy (xpath = "//a[text() = 'Addresses']")
	private WebElement addresses;
	
	@FindBy (xpath = "//a[text() = 'Account details']")
	private WebElement accountDetails;
	
	@FindBy (xpath = "//a[text() = 'Logout']")
	private WebElement logout;
	
	private WebDriverWait wait;
	
	public DashBoard(WebDriver driver)
	{
	   PageFactory.initElements(driver,this );
	   wait = new WebDriverWait(driver, 20);
	   
	}
	
	public void clickDashBoard()
	{
		wait.until(ExpectedConditions.visibilityOf(dashBoard));  // Explicit wait apply indivisuval apply
		dashBoard.click();
	}
	
	public void ClickOrder()
	{
		wait.until(ExpectedConditions.visibilityOf(order));  // Explicit wait apply indivisuval apply
		order.click();
	}
	
	public void ClickDownload()
	{
		wait.until(ExpectedConditions.visibilityOf(download));  // Explicit wait apply indivisuval apply
		download.click();
	}
	
	public void clickAddresses()
	{
		wait.until(ExpectedConditions.visibilityOf(addresses));  // Explicit wait apply indivisuval apply
		addresses.click();
	}
	
	public void clickAccountDetails()
	{
		wait.until(ExpectedConditions.visibilityOf(accountDetails));  // Explicit wait apply indivisuval apply
		accountDetails.click();
	}
	
	public void clickLogout()
	{
		wait.until(ExpectedConditions.visibilityOf(logout));  // Explicit wait apply indivisuval apply
		logout.click();
	}
}
