package pomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClasses.UtilClass;

public class LoginPage {
	WebDriver driver;
	
	@FindBy (xpath="(//a[@data-nav-role='signin'])[1]")
	private WebElement signIn;
	
	@FindBy (xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueBtn;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signInBtn;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//span[text()='Sign Out']")
	private WebElement signOut;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public void enterEmail(List<String> testdataList) {
		email.sendKeys(testdataList.get(0));
	}
	
	public void clickOnContinueBtn() {
		continueBtn.click();
	}

	public void enterPassword(List<String> testdataList) {
		password.sendKeys(testdataList.get(1));

	}
	
	public void clickOnSigninBtn() {
		
		signInBtn.click();
	}
	
	public void clickOnSignOut() {
		UtilClass.moveToElement(driver, signIn);
		UtilClass.moveToElement(driver, signOut);
		signOut.click();
	}
	
	
	
}
