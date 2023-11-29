package testpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutilities.BaseClass;

public class TestClass3 extends BaseClass{
	
	@Test 
	public void test1() {
		Reporter.log("test 1 of TestClass3",true);
	}
	
	@Test 
	public void test2() {
		Reporter.log("test 2 of TestClass3",true);
	}
}
