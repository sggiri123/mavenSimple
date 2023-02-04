package utilClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class UtilClass {

	public static void moveToElement(WebDriver driver, WebElement element) {
		
		Actions act = new Actions(driver);
		act.moveToElement(element);	
	}
	
	public static void getReports(ITestResult result, ExtentTest test) {
		
		if (result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName()+"Test is passed");
		}
		else {
			test.log(Status.FAIL, result.getName()+"Test is failed");
		}
	
	}
	
}
