package baseClasses;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class baseTest {
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest test;
	public static ExtentReports reports;
	
	@BeforeSuite
	public void beforesuite() {
		htmlreporter = new ExtentHtmlReporter("ExtentReports.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlreporter);
		
	}
	
	@AfterMethod
	public void aftermethod(ITestResult result) {
		if (result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName()+" Test is passed");
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getName()+"Test is failed");
		}
		
		else {
			test.log(Status.SKIP, result.getName()+"Test is skipped");
		}
	}
	
	@AfterSuite
	public void aftersuite() {
		reports.flush();
		
	}
	

}
