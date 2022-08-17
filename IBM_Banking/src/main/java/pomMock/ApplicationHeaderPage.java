package pomMock;

import org.apache.commons.math3.exception.util.ExceptionContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeaderPage {
	
	@FindBy (xpath = "//a[@class='content tt_selected selected']")
	private WebElement timeTrack;
	
	@FindBy (xpath = "(//a[@style='border-width: 0'])[1]")
	private WebElement task;
	
	@FindBy (xpath = "//a[@class='content reports']")
	private WebElement report;
	
	@FindBy (xpath = "(//a[@style='border-width: 0'])[3]")
	private WebElement user;
	
	@FindBy (xpath = "//a[@class='content calendar']")
	private WebElement WorkSchedule;
	
	@FindBy (xpath = "//a[@id='logoutLink']")
	private WebElement logout;
	
	@FindBy (xpath = "tfhdf")
	private WebElement yourvideo;
	
	@FindBy (xpath = "tfhdf")
	private WebElement day;
	
	private WebDriver driver;
	private WebDriverWait wait;
	

	public ApplicationHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);  // this wait is for all method 
	}
	
	
	public void openTimeTrackPage() {
		wait.until(ExpectedConditions.visibilityOf(timeTrack));
		timeTrack.click();
	}
	
	public void openTaskPage() {
	
		wait.until(ExpectedConditions.visibilityOf(task));
		task.click();
		Actions a = new Actions(driver);
		a.contextClick();
		Select s = new Select(day);
		s.selectByIndex(0);
		s.selectByValue(null);
		s.selectByVisibleText(null);
		
	}
	
	public void openReportPage() {
		wait.until(ExpectedConditions.visibilityOf(report));
		report.click();
	}
	
	public void openUserPage() {
		wait.until(ExpectedConditions.visibilityOf(user));
		user.click();
	}
	
	public void logoutPage() {
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
	}

}
