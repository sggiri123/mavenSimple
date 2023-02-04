package extentPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import baseClasses.baseTest;
public class Test1 extends baseTest{
	
	@Test
	public void functionality1test1() {
       test = reports.createTest("functionality1test1");
        Assert.assertEquals("Shridhar", "Shridhar");
	}
	
	@Test
	public void functionality1test2() {
       test = reports.createTest("functionality1test2");
        Assert.assertTrue(3<2);
	}

}

