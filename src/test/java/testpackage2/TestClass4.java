package testpackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutilities.BaseClass;

public class TestClass4 extends BaseClass {

	@Test 
	public void test1() {
		Reporter.log("test 1 of TestClass4",true);
	}
	
	@Test 
	public void test2() {
		Reporter.log("test 2 of TestClass4",true);
	}
}
