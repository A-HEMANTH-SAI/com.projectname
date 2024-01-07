package testpackage1;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutilities.BaseClass;


public class TestClass1 extends BaseClass{
	
	@Test (groups="smoke")
	public void test1() {
		Reporter.log("test 1 of TestClass1",true);
		Assert.fail();
		Reporter.log("After assert fail");
	}
	
	@Test(groups="regression")
	public void test2() {
		Reporter.log("test 2 of TestClass1",true);
		
	}
}
