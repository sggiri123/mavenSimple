package testClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.ISuiteResult;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import baseClasses.baseClass;
import pomClasses.LoginPage;
import utilClasses.UtilClass;

public class VerifyUserCanLogin extends UtilClass{
	WebDriver driver;
	LoginPage lp;
	
	ExtentHtmlReporter htmlreporter;
	ExtentTest test1;
	ExtentReports reports;
	@BeforeClass
	public void beforeclass() {
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		driver = baseClass.getDriver();
		lp= new LoginPage(driver);
		htmlreporter = new ExtentHtmlReporter("ExtentReports.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
		test1 = reports.createTest("VerifyUserCanLogin");
			
	}
	
	@DataProvider(name ="TestData")
	public String[][] getdata(){
		String [][] testdata= {{"9665365300", "Shri4474#"}};
		return testdata;
	}
	
	@Test (dataProvider= "TestData")
	public void VerifyUserCanLogin(String email, String Password){
		List<String> testdataList = new ArrayList<>(Arrays.asList(email, Password));
		lp.clickOnSignIn();
		lp.enterEmail(testdataList);
		lp.clickOnContinueBtn();
		lp.enterPassword(testdataList);
		lp.clickOnSigninBtn();
		
		
	}
	
	@AfterMethod
	public void aftermethod(ITestResult result) {
		
		getReports(result, test1);
		
	}
	
	@AfterClass
	public void afterclass() {
		reports.flush();	
	}
}
