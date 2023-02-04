package pomClasses;

import java.util.List;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClasses.UtilClass;

public class HomePage extends UtilClass{
	WebDriver driver;
	@FindBy (id="nav-logo-sprites")
	private WebElement logo;
	
	@FindBy (xpath="//a[@class='nav-link nav-item']")
	private List<WebElement> listOfOptions;
	
	@FindBy (id = "nav-link-accountList")
	private WebElement signInButton;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void getLogo() {
		String companyLogo =logo.getText();
		System.out.println(companyLogo);
	}
	
	public void getAllOptions() throws InterruptedException {
        
		moveToElement(driver, signInButton);
		Thread.sleep(1000);
		
		//System.out.println(listOfOptions);
		
	}
 
}
