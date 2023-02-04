package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import baseClasses.baseClass;
import pomClasses.HomePage;
import utilClasses.UtilClass;

public class VerifyUserCanHaveListOfOptions extends UtilClass{
	WebDriver driver;
	HomePage hp;
	ExtentHtmlReporter htmlreporter;
	ExtentTest test;
	ExtentReports reports;
	@BeforeClass
	public void beforeclass() {
		driver = baseClass.getDriver();
	}
	
	@BeforeMethod
	public void beforemethod() {
		hp = new HomePage(driver);
		htmlreporter = new ExtentHtmlReporter("ExtentReports.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
		test = reports.createTest("VerifyUserCanHaveListOfOptions");
	}

	@Test 
	public void VerifyUserCanHaveListOfOptions() throws InterruptedException {
		hp.getLogo();
		hp.getAllOptions();
	}
	
	@AfterMethod
	public void aftermethod(ITestResult result) {
		getReports(result, test);
		
	}
	
	@AfterClass
	public void afterclass() {
		reports.flush();
		driver.close();
	}
	
	
}
