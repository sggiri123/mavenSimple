package extentPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClasses.baseTest;

public class Test2 extends baseTest{

	@Test
	public void functionality2test1() {
       test = reports.createTest("functionality2test1");
        Assert.assertEquals("Shridhar", "ShridharGiri");
	}
	
	@Test
	public void functionality2test2() {
       test = reports.createTest("functionality2test2");
        Assert.assertEquals("Shridhar", "ShridharGiri");
	}
	
	
	
}
