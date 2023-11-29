package testpackage1;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutilities.BaseClass;

@Listeners(genericutilities.ListenersImpl.class)
public class TestClass1 extends BaseClass{
	
	@Test 
	public void test1() {
		
		Reporter.log("test 1 of TestClass1",true);
		
		
	}
	
	@Test
	public void test2() {
		Reporter.log("test 2 of TestClass1",true);
		
	}
}
