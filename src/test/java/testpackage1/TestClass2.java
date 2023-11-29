package testpackage1;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutilities.BaseClass;

public class TestClass2 extends BaseClass{
	

	@Test (groups="smoke")
	public void test1() {
		Reporter.log("test 1 of TestClass2",true);
	}
	
	@Test(groups="regression")
	public void test2() {
		Reporter.log("test 2 of TestClass2",true);
	}

}
